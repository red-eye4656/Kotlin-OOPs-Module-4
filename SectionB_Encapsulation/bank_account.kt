class BankAccount(
    private var balance: Double
) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Rs.$amount deposited successfully.")
        } else {
            println("Invalid deposit amount.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount <= 0) {
            println("Invalid withdrawal amount.")
        } else if (amount <= balance) {
            balance -= amount
            println("Rs.$amount withdrawn successfully.")
        } else {
            println("Insufficient balance.")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}


fun main() {

    println("===== Q4: Bank Account =====")

    val account = BankAccount(5000.0)

    println("Initial Balance: Rs.${account.getBalance()}")

    account.deposit(2000.0)
    println("Balance: Rs.${account.getBalance()}")

    account.withdraw(1000.0)
    println("Balance: Rs.${account.getBalance()}")

    account.withdraw(10000.0)

    println("Final Balance: Rs.${account.getBalance()}")
}