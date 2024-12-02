fun main() {
    println(Perso().say())
    val me = Perso("Taro","taro@yamada")
    println(me.say())
    val you = Perso(mail = "hanako@flower",name = "Hanako")
    println(you.say())
}

class Perso(name:String = "no name", mail:String = "no mail") {
    var name:String
    var mail:String

    init {
        this.name = name
        this.mail = mail
    }

    fun say() = "Name:$name,Email:$mail"
}

