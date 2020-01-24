package compound

class QuackCounter(val duck: Quackable) : Quackable {
    companion object {
        @JvmStatic
        var numberOfQuacks: Int = 0
    }

    override fun quack() {
        duck.quack()
        numberOfQuacks++
    }
}