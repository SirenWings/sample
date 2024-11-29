//ラムダ式で処理を実行するコード
fun main() {
    val price = 12500
    syori(price,10)
    syori(price,20)
}

val syori = {p:Int, r:Int ->
    val re = (p * (100.0 + r) / 100.0).toInt()
    println("price:${p},rate:${r},with tax:$re")
}