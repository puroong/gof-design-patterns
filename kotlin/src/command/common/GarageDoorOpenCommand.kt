package command.common

import command.common.Command
import command.common.GarageDoor

class GarageDoorOpenCommand(var garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
        garageDoor.lightOn()
    }

    override fun undo() {
        garageDoor.lightOff()
        garageDoor.down()
    }
}