package Singleton

class Singleton private constructor() {
    companion object {
        @Volatile
        private var instance: Singleton? = null

        @JvmStatic
        @Synchronized
        fun getInstance(): Singleton =
            instance ?: Singleton().also {
                instance = it
            }

        /*
        @JvmStatic
        fun getInstance(): Singleton.Singleton =
            instance ?: synchronized(this) {
                instance ?: Singleton.Singleton().also {
                    instance = it
                }
            }
         */

    }
}

fun main() {
    val instance1 = Singleton.getInstance()
    val instance2 = Singleton.getInstance()
    val instance3 = Singleton.getInstance()

    println("instance1: ${instance1.hashCode()}")
    println("instance2: ${instance2.hashCode()}")
    println("instance3: ${instance3.hashCode()}")

    if (instance1 == instance2 && instance1 == instance3) {
        println("equals Instance: true")
    }
}