package command.complicated

import command.common.Command
import command.common.NoCommand

class RemoteControl {
    val onCommands: Array<Command> = Array<Command>(7) { NoCommand() }
    val offCommands: Array<Command> = Array<Command>(7) { NoCommand() }
    var undoCommand: Command = NoCommand()

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand.undo()
    }

    override fun toString(): String {
        val stringBuffer: StringBuffer = StringBuffer()
        stringBuffer.append("\n------------ Remote Control ------\n")
        for (index in onCommands.indices) {
            stringBuffer.append("[slot $index] ${onCommands[index]::class}  ${offCommands[index]::class} \n")
        }
        return stringBuffer.toString()
    }
}