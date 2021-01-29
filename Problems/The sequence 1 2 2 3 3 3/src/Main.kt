fun main() {
    val k = readLine()!!.toInt()
    var l = 1
    var c = 0
    while (c < k) {
        for (j in 1..l) {
            print("$l ")
            c++
            if (c == k) {
                break
            }
        }
        l++
    }
}