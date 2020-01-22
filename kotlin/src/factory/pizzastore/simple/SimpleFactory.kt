package factory.pizzastore.simple

import factory.pizzastore.model.pizza.*
import java.security.InvalidParameterException

class SimpleFactory {
    fun createPizza(type: String): Pizza {
        var pizza: Pizza = when(type) {
//            "cheese" -> CheesePizza()
//            "pepperoni" -> PepperoniPizza()
//            "clam" -> ClamPizza()
//            "veggie" -> VeggiePizza()
            else -> throw InvalidParameterException("invalid pizza type")
        }

        return pizza
    }

}