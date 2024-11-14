fun main() {
    val week = '雨'

    when (week) {
        '日' -> { println("日曜日") }
        '月' -> { println("月曜日") }
        '火' -> { println("火曜日") }
        '水' -> { println("水曜日") }
        '木' -> { println("木曜日") }
        '金' -> { println("金曜日") }
        '土' -> { println("土曜日") }
        else -> { println("曜日の指定を間違えています") }
    }
}