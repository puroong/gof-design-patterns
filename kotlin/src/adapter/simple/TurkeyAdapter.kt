package adapter.simple

import adapter.simple.Duck
import adapter.simple.Turkey

class TurkeyAdapter(val turkey: Turkey) : Duck {
    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        for(i in 1..5)
            turkey.fly()
    }
}