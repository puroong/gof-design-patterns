package factory.pizzastore.simple

import factory.pizzastore.model.pizza.Pizza

class PizzaStore(val factory: SimpleFactory) {
    fun orderPizza(type: String): Pizza? {
        val pizza: Pizza = factory.createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }
}