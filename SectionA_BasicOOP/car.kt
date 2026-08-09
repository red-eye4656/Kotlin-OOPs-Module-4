class Car(
    val brand: String,
    val model: String,
    val price: Double
)

fun main() {

    println("===== Q1: Car Objects =====")

    val car1 = Car("Toyota", "Fortuner", 3500000.0)
    val car2 = Car("Hyundai", "Creta", 1800000.0)
    val car3 = Car("Tata", "Nexon", 1200000.0)

    println("Brand: ${car1.brand}, Model: ${car1.model}, Price: Rs.${car1.price}")
    println("Brand: ${car2.brand}, Model: ${car2.model}, Price: Rs.${car2.price}")
    println("Brand: ${car3.brand}, Model: ${car3.model}, Price: Rs.${car3.price}")
}