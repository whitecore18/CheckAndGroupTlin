fun main() {
    // task1
    val words = listOf("apple", "banana", "apricot", "blueberry", "cherry")
    val groupedByFirstChar = words.groupBy { it.first() }
    println("Группировка слов по первому символу:")
    println(groupedByFirstChar)

    // task2
    val strings = listOf("one", "two", "three", "four", "five", "six")
    val groupedByLength = strings.groupBy { it.length }
    println("\nГруппировка строк по длине:")
    println(groupedByLength)

    // task3
    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )
    val groupedByYear = phoneToYear.groupBy { it.second }
    println("\nГруппировка телефонов по годам выпуска:")
    println(groupedByYear)
}