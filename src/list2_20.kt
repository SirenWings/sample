fun main() {
    val list = arrayOf(1000, 2500, 4780 )
    //変数listに３要素の配列を格納

    val totalA = list[0] + list[1] +list[2]
    //変数listの要素０〜２を足してtotalAに代入

    val totalB = tax(list[0]) + tax(list[1]) + tax(list[2])
    //１３行目のtax関数に渡す値
    println("total:${totalA},whith tax:${totalB}")
}

fun tax(price:Int):Int { //tax関数(引数price:Int型):戻り値Int
    return (price * 1.1).toInt() //
}