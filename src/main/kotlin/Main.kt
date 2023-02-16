fun main() {
    println("Connect Four")
    println("First player's name:")
    val firstPlayer = readln()
    println("Second player's name:")
    val secondPlayer = readln()
    println("""Board columns should be from 5 to 9
        |Press Enter for default (6 x 7)""".trimMargin()
    )


//    println("$firstPlayer X $secondPlayer")
//    println("$rows X $columns board")
//    println("""Board columns should be from 5 to 9
//                |Set the board dimensions (Rows x Columns)
//                |Press Enter for default (6 x 7)""".trimMargin()
}



fun main1() {
//    println("Connect Four")
//    println("First player's name:")
//    val firstPlayer = readln()
//    println("Second player's name:")
//    val secondPlayer = readln()
    val rowsColumns = readln().uppercase().filterNot { it.isWhitespace() }
    val answer = if (rowsColumns.isEmpty()) mutableListOf<Int>(7, 9) else processing(rowsColumns)
    while (answer.isEmpty()) {
        println("""Invalid input
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)""")
        val anotherRowsColumns = readln().uppercase().filterNot { it.isWhitespace() }
        val invalidAnswer = if (anotherRowsColumns.isEmpty()) mutableListOf<Int>(7, 9) else processing(anotherRowsColumns)
    }

    println(answer)



}

fun processing (rowsColumns: String): MutableList<Int> {
    var numbers = mutableListOf<Int>()
    if (rowsColumns.matches(Regex("""^\s*\d+\s*[xX]{1}\s*\d+\s*${'$'}"""))) {
        val value = rowsColumns.split("X")
        val a = value[0].toInt()
        val b = value[1].toInt()
        numbers.add(a)
        numbers.add(b)
    } else {
        numbers = mutableListOf()
    }
    return numbers
}

//println(
//"""Board columns should be from 5 to 9
//        |Press Enter for default (6 x 7)""".trimMargin()
//)


