class Student(
    val name: String,
    val rollNumber: Int
) {
    fun introduce() {
        println("Name: $name")
        println("Roll Number: $rollNumber")
    }
}

fun main() {

    println("===== Q2: Student =====")

    val student = Student("Satyam", 101)

    student.introduce()
}