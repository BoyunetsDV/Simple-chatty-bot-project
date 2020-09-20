import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()
    var max = 0
    var currentMax = 0
    var prev = Int.MIN_VALUE
    repeat(count) {
        val inp = scanner.nextInt()
        if (inp >= prev) {
            currentMax++
        } else if (currentMax > max) {
            max = currentMax
            currentMax = 1
        } else {
            currentMax = 1
        }
        prev = inp
    }
    if (currentMax > max) max = currentMax
    print(max)
}