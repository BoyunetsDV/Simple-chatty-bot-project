import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    val k = scanner.nextInt()

    if (a >= 0) a += k - 1
    if (b < 0) b -= k + 1
    print(b / k - a / k + 1)
}