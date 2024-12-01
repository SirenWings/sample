fun main() {
    println(fact(1))
    println(fact(2))
    println(fact(3))
    println(fact(4))
    println(fact(5))
}

tailrec fun fact(n:Int, m:Int = 1):Int =
    if (n == 1) m else fact(n - 1, m * n)