package command.common

import command.common.Command
import command.common.Light

class LightOffCommand(val light: Light) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}