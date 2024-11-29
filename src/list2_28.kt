//再帰法によるプログラム
//
fun main() {
    println("gcd(9,15):${gcd(9,15)}")
    println("gcd(15,20):${gcd(15,20)}")
    println("gcd(21,35):${gcd(21,35)}")
}

fun gcd(a:Int,b:Int):Int{
    val x = if(a > b) a else b
    val y = if(a > b) b else a
    if(y == 0)
        return  a
    else
        return gcd(y,x % y)
}