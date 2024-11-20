fun main() {
    var index = 10

    var 五未満 = true

    do { //処理ブロック開始
        index++
        println(index)

        五未満 = (index < 5) //変数 五未満に、trueかfalseを代入
    } //処置ブロック終了
    while (五未満) //変数 五未満の真偽値を判定。真ならroop,
    //偽ならroopを抜け次の処理へ。

    println("終了しました。")
}