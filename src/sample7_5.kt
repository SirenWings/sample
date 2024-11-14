fun main() {
    val points = IntArray(30)

    points[0] = 90
    points[1] = 62
    points[2] = 76

    for (i in 3..14)
        points[i] = 75

    for (i in 15 until points.size)
        points[i] = 70

    var sumPoint = points.sum()

    val averaePoint = sumPoint.toDouble() / points.size
    println("このクラスの平均点は${averaePoint}点です")

    for (i in 0..<points.size)
        println("出席番号${i + 1}番は${points[i]}点です")
}