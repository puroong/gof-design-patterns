package adapter.facade

class Amplifier {
    var tuner: Tuner? = null
    var dvdPlayer: DvdPlayer? = null
    var cdPlayer: CdPlayer? = null

    fun on() {
        println("Amplifier On")
    }

    fun off() {
        println("Amplifier Off")
    }

    fun setCd() {
        println("Amplifier SetCd")
    }

    fun setDvd() {
        println("Amplifier SetDvd")
    }

    fun setStereoSound() {
        println("Amplifier SetStereoSound")
    }

    fun setSurroundSound() {
        println("Amplifier SetSurroundSound")
    }

    fun setTuner() {
        println("Amplifier SetTuner")
    }

    fun setVolume() {
        println("Amplifier SetVolume")
    }
}