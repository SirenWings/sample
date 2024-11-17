fun main() {
    val points = IntArray(30)

    points[0] = 90
    points[1] = 62
    points[2] = 76

    for (i in 3..14)
        points[i] = 75

    for (i in 15 until points.size)
        points[i] = 70

    val sumPoint = points.sum()

    val averagePoint = sumPoint.toDouble() / points.size
    println("このクラスの平均点は${averagePoint}点です")

    for (i in 0..<points.size)
        println("出席番号${i + 1}番は${points[i]}点です")
}