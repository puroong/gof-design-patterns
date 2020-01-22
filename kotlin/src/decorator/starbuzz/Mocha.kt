package decorator.starbuzz

class Mocha(val beverage: Beverage) : CondimentDecorator() {
    override val description: String = "${beverage.description}, Mocha"

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}