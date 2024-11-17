fun main() {
    val people = listOf(170.3, 163.5, 172.7, 182.2, 166.5, 190.8, 156.0 )

    for (height in people)
        if (180 <= height) {
            println("みつかりました！＼(^o^)／${height}cmでした。")
        break
        } else {
            println("${height}cmなので探し続けます。")
        }
    println("終了しました。")
}