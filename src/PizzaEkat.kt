class PizzaEkat(neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
                sicilianPizzaPrice:Double, tyroleanPizzaPrice:Double
) : PizzaCity(neapolitanPizzaPrice,romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice), ServicesEkat
{

    override fun drinkSaleEkat()
    {
        println("Вы будете кофе?")
        println("1. Да\nЛюбой другой символ: Нет")
        print("Ваш выбор: ")
        if(readln()=="1")
        {
            println("С вас 200 рублей")
            CountOfCoffeeEkat++
            SumOfCoffeeEkat+=200
        }
        else
        {
            CountOfNoCoffeeEkat++
        }

    }

    override fun showCheckPhotoEkat()
    {
        println("У вас есть фотография чека?")
        println("1. Да\nЛюбой другой символ: Нет")
        print("Ваш выбор: ")
        if(readln()=="1")
        {
            println("Вам будет предоставлена скидка 50 рублей с покупки")
            SumOfSaleEkat+=50
            CountOfChecksEkat++
        }
        else
        {
            CountOfNoCheksEkat++
        }

    }


    override fun addingSauce()
    {
        println("Вам добавить соус к пицце?")
        println("1. Да, добавить соус Барбекю\n" +
                "2. Да, добавить Сырный соус\n" +
                "Любой другой символ: Нет")
        print("Ваш выбор: ")
        var choice = readln()
        if (choice == "1")//соус Барбекю
        {
            println("С вас 45 рублей")
            CountBbqSauce++
            SumBbqSauce+=45
        }
        else if (choice == "2")
        {
            println("С вас 55 рублей")
            CountCheeseSauce++
            SumCheeseSauce+=55
        }
        else
        {
            CountOfNoSauceEkat++
        }
    }



    override fun neapolitanPizzaSale()
    {
        PizzaEkaterinburg = 1
        neapolitanPizzaCount++
        if (CountOfCoffeeEkat > 0)
        {
            neapolitanPizzaWCoffee++
        }
        println("Спасибо за покупку неаполитанской пиццы в Екатеринбурге")
    }

    override fun romanPizzaSale()
    {
        PizzaEkaterinburg = 1
        romanPizzaCount++
        if (CountOfCoffeeEkat > 0)
        {
            romanPizzaWCoffee++
        }
        println("Спасибо за покупку римской пиццы в Екатеринбурге")
    }

    override fun sicilianPizzaSale()
    {
        PizzaEkaterinburg = 1
        sicilianPizzaCount++
        if (CountOfCoffeeEkat > 0)
        {
            sicilianPizzaWCoffee++
        }
       println("Спасибо за покупку сицилийской пиццы в Екатеринбурге")
    }

    override fun tyroleanPizzaSale()
    {
        PizzaEkaterinburg = 1
        tyropleanPizzaCount++
        if (CountOfCoffeeEkat > 0)
        {
            tyroleanPizzaWCoffee++
        }
        println("Спасибо за покупку тирольской пиццы в Екатеринбурге")
    }
}