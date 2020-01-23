package composite

class MenuItem(var name: String,
               var description: String,
               var vegeterian: Boolean,
               var price: Double
) : MenuComponent() {
    override fun isVegeterian(): Boolean {
        return vegeterian
    }

    override fun print() {
        println(" $name")
        if(isVegeterian()) {
            println("(V)")
        }
        println(", $price   -- $description")
    }

    override fun createIterator(): Iterator<MenuComponent> {
        return NullIterator()
    }
}