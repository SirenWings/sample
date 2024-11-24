fun main() {
    val price = 12500
    val priceA = tax(price)//9行目のrate: Int = 10が適用される
    val priceB = tax(price, 15)
    val priceC = tax(rate = 20, price = price)/* 引数の名前（rate,price）を
        明示した書き方。名前が明示されているので順番が違ってもOK*/
    println("price:${price},10%:${priceA},15%:${priceB},20%:${priceC}")
}

fun tax(price:Int, rate: Int = 10):Int {
    return (price * ((100.0 + rate) / 100.0)).toInt()
}