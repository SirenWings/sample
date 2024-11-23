fun main() {
    hello("Taro") //6行目の関数helloの引数nameに値Taroを渡す
    hello("Hanako") //6行目の関数helloの引数nameに値Hanakoを渡す
}

fun hello(name:String) { //hello関数(引数name:String型)
    println("Hello,$name!!")
}