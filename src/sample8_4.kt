fun main() {
    val rent = 20.0
    val move = 5
    val room = "3LDK"

    val rents = listOf(7.5, 10.0, 21.4, 19.8, 30.0)
    val moves = listOf(3, 12, 5, 5, 1)
    val rooms = listOf("1K", "2LDK", room, room, room)

    for (i in rents.indices) { // 範囲をリストサイズに依存
        if (rent < rents[i]) {
            println("${i + 1}番目の物件は、家賃が高いのでパス。")
            continue
        }

        if (move < moves[i]) {
            println("${i + 1}番目の物件は、駅までが遠いのでパス。")
            continue
        }

        if (room != rooms[i]) { // 比較ロジックを明確に
            println("${i + 1}番目の物件は、間取りが希望と違うのでパス。")
            continue
        }

        println("${i + 1}番目の物件が候補です。")
    }
}