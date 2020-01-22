package factory.pizzastore.methodNabstract

import factory.pizzastore.model.pizza.Pizza

abstract class PizzaStore {
    fun orderPizza(type: String): Pizza {
        var pizza: Pizza

        pizza = createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    protected abstract fun createPizza(type: String): Pizza
}