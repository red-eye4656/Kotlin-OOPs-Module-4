open class Animal {

    open fun makeSound() {
        println("Animal makes a sound.")
    }
}


class Dog : Animal() {

    override fun makeSound() {
        println("Dog says: Woof!")
    }
}


class Cat : Animal() {

    override fun makeSound() {
        println("Cat says: Meow!")
    }
}


class Cow : Animal() {

    override fun makeSound() {
        println("Cow says: Moo!")
    }
}


fun main() {

    println("===== Q11: Animal Polymorphism =====")

    val animals: List<Animal> = listOf(
        Dog(),
        Cat(),
        Cow()
    )

    for (animal in animals) {
        animal.makeSound()
    }
}