import kotlin.system.exitProcess

fun main() {
    val pizzaPeter = PizzaPeter(
        175.0, 241.5,
        167.5, 215.0
    )

    val pizzaMoscow = PizzaMoscow(
        215.0, 250.5,
        180.5, 240.0
    )

    val pizzaEkat = PizzaEkat(
        145.0, 236.5,
        140.5, 200.5
    )
    var currentPizzaCity: PizzaCity

    while (true) {
        println("\nДобрый день! Укажите ваш город")
        println("1. Москва\n2. Санкт-Петербург\n3. Екатеринбург\n0. Выход из программы")
        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "3" -> pizzaEkat
            "0" ->break
            else -> {
                println("ERROR")
               continue
            }
        }
        println("Выберите пиццу:")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца\n\n0. Показать статистику")
        selectPizza(currentPizzaCity)
    }
}

private fun selectPizza(currentPizzaCity: PizzaCity) {
    when (readln()) {
        "1" -> {
            selectAddService(currentPizzaCity)
            currentPizzaCity.neapolitanPizzaSale()
        }

        "2" -> {
            selectAddService(currentPizzaCity)
            currentPizzaCity.romanPizzaSale()
        }

        "3" -> {
            selectAddService(currentPizzaCity)
            currentPizzaCity.sicilianPizzaSale()
        }

        "4" -> {
            selectAddService(currentPizzaCity)
            currentPizzaCity.tyroleanPizzaSale()
        }

        "0" -> currentPizzaCity.showStatistics()
        else -> {
            println("ERROR")
            exitProcess(1)
        }

    }
}

fun selectAddService(currentPizzaCity: PizzaCity)
{
    when(currentPizzaCity)
    {
        is CheckPhoto ->currentPizzaCity.showCheckPhoto()
        is Drink -> currentPizzaCity.drinkSale()
        is ServicesEkat -> {
            currentPizzaCity.addingSauce()
            currentPizzaCity.showCheckPhotoEkat()
            currentPizzaCity.drinkSaleEkat()
        }
    }
}