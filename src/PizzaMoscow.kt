class PizzaMoscow (neapolitanPizzaPrice: Double,  romanPizzaPrice: Double,
                   sicilianPizzaPrice:Double,  tyroleanPizzaPrice:Double
):PizzaCity(neapolitanPizzaPrice,romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice),CheckPhoto
{

    override fun showCheckPhoto()
    {
        println("У вас есть фотография чека?")
        println("1. Да\nЛюбой другой символ: Нет")
        print("Ваш выбор: ")
        if(readln()=="1")
        {
            println("Вам будет предоставлена скидка 50 рублей с покупки")
            SumOfSale+=50
            CountOfChecks++
        }
        else
        {
            CountOfNoCheks++
        }

    }

    override fun neapolitanPizzaSale()
    {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Москве")
    }

    override fun romanPizzaSale()
    {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Москве")
    }

    override fun sicilianPizzaSale()
    {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Москве")
    }

    override fun tyroleanPizzaSale()
    {
        tyropleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Москве")
    }
}