package command.common

class StereoOnWIthCDCommand(val stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume()
    }

    override fun undo() {
        stereo.off()
    }

}