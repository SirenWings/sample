    fun main() {
        val points = Array(4) { IntArray(10) }
        //多次元配列を生成する構文 Array(size){IntArray(size)}
        //第一引数はサイズ、第二引数は要素を指定
        //Arrayは型を明示できる。Array<IntArray>

        points[0] = intArrayOf(27, 53, 82, 77, 37, 61, 84, 72, 25, 91)
        points[1] = intArrayOf(54, 76, 96, 39, 18, 45, 89, 92, 68, 88)
        points[2] = intArrayOf(54, 69, 81, 57, 49, 67, 76, 81, 67, 89)

        for (i in points[0].indices) {
            points[3][i] = points[0][i] + points[1][i] + points[2][i]
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