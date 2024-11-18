fun main() {
    val rent = 20.0
    val move = 5
    val room = "3LDK"

    val rents = listOf(7.5, 10.0, 21.4, 19.8, 30.0 )
    val moves = listOf(3, 12, 5, 5, 1 )
    val rooms = listOf("1k", "2LDK", room, room, room )

    for (i in rents.indices) {
        if (rent < rents[i]) {
            println("${i + 1}番目の物件は、家賃が高いのでパス。")
            continue
        }

        if (move < moves[i]) {
            println("${i + 1}番目の物件は、駅までが遠いのでパス。。")
            continue
        }

        if (room != rooms[i]) {
            println("${i + 1}番目の物件は、間取りが希望と違うのでのでパス。")
            continue
        }

        println("${i + 1}番目の物件が候補です。")
    }
}