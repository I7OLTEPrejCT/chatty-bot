import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var big = -18000000
    var j = 1
    var cur = 0
    while (scanner.hasNext()) {
        val next = scanner.next()!!.toInt()
        if (next > big) {
            big = next
            cur = j
        }
        j++
    }
    println("$big $cur")
}