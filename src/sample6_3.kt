fun main() {
    val kousuikakuritu = 50

    val motteku: Boolean = (30 <= kousuikakuritu)
    if (motteku)
        println("傘を持っていく")
    if (!motteku)
        println("傘を持っていかない")
}
