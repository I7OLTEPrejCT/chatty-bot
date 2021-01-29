fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()-1
    var res: Long = 1
    for (s in a..b) {
        res *=s
    }
    println(res)
}
