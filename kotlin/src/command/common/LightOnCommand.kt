package command.common

import command.common.Command
import command.common.Light

class LightOnCommand(val light: Light) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}