interface Playable {

    fun play()
}


class Cricket : Playable {

    override fun play() {
        println("Playing Cricket.")
    }
}


class Football : Playable {

    override fun play() {
        println("Playing Football.")
    }
}


fun main() {

    println("===== Q8: Playable Interface =====")

    val cricket = Cricket()
    val football = Football()

    cricket.play()
    football.play()
}