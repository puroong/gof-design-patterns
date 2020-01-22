package adapter.realworld

interface Enumeration {
    fun hasMoreElements(): Boolean
    fun nextElement(): Any
}