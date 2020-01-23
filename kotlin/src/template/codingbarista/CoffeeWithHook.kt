package template.codingbarista

import kotlin.random.Random

class CoffeeWithHook : CaffeineBeverage() {
    override fun customerWantsCondiments(): Boolean {
        val answer: String = getUserInput()

        return when {
            answer.toLowerCase().startsWith("y") -> true
            else -> false
        }
    }

    private fun getUserInput(): String {
        return listOf(Random.nextDouble()).map { if(it >= 0.5) { "yes" } else { "no" } }.first()
    }

    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }
}