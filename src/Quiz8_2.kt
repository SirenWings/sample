fun main() {
    var i = 1
    while (true) {
        var j = 1
        while (true) {
            print("${i * j}\t")
            j++
            if (9 < j) {
                break
            }
        }
        i++
        if (9 < i) {
            break
        }
        println()
    }
}