package factory.pizzastore.methodNabstract

import factory.pizzastore.model.pizza.*
import java.security.InvalidParameterException

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        val pizzaIngredient: PizzaIngredientFactory = NYPizzaIngredientFactory()

        var pizza: Pizza = when (type) {
            "cheese" -> NYStyleCheesePizza(pizzaIngredient)
            "veggie" -> NYStyleVeggiePizza(pizzaIngredient)
            "clam" -> NYStyleClamPizza(pizzaIngredient)
            "pepperoni" -> NYStylePepporoniPizza(pizzaIngredient)
            else -> throw InvalidParameterException("Invalid parameter type")
        }

        return pizza
    }
}