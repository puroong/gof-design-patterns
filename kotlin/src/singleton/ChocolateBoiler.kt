package singleton

//object ChocolateBoiler {
//    private var empty: Boolean = true
//    private var boiled: Boolean = true
//
//    fun fill() {
//        if(isEmpty()) {
//            empty = false
//            boiled = false
//        }
//    }
//
//    fun drain() {
//        if(!isEmpty() && isBoiled()) {
//            empty = true
//        }
//    }
//
//    fun boil() {
//        if(!isEmpty() && !isBoiled()) {
//            boiled = true
//        }
//    }
//
//    fun isEmpty(): Boolean {
//        return empty
//    }
//
//    fun isBoiled(): Boolean {
//        return boiled
//    }
//}

class ChocolateBoiler private constructor() {
    private var empty: Boolean = true
    private var boiled: Boolean = true
    private var instance: ChocolateBoiler = ChocolateBoiler()

    fun getInstance(): ChocolateBoiler? {
        return instance
    }

    fun fill() {
        if(isEmpty()) {
            empty = false
            boiled = false
        }
    }

    fun drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true
        }
    }

    fun boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true
        }
    }

    fun isEmpty(): Boolean {
        return empty
    }

    fun isBoiled(): Boolean {
        return boiled
    }
}