fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    //To modify the list in place, use mapTo
    mutableList.mapTo(mutableList){it * 2}
    println(mutableList) // Output: [2, 4, 6, 8, 10]
    
    //Alternatively, use forEach
    val anotherMutableList = mutableListOf(1,2,3,4,5)
    anotherMutableList.forEachIndexed { index, value -> anotherMutableList[index] = value * 2 }
    println(anotherMutableList) // Output: [2,4,6,8,10]
} 