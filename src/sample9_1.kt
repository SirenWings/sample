const val goo = 0
const val paa = 5
const val choki = 2

fun main() {
    val a = intArrayOf(goo, paa, paa, goo)
    val b = intArrayOf(choki, paa, choki, choki, paa, goo)
    val c = intArrayOf(paa, goo, choki, goo, choki, paa, choki)

    var index = goo
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