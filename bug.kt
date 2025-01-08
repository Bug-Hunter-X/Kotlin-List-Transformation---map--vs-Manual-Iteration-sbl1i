```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val doubledList = mutableListOf<Int>()
    for (i in list) {
        doubledList.add(i * 2) 
    }
    println(doubledList) // Output: [2, 4, 6, 8, 10]
}
```