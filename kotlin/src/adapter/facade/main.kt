package adapter.facade

fun main() {
    val amp: Amplifier = Amplifier()
    val tuner: Tuner = Tuner()
    val dvd: DvdPlayer = DvdPlayer()
    val cd: CdPlayer = CdPlayer()
    val projector: Projector = Projector(dvd)
    val screen: Screen = Screen()
    val lights: TheaterLights = TheaterLights()
    val popper: PopcornPopper = PopcornPopper()

    val homeTheater: HomeTheaterFacade = HomeTheaterFacade(amp, dvd, cd, projector, screen, lights, popper)

    homeTheater.watchMovie("Raiders of the Lost Ark")
    homeTheater.endMovie()
}