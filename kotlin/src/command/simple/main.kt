package command.simple

import command.common.GarageDoor
import command.common.GarageDoorOpenCommand
import command.common.Light
import command.common.LightOnCommand

fun main() {
    val remote: SimpleRemoteControl =
        SimpleRemoteControl()
    val light: Light = Light("light")
    val lightOn: LightOnCommand =
        LightOnCommand(light)
    val garageDoor: GarageDoor = GarageDoor()
    val garageOpen: GarageDoorOpenCommand =
        GarageDoorOpenCommand(garageDoor)

    remote.setCommand(lightOn)
    remote.buttonWasPressed()
    remote.setCommand(garageOpen)
    remote.buttonWasPressed()
}