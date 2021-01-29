fun getLastDigit(a: Int) = kotlin.math.abs(a % 10)
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}