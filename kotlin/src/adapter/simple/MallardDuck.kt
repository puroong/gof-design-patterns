package adapter.simple

import adapter.simple.Duck

class MallardDuck : Duck {
    override fun quack() {
        println("Quack")
    }

    override fun fly() {
        println("I'm flying")
    }
}