package template.sort

fun display(ducks: List<Duck>) {
    for (duck in ducks)
        println(duck)
}

fun main() {
    val ducks: MutableList<Duck> = mutableListOf(
        Duck("Daffy", 8),
        Duck("Dewey", 7),
        Duck("Howard", 7),
        Duck("Louie", 2),
        Duck("Donald", 10),
        Duck("Huey", 2))

    println("Before sorting...")
    display(ducks)

    ducks.sort()

    println("After sorting...")
    display(ducks)
}