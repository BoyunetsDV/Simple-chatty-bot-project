import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()
    var min = Int.MAX_VALUE
    repeat(count) {
        val inp = scanner.nextInt()
        if (inp < min) min = inp
    }
    print(min)
}