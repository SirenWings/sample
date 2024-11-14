fun main() {
    val sincho = listOf(1.65, 1.74, 1.81, 1.68, 1.56 )
    val taiju = listOf(61, 79, 103, 56, 51 )

    for (i in sincho.indices) {
        val staffNo = i + 1
        val bmi = taiju[i] / (sincho[i] * sincho[i])
        println("社員番号が${staffNo}の社員のBMIは${bmi}です")
    }
}