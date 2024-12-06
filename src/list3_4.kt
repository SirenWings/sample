fun main() {
    val me = pers("Taro","taro@yamada")
    println(me.say())
    val  date = mapOf<String,String> (
        "name" to "Hanako",
        "mail" to "hanako@flower"
    )
    val you = pers(date)
    println(you.say())
}

class pers {
    var name:String
    var mail:String

    constructor(name:String = "no name",mail:String = "no mail") {
        this.name = name
        this.mail = mail
    }

    constructor(arr:Map<String,String>) {
        this.name = arr["name"]?: "no name"
        this.mail = arr["mail"]?: "no mail"
    }

    fun say() = "Name:$name,Email:$mail"
}