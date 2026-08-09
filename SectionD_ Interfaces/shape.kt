interface Shape {

    fun area(): Double
}


class Circle(
    private val radius: Double
) : Shape {

    override fun area(): Double {
        return Math.PI * radius * radius
    }
}


class Rectangle(
    private val length: Double,
    private val breadth: Double
) : Shape {

    override fun area(): Double {
        return length * breadth
    }
}


fun main() {

    println("===== Q9: Shape Interface =====")

    val circle = Circle(5.0)
    val rectangle = Rectangle(10.0, 5.0)

    println("Circle Area: ${circle.area()}")
    println("Rectangle Area: ${rectangle.area()}")
}