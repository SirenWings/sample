//ラムダ式のコード
fun main() {
    val price = 12500
    val pA = calc(price,10)
    val pB = calc(price,20)
    println("price:${price}")
    println("10%:${pA},20%:${pB}")
}

val calc = {p:Int, r:Int -> (p * (100.0 + r) / 100.0).toInt()}