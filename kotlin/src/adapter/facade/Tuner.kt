package adapter.facade

class Tuner {
    var amp: Amplifier? = null

    fun on() {
        println("Tuner On")
    }

    fun off() {
        println("Tuner Off")
    }

    fun setAm() {
        println("Tuner SetAm")
    }

    fun setFm() {
        println("Tuner SetFm")
    }

    fun setFrequency() {
        println("Tuner Frequency")
    }
}