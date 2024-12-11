class Pers {
    var name: String = ""
        set(value) { // 値を代入するとき
            if (value.length >= 3) { // 3文字以上じゃないと代入させない
                field = value
            } else {
                println("名前は3文字以上にしてください")
            }
        }
        get() { // 値を取得するとき
            return "こんにちは、$field さん" // 加工して返す
        }
}

fun main() {
    val pers = Pers()

    pers.name = "小太郎"     // 正しい名前
    println(pers.name)    // 出力: こんにちは、太郎 さん

    pers.name = "あ"      // 短すぎる名前
    // エラー出力: 名前は3文字以上にしてください
}