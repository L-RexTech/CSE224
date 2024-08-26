fun main() {
    println("Enter the first number:")
    val num1 = readLine()!!.toDouble()

    println("Enter the second number:")
    val num2 = readLine()!!.toDouble()

    println("Enter the operation (+, -, *, /, %):")
    val operation = readLine()

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        "%" -> num1 % num2
        else -> {
            println("Invalid operation")
            return
        }
    }

    println("Result: $result")
}
