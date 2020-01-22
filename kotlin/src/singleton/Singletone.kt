package singleton

object KotlinSingletone {

}

class JavaSingletone private constructor() {
    companion object {
        @JvmStatic
        private lateinit var uniqueInstance: JavaSingletone

        @JvmStatic
        fun getInstance(): JavaSingletone {
            uniqueInstance = uniqueInstance ?:JavaSingletone()
            return uniqueInstance
        }
    }
}