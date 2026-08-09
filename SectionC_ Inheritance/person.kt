open class Person(
    val name: String,
    val age: Int
) {

    fun showPersonDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}


class Teacher(
    name: String,
    age: Int,
    val subject: String
) : Person(name, age) {

    fun teach() {
        println("$name teaches $subject.")
    }
}


class Student(
    name: String,
    age: Int,
    val rollNumber: Int
) : Person(name, age) {

    fun study() {
        println("$name is studying.")
    }
}


fun main() {

    println("===== Q7: Person, Teacher and Student =====")

    val teacher = Teacher(
        "Mr. Sharma",
        35,
        "Kotlin"
    )

    teacher.showPersonDetails()
    teacher.teach()

    println()

    val student = Student(
        "Satyam",
        21,
        101
    )

    student.showPersonDetails()
    println("Roll Number: ${student.rollNumber}")
    student.study()
}