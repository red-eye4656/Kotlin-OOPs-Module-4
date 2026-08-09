open class Animal {

    fun eat() {
        println("Animal is eating.")
    }

    fun sleep() {
        println("Animal is sleeping.")
    }
}


class Dog : Animal() {

    fun bark() {
        println("Dog is barking.")
    }
}


fun main() {

    println("===== Q6: Animal and Dog =====")

    val dog = Dog()

    dog.eat()
    dog.sleep()
    dog.bark()
}