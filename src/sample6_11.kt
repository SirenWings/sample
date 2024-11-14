fun main() {
    val isMale = true
    println("${if (isMale)"男性" else "女性"} ですね")

    val month = 4
    val birth = 11
    val message = if (month == birth) "今月誕生日ですね" else "もうすぐ誕生日ですね"
    println(message)
}