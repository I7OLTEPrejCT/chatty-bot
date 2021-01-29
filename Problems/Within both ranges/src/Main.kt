import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    
    IntArray(5) { scanner.nextInt() }.also {       
        println((it[4] in it[0]..it[1])&&(it[4] in it[2]..it[3]))
    }
}
