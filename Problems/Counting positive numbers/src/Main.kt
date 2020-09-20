import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    var positive = 0
    repeat(count) {
        val inp = scanner.nextInt()
        if (inp > 0) positive++
    }
    print(positive)
}