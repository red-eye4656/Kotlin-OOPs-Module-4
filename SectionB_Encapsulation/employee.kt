class Employee(
    private var salary: Double
) {

    fun setSalary(newSalary: Double) {
        if (newSalary >= 0) {
            salary = newSalary
            println("Salary updated successfully.")
        } else {
            println("Salary cannot be negative.")
        }
    }

    fun getSalary(): Double {
        return salary
    }
}


fun main() {

    println("===== Q5: Employee =====")

    val employee = Employee(30000.0)

    println("Current Salary: Rs.${employee.getSalary()}")

    employee.setSalary(40000.0)

    println("Updated Salary: Rs.${employee.getSalary()}")

    employee.setSalary(-5000.0)

    println("Final Salary: Rs.${employee.getSalary()}")
}