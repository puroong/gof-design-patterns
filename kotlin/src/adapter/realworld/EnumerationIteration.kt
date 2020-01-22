package adapter.realworld

class EnumerationIteration(val enumeration: Enumeration) : Iterator {
    override fun hasNext(): Boolean {
        return enumeration.hasMoreElements()
    }

    override fun next(): Any {
        return enumeration.nextElement()
    }

    override fun remove() {
        throw UnsupportedOperationException()
    }

}