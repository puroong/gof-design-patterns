package decorator.starbuzz

class HouseBlend : Beverage() {
    override val description: String = "House Blend Coffee"

    override fun cost(): Double {
        return .89
    }

}