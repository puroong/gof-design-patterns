package command.complicated

import command.common.*

fun main() {
    val remoteControl: RemoteControl = RemoteControl()

    val livingRoomLight: Light = Light("Livinig Room")
    val kitchenLight: Light = Light("Kitchen")
    val garageDoor: GarageDoor = GarageDoor()
    val stereo: Stereo = Stereo()

    val livingRoomLightOn: LightOnCommand = LightOnCommand(livingRoomLight)
    val livingRoomLightOff: LightOffCommand = LightOffCommand(livingRoomLight)
    val kitchenLightOn: LightOnCommand = LightOnCommand(kitchenLight)
    val kitchenLightOff: LightOffCommand = LightOffCommand(kitchenLight)

    val garageDoorOpen: GarageDoorOpenCommand = GarageDoorOpenCommand(garageDoor)

    val stereoOnWithCD: StereoOnWIthCDCommand = StereoOnWIthCDCommand(stereo)

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
    remoteControl.setCommand(2, garageDoorOpen, NoCommand())
    remoteControl.setCommand(3, stereoOnWithCD, NoCommand())

    println(remoteControl)

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    println(remoteControl)
    remoteControl.undoButtonWasPushed()
    remoteControl.onButtonWasPushed(1)
    remoteControl.offButtonWasPushed(1)
    println(remoteControl)
    remoteControl.undoButtonWasPushed()
    remoteControl.onButtonWasPushed(2)
    remoteControl.offButtonWasPushed(2)
    println(remoteControl)
}