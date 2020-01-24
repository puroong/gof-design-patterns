package compound

class Flock : Quackable {
    val quackers: ArrayList<Quackable> = ArrayList()

    fun add(quacker: Quackable) {
        quackers.add(quacker)
    }

    override fun quack() {
        val iterator = quackers.iterator()
        while (iterator.hasNext()) {
            val quacker = iterator.next()
            quacker.quack()
        }
    }
}