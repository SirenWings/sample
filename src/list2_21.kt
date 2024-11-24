fun main() {
    val list = arrayOf(1000, 2500, 4780)
    val totalA = list[0] + list[1] + list[2]
    val totalB = tax(list[0]) + tax(list[1]) + tax(list[2])
    println("total:${totalA},with tax:${totalB}")
    println(tax)
}

val tax = fun(price:Int):Int {
    return (price * 1.1).toInt()
}