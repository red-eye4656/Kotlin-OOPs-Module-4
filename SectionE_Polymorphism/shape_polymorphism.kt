open class Shape {

    open fun area(): Double {
        return 0.0
    }
}


class Circle(
    private val radius: Double
) : Shape() {

    override fun area(): Double {
        return Math.PI * radius * radius
    }
}


class Rectangle(
    private val length: Double,
    private val breadth: Double
) : Shape() {

    override fun area(): Double {
        return length * breadth
    }
}


fun main() {

    println("===== Q10: Shape Polymorphism =====")

    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Rectangle(10.0, 5.0),
        Circle(3.0)
    )

    for (shape in shapes) {
        println("Area: ${shape.area()}")
    }
}