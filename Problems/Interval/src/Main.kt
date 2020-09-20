import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    print(if (a in -14..12 || a in 15..16 || a >= 19) "True" else "False")
}