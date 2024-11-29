//高階関数
//引数や戻り地に、関数を値として使用する関数のこと。

fun main() {
    val price = 12500
    calc(price, {n-> n * 1.1})//ｎを引数とするラムダ式が引数
    calc(price) {n->
        n / 1.1}//第２引数をブロック{ }に記述し外に出す（推奨？）　　
}

fun calc(p:Int,f:(p:Int)->Double) {
    //第１引数はp:Int
    // 第２引数はラムダ式f:(p:Int)->Double
    val re = (f(p)).toInt()
    println("*$p➔$re")
}