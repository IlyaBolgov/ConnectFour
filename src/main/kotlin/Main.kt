package connectfour

fun main() {
    println("Connect Four")
    println("First player's name:")
    val first = readln()
    println("Second player's name:")
    val second = readln()
    val regex = Regex("""^\d+[xX]{1}\d+$""")
    while (true) {
        println("Set the board dimensions (Rows x Columns)")
        println("Press Enter for default (6 x 7)")
        var input = readln().filter { !it.isWhitespace() }
        if (input == "") input = "6X7"
        val a = Character.getNumericValue(input.first())
        val b = Character.getNumericValue(input.last())
        if (!input.matches(regex)) {
            println("Invalid input")
        }  else if (a < 5 || a > 9) {
            println("Board rows should be from 5 to 9")
        } else if (b < 5 || b > 9) {
            println("Board columns should be from 5 to 9")
        } else {
            println("$first VS $second")
            println("$a X $b board")
            break
        }
    }

}