package template.codingbarista

class Coffee : CaffeineBeverage() {
    override fun brew() {
        println("Drippping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }
}