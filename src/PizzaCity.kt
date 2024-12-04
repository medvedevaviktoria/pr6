import java.util.IntSummaryStatistics
import kotlin.math.max


abstract class PizzaCity( val neapolitanPizzaPrice:Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice:Double, val tyroleanPizzaPrice:Double)
{
   var neapolitanPizzaCount=0
   var romanPizzaCount=0
   var sicilianPizzaCount=0
   var tyropleanPizzaCount=0

    //Количество показанных чеков и общая сумма скидок
    var SumOfSale : Int = 0
    var CountOfChecks : Int = 0

    //Количество проданных кофе и общая сумма выручки за кофе
    var SumOfCoffee : Int = 0
    var CountOfCoffee : Int = 0

    //Подсчитать в процентном соотношении, сколько человек показывают фотографию чека, а сколько – нет
    var CountOfNoCheks:Int =0

    //Подсчитать в процентном соотношении,сколько человек покупают кофе, а сколько – отказываются.
    var CountOfNoCoffee:Int =0

    //Выводить на экран статистику, показывающую, к какой пицце чаще покупают кофе
    //количество заказов "Пицца+кофе"
    var neapolitanPizzaWCoffee = 0
    var romanPizzaWCoffee = 0
    var sicilianPizzaWCoffee = 0
    var tyroleanPizzaWCoffee = 0


    //ЕКАТЕРИНБУРГ переменные
    var CountBbqSauce = 0 //количество проданных соусов барбекю
    var CountCheeseSauce = 0//количество проданных сырных соусов
    var CountOfNoSauceEkat = 0//количество отказов от соусов
    var SumBbqSauce = 0 // выручка за соус барбекю
    var SumCheeseSauce = 0 // выручка за сырный соус


    //Количество показанных чеков и общая сумма скидок
    var SumOfSaleEkat = 0
    var CountOfChecksEkat = 0

    //Количество проданных кофе и общая сумма выручки за кофе
    var SumOfCoffeeEkat  = 0
    var CountOfCoffeeEkat = 0

    //Подсчитать в процентном соотношении, сколько человек показывают фотографию чека, а сколько – нет
    var CountOfNoCheksEkat = 0

    //Подсчитать в процентном соотношении,сколько человек покупают кофе, а сколько – отказываются.
    var CountOfNoCoffeeEkat =0

    var PizzaEkaterinburg = 0 //переменная, чтобы узнать, что мы покупаем в Екатеринбурге

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()


    //Выводить на экран статистику, показывающую, к какой пицце чаще покупают кофе. Статистику выводить в количественном и процентном видах
    fun StatisticsCoffee(money:Double, CountCoffee:Int,CountNoCoffee:Int, SumCoffee:Int, neapolitanPizzaWCoffee : Int,romanPizzaWCoffee : Int, sicilianPizzaWCoffee : Int, tyroleanPizzaWCoffee : Int)
    {
        println("Количество проданных кофе: $CountCoffee, общая сумма выручки за кофе: $SumCoffee")
        println(
            "Процентное соотношение, сколько человек покупают кофе, а сколько – отказываются. " +
                    "\nПокупают:${(100 * CountCoffee) / (CountCoffee + CountNoCoffee)} %" +
                    "\nОтказывают: ${(100 - (100 * CountCoffee) / (CountCoffee + CountNoCoffee))} %"
        )


        val allPizzasWCoffee = neapolitanPizzaWCoffee + romanPizzaWCoffee + sicilianPizzaWCoffee + tyroleanPizzaWCoffee//сумма всех проданных пицц с кофе
        if (allPizzasWCoffee > 0)
        {
            println("Количество проданных кофе к каждой пицце:\n" +
                    "К неаполитанской пицце: $neapolitanPizzaWCoffee\n" +
                    "В процентах: ${((100*neapolitanPizzaWCoffee)/(allPizzasWCoffee))}\n" +
                    "\nК римской пицце: $romanPizzaWCoffee\n" +
                    "В процентах: ${((100*romanPizzaWCoffee)/(allPizzasWCoffee))}\n" +
                    "\nК сицилийской пицце: $sicilianPizzaWCoffee\n" +
                    "В процентах: ${((100*sicilianPizzaWCoffee)/(allPizzasWCoffee))}\n" +
                    "\nК тирольской пицце $tyroleanPizzaWCoffee\n" +
                    "В процентах: ${((100*tyroleanPizzaWCoffee)/(allPizzasWCoffee))}\n")

            val max = maxOf(neapolitanPizzaWCoffee, romanPizzaWCoffee, sicilianPizzaWCoffee, tyroleanPizzaWCoffee)

            println("Кофе чаще покупают к:")
            if (max == neapolitanPizzaWCoffee) println("Неаполитанской пицце")
            if (max == romanPizzaWCoffee) println("Римской пицце")
            if (max == sicilianPizzaWCoffee) println("Сицилийской пицце")
            if (max == tyropleanPizzaCount) println("Тирольской пицце")
        }


    }

