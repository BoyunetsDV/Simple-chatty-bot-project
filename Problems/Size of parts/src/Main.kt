import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    var zero = 0
    var toFix = 0
    var toReject = 0
    repeat(count) {
        val input = scanner.nextInt()
        if (input == 0) {
            zero += 1
        } else if (input < 0) {
            toReject += 1
        } else {
            toFix += 1
        }
    }
    print("$zero $toFix $toReject")
}