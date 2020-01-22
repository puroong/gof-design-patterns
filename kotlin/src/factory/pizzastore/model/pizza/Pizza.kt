package factory.pizzastore.model.pizza

import factory.pizzastore.model.cheese.Cheese
import factory.pizzastore.model.clams.Clams
import factory.pizzastore.model.dough.Dough
import factory.pizzastore.model.pepperoni.Pepperoni
import factory.pizzastore.model.sauce.Sauce
import factory.pizzastore.model.veggie.Veggie

abstract class Pizza {
    abstract val name: String
    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: List<Veggie>? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null

    abstract fun prepare()

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }
}