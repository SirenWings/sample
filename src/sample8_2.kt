fun main() {
    val chars = listOf('Q', 'a', 'e', 'D', 't', 'G', 'u', 'J', 'K', 'o', 'l', 'p', ';', '@', ':')

    for (c in chars)
        if ((c in 'A'..'Z') || (c in 'a'..'z')) {
            println("アルファベット${c}なので探し続けます")
        } else {
            println("${c}が見つかりました")
            break
        }
    println("終了しました")
}