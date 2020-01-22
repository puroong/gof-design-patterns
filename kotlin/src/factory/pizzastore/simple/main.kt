package factory.pizzastore.simple

fun main() {
    val pizzaStore: PizzaStore = PizzaStore(SimpleFactory())

    pizzaStore.orderPizza("veggie")
    pizzaStore.orderPizza("vegg1ie")
}