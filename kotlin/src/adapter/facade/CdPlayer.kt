package adapter.facade

class CdPlayer {
    var amp: Amplifier? = null

    fun on() {
        println("DvdPlayer On")
    }

    fun off() {
        println("DvdPlayer Off")
    }

    fun eject() {
        println("CdPlayer Eject")
    }

    fun pause() {
        println("CdPlayer Pause")
    }

    fun play() {
        println("CdPlayer Play")
    }

    fun stop() {
        println("CdPlayer Stop")
    }
}