fun main() {
    val you = Peso("Hanako","hanako@flower")
    you.content = "ok"
    you.say()
    you.content = "Sachiko,sachiko@happy"
    you.say()
}

class Peso{
    var name:String
    var mail:String
    var content:String
        get() = "I'm ${name}. Mail-address is ”${mail}”."
        set(value:String) {
            val arr = value.split(",")
            if (arr.size >= 2) {
                name = if (arr[0] == "") "no name" else arr[0]
                mail= if (arr[1] == "") "no mail" else arr[1]
            }
        }

    constructor(name:String = "no name",mail:String = "no mail") {
        this.name = name
        this.mail = mail
    }

    fun say() {
        println(this.content)
    }
}