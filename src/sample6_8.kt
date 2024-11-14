fun main(args: Array<String>) {
    val point = 73
    val grade: String

    if (80 <= point) {
        grade = "A"
    }else if (70 <= point) {
        grade = "B"
    }else if (60 <= point) {
        grade = "C"
    }else {
        grade = "D"
    }
    println("$point 点なので、成績は $grade です")
}