    fun main() {
        val chars = charArrayOf(
            ';', 'Q', '1', 'a', 'e', 'D', ':', '5', 't', 'G', '0',
            'u', 'j', 'K', '@', '9', 'o'
        )

        for (c in chars) {
            if ((c in 'A'..'Z') || (c in 'a'..'z')) {
                continue
            }
            println("「$c」が見つかりました")
        }
        println("終了しました。")
    }
