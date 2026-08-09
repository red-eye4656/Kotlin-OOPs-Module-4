class Rectangle(
    val length: Double,
    val breadth: Double
) {
    fun area(): Double {
        return length * breadth
    }
}

fun main() { 
    println("\n===== Q3: Rectangle =====")

    val rectangle = Rectangle(10.0, 5.0)

    println("Length: ${rectangle.length}")
    println("Breadth: ${rectangle.breadth}")
    println("Area: ${rectangle.area()}")
 }