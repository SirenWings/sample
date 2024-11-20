fun main() {
    val a = intArrayOf(0, 5, 5, 0)
    val b = intArrayOf(2, 5, 2, 2, 5, 0)
    val c = intArrayOf(5, 0, 2, 0, 2, 5, 2)

    var index = 0
    var unSame = true
    while (unSame) {
        if (a[index % a.size] == b[index % b.size] && b[index % b.size] == c[index % c.size]) {
            unSame = false
        } else {
            index++
        }
    }
    println("${(index + 1)}回目で全員が同じ手を出しました")
}