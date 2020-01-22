package adapter.realworld

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
    fun remove()
}