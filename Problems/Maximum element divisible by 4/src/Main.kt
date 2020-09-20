import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    var max = Int.MIN_VALUE
    repeat(count) {
        val inp = scanner.nextInt()
        if (inp > max && inp % 4 == 0) max = inp
    }
    print(max)
}