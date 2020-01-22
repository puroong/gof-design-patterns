package decorator.starbuzz

fun main() {
    val beverage: Beverage = Espresso()
    println("${beverage.description} $${beverage.cost()}")

    var beverage2: Beverage = HouseBlend()
    beverage2 = Mocha(HouseBlend())
    println("${beverage2.description} $${beverage2.cost()}")
}