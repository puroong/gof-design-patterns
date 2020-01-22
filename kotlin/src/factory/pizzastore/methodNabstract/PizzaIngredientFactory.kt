package factory.pizzastore.methodNabstract

import factory.pizzastore.model.cheese.Cheese
import factory.pizzastore.model.clams.Clams
import factory.pizzastore.model.dough.Dough
import factory.pizzastore.model.pepperoni.Pepperoni
import factory.pizzastore.model.sauce.Sauce
import factory.pizzastore.model.veggie.Veggie

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<out Veggie>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}