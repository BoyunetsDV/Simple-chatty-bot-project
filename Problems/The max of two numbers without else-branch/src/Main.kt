import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var a = scanner.nextInt()
    val b = scanner.nextInt()

    if (a < b) a = b
    print(a)
}