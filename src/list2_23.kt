/*
ローカル関数のサンプルコード

関数の中に関数を定義したものがローカル関数で、
定義した関数内でしか使えず、外部から呼び出せない。
*/
fun main() {
    val price = 12500
    zei(price)
    zei(price,15)
    zei(price,20)
}

fun  zei(price:Int, ritu: Int = 10) {
    val p = (price * ((100.0 + ritu) / 100.0)).toInt()
    fun printZei() {
        println("*${ritu}%:${p}")
    }
    printZei()
}