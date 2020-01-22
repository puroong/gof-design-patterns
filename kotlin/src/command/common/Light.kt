package command.common

class Light(val name: String) {
    fun on() {
        println("$name Light is On")
    }

    fun off() {
        println("$name Light is Off")
    }
}