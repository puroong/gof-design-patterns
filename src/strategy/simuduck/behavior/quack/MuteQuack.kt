package strategy.simuduck.behavior.quack

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("mute quack")
    }
}