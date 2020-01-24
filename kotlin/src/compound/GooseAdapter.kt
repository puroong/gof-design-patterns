package compound

class GooseAdapter(val goose: Goose) : Quackable {
    override fun quack() {
        goose.honk()
    }
}