    fun StatisticsChecks(money:Double, CountChecks:Int,CountNoCheks:Int, SumSale:Int)
    {
            println("Количество показанных чеков: $CountChecks, общая сумма скидок: $SumSale")
            println(
                "Процентное соотношение, сколько человек показывают чек , а сколько – нет. " +
                        "\nПоказывают:${(100 * CountChecks) / (CountChecks + CountNoCheks)} %" +
                        "\nНе показывают: ${100 - (100 * CountChecks) / (CountChecks + CountNoCheks)} %"
            )

    }



    fun showStatistics() {
        println("Продано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано тирольской пиццы: $tyropleanPizzaCount")

        val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice + sicilianPizzaCount * sicilianPizzaPrice + tyropleanPizzaCount * tyroleanPizzaPrice

        //САНКТ-ПЕТЕРБУРГ
        //Подсчитать в процентном соотношении, сколько человек покупают кофе, а сколько – отказываются.

        if ((CountOfCoffee == 0)  && (CountOfNoCoffee > 0)&& (PizzaEkaterinburg == 0))
        {
            println("\n-----СТАТИСТИКА ПО КОФЕ-----")
            println("Кофе ни разу не купили")
            println("Выручка по пиццерии: $money р.")
        }
        else if ((CountOfCoffee != 0) && (PizzaEkaterinburg == 0) ) {
            println("\n-----СТАТИСТИКА ПО КОФЕ-----")
            println("Выручка с учетом проданных кофе: ${money + SumOfCoffee} р.")
            StatisticsCoffee(money, CountOfCoffee,CountOfNoCoffee, SumOfCoffee, neapolitanPizzaWCoffee, romanPizzaWCoffee, sicilianPizzaWCoffee, tyroleanPizzaWCoffee)
        }


        //МОСКВА
        //Подсчитать в процентном соотношении, сколько человек показывают фотографию чека, а сколько – нет.

        if ((CountOfChecks == 0) && (CountOfNoCheks > 0) && (PizzaEkaterinburg == 0))
        {
            println("\n-----СТАТИСТИКА ПО ЧЕКАМ-----")
            println("Чек ни разу не показали")
            println("Выручка по пиццерии: $money р.")
        }
        else if ((CountOfChecks != 0) && (PizzaEkaterinburg == 0)  )
        {
            println("\n-----СТАТИСТИКА ПО ЧЕКАМ-----")
            println("Выручка с учетом скидок за чеки: ${money - SumOfSale} р.")
            StatisticsChecks(money, CountOfChecks,CountOfNoCheks, SumOfSale)
        }


        //ЕКАТЕРИНБУРГ

        //В статистику добавить количество проданных соусов и выручку за каждый из видов.
        // Также итоговая сумма по данной пиццерии должна учитывать все скидки и выручку за дополнительные услуги

        //статистика по соусам
        if (PizzaEkaterinburg == 1) println("Выручка по пиццерии с учётом дополнительных услуг: ${money + SumCheeseSauce + SumBbqSauce + SumOfCoffeeEkat - SumOfSaleEkat} р.\n")

        if ((CountOfCoffeeEkat == 0) && (CountOfNoCoffeeEkat > 0) && (CountOfChecks == 0) && (CountOfNoCheks > 0) && (CountCheeseSauce + CountBbqSauce) == 0)
        {
            println("\nДополнительными услугами ни разу не воспользовались")
            println("Выручка по пиццерии: $money р.\n")
        }

        if (((CountCheeseSauce + CountBbqSauce) == 0)  && (PizzaEkaterinburg == 1) )
        {
            println("\n-----СТАТИСТИКА ПО СОУСАМ-----")
            println("Соусы ни разу не покупали")

        }
        else if ((CountCheeseSauce + CountBbqSauce) > 0 )
        {
            println("\n-----СТАТИСТИКА ПО СОУСАМ-----")
            println("Количество проданных сырных соусов: $CountCheeseSauce, сумма выручки: $SumCheeseSauce")
            println("Количество проданных барбекю соусов: $CountBbqSauce, сумма выручки: $SumBbqSauce")

        }
        //статистика по чекам

        if ((CountOfChecksEkat == 0) && (CountOfNoCheksEkat > 0) && (PizzaEkaterinburg == 1))
        {
            println("\n-----СТАТИСТИКА ПО ЧЕКАМ-----")
            println("Чек ни разу не показали")
        }
        else if ((CountOfChecksEkat != 0) && (PizzaEkaterinburg == 1))
        {
            println("\n-----СТАТИСТИКА ПО ЧЕКАМ-----")
            StatisticsChecks(money, CountOfChecksEkat,CountOfNoCheksEkat, SumOfSaleEkat)
        }
        //статистика по кофе

        if ((CountOfCoffeeEkat == 0)  && (PizzaEkaterinburg == 1))
        {
            println("\n-----СТАТИСТИКА ПО КОФЕ-----")
            println("Кофе ни разу не купили")
        }
        else if ((CountOfCoffeeEkat != 0) && (PizzaEkaterinburg == 1)) {
            println("\n-----СТАТИСТИКА ПО КОФЕ-----")
            StatisticsCoffee(money, CountOfCoffeeEkat,CountOfNoCoffeeEkat, SumOfCoffeeEkat, neapolitanPizzaWCoffee, romanPizzaWCoffee, sicilianPizzaWCoffee, tyroleanPizzaWCoffee)
        }
    }
}