package decorator.starbuzz

class Espresso : Beverage() {
    override val description: String = "Espresso"

    override fun cost(): Double {
        return 1.99
    }
}