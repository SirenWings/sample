fun main(){
    val me = Person() //インスタンスmeを作成
    me.name = "Taro" //プロパティに値を設定
    me.mail = "Taro@yamada" //　　〃
    println(me.say()) //メソッドの呼び出し
}

class Person {//Personというクラスを定義
var name = "noname"
    var mail = ""

    fun say() = "Name:${name},Email:${mail}"
}