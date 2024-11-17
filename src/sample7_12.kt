fun main() {
    val points = Array(4) { IntArray(10) }

    points[0] = intArrayOf(27, 53, 82, 77, 37, 61, 84, 72, 25, 91)
    points[1] = intArrayOf(54, 76, 96, 39, 18, 45, 89, 92, 68, 88)
    points[2] = intArrayOf(54, 69, 81, 57, 49, 67, 76, 81, 67, 89)

    val japPint = points[0]
    val mathPoint = points[1]
    val engPoint = points[2]
    val sumPoint = points[3]

    for (i in points[0].indices) {
        sumPoint[i] = japPint[i] + mathPoint[i] + engPoint[i]
    }

    for (i in points[0].indices) {
        println("出席番号" + (i + 1) + "番の生徒の成績")
        println("国語 : " + points[0][i])
        println("数学 : " + points[1][i])
        println("英語 : " + points[2][i])
        println("合計 : " + points[3][i])
        println("-----")
    }
}