package adapter.facade

class HomeTheaterFacade(
    val amp: Amplifier,
    val dvd: DvdPlayer,
    val cd: CdPlayer,
    val projector: Projector,
    val screen: Screen,
    val lights: TheaterLights,
    val popper: PopcornPopper
) {
    fun watchMovie(movie: String) {
        println("Get ready to watch a a movie...")
        popper.on()
        popper.pop()
        lights.dim()
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.setDvd()
        amp.setSurroundSound()
        amp.setVolume()
        dvd.on()
        dvd.play()
    }

    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        dvd.stop()
        dvd.eject()
        dvd.off()
    }
}