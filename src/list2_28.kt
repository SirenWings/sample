//再帰法によるプログラム
//関数が自分自身を呼び出すこと

//このコードはユークリッドの互除法というアルゴリズムが使われているらしい
fun main() {
    println("gcd(9,15):${gcd(9,15)}")
    println("gcd(15,20):${gcd(15,20)}")
    println("gcd(21,35):${gcd(21,35)}")
}

fun gcd(a:Int,b:Int):Int{ //１回目９と１５
    val x = if(a > b) a else b //９＞１５　elseなのでxにbの１５を代入、９と６trueなのでx=9、６と３なのでx=６、３と０x=3
    val y = if(a > b) b else a //９＞１５　elseなのでyにaの9を代入、９と６trueなのでy=6、６と３なのでy=３、３と０y=0
    if(y == 0)
        return  a //y=oのときaは３を呼び出し元の６行目に返す
    else
        return gcd(y,x % y)//１１行目に値を返す
}