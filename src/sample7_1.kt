fun main() {
    val points = IntArray(30)

    points[0] = 90
    points[1] = 62
    points[2] = 76

    println("出席番号１番は${points[0]}点です")
    println("出席番号２番は${points[1]}点です")
    println("出席番号３番は${points[2]}点です")
    println("出席番号３０番は${points[29]}点です")
    println("このクラスに生徒は${points.size}人います")
}