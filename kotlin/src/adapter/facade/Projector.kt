package adapter.facade

class Projector(val dvdPlayer: DvdPlayer) {
    fun on() {
        println("Projector On")
    }

    fun off() {
        println("Projector Off")
    }

    fun tvModel() {
        println("Projector TvModel")
    }

    fun wideScreenMode() {
        println("Projector WideScreenMode")
    }
}