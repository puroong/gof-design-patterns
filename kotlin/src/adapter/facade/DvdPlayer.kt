package adapter.facade

class DvdPlayer {
    var amp: Amplifier? = null

    fun on() {
        println("DvdPlayer On")
    }

    fun off() {
        println("DvdPlayer Off")
    }

    fun eject() {
        println("DvdPlayer Eject")
    }

    fun pause() {
        println("DvdPlayer Pause")
    }

    fun play() {
        println("DvdPlayer Play")
    }

    fun setSurroundAudio() {
        println("DvdPlayer SetSurroundAudio")
    }

    fun setTwoChannelAudio() {
        println("DvdPlayer SetTwoChannelAudio")
    }

    fun stop() {
        println("DvdPlayer Stop")
    }
}