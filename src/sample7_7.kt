fun main(){
    var array1 = arrayOf(9, 8, 7, 6, 5 )
    var array2 = arrayOf(1, 2, 3 )

    println("array1の要素")
    for (val1 in array1) {
        println(val1)
    }
    println("array2の要素")
   for (val1 in array2) {
       println(val1)
   }
    println("array2をarray1に代入すると")
    array1 = array2
        println("array1の要素")
        for (val1 in array1) {
            println(val1)
        }
        println("array2の要素")
        for (val1 in array2) {
            println(val1)
        }
    println("array2の２番めの要素を５にすると")
    array2[1] = 5

    println("array1の要素")
    for (val1 in array1) {
        println(val1)
    }
    println("array2の要素")
    for (val1 in array2) {
        println(val1)
    }
}