class CalculatorApp {
    var command: String = ""

    fun start() {
        println("Welcome to Fancy Calculator..")

        while (command != "exit") {
            when(command) {
                "+" -> {
                    val result = addition()
                    println("result is $result")
                }
                "recall" -> {
                    println("The last 5 results are [75]")
                }
                else -> {
                    println("Command $command is not supported")
                }
            }
            println("------------------------")
            println("Supported commands: '+'")
            println("Enter 'exit' to stop the program")
            command = readln()
        }
    }

    fun addition(): Double {
        println("Enter the your first number: ")
        val num1 = readln().toDouble()
        println("Enter the your second number: ")
        val num2 = readln().toDouble()

        return num1 + num2
    }
}