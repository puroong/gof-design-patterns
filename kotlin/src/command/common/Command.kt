package command.common

interface Command {
    fun execute()
    fun undo()
}