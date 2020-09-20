import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val f = scanner.nextBoolean()
    print(!f && a >= 10 && a <= 20 || f && a >= 15 && a <= 25)
}