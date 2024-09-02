// 1. Creating and initializing a list
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println("List: $numbers")
}

// 2. Accessing elements
fun main() {
    val fruits = listOf("apple", "banana", "cherry")
    println("First fruit: ${fruits[0]}")
    println("Last fruit: ${fruits.last()}")
}

// 3. Adding elements to a mutable list
fun main() {
    val numbers = mutableListOf(1, 2, 3)
    numbers.add(4)
    numbers.addAll(listOf(5, 6))
    println("Updated list: $numbers")
}

// 4. Removing elements from a mutable list
fun main() {
    val fruits = mutableListOf("apple", "banana", "cherry", "date")
    fruits.remove("banana")
    fruits.removeAt(1)
    println("Updated list: $fruits")
}

// 5. Finding elements
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1)
    println("Index of 4: ${numbers.indexOf(4)}")
    println("Last index of 4: ${numbers.lastIndexOf(4)}")
    println("Contains 6: ${numbers.contains(6)}")
}

// 6. Slicing a list
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = numbers.slice(2..6)
    println("Slice: $slice")
}

// 7. Sorting a list
fun main() {
    val numbers = mutableListOf(5, 2, 8, 1, 9)
    numbers.sort()
    println("Sorted list: $numbers")
    val descending = numbers.sortedDescending()
    println("Descending order: $descending")
}

// 8. Filtering a list
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")
}

// 9. Transforming a list
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val squared = numbers.map { it * it }
    println("Squared numbers: $squared")
}

// 10. Reducing a list
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.reduce { acc, i -> acc + i }
    println("Sum of numbers: $sum")
}
