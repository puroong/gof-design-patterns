package template.sort

data class Duck(val name: String, val weight: Int) : Comparable<Duck> {
    override fun compareTo(other: Duck): Int {
        return this.weight - other.weight
    }
}