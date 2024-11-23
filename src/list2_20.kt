fun main() {
    val list = arrayOf(1000, 2500, 4780 )
    //変数listに３要素の配列を格納

    val totalA = list[0] + list[1] +list[2]
    //変数listの要素０〜２を足してtotalAに代入

    val totalB = tax(list[0]) + tax(list[1]) + tax(list[2])
    //１３行目のtax関数に渡す値  1000, 2500, 4780が、
    // return後　1100, 2750, 5285に置き換わる

    println("total:${totalA},whith tax:${totalB}")
}

fun tax(price:Int):Int {
    //tax関数。８行目の値（1000, 2500, 4780 ）を受取り、priceに代入。
    return (price * 1.1).toInt() //1.1を掛けているので.Int()でキャスト
    //priceそれぞれに1.1を掛けて税込みにして、return。
    //1100はtax(list[0])に、2750はtax(list[1])に、
    // 5285はtax(list[2])に置き換わる。
}