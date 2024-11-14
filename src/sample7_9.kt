fun main() {
    val ageOfFamily = mutableListOf(31, 35, 3, 21, 27, 81 )

    for (i in 0 ..< ageOfFamily.size - 1) {
        for (j in i + 1 ..< ageOfFamily.size ) {
            if (ageOfFamily[j] < ageOfFamily[i]) {
                val temporary = ageOfFamily[i]
                ageOfFamily[i] = ageOfFamily[j]
                ageOfFamily[j] = temporary
            }
        }
    }
    for (i in 0 ..< ageOfFamily.size) {
        println("${(i + 1 )}番目に若い年齢は${ageOfFamily[i]}歳です")
    }
}