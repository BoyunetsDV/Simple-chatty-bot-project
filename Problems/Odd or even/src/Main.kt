import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    print(if (Math.abs(a % 2) == 1) "ODD" else "EVEN")
}