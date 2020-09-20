import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()
    var sum = 0

    repeat(count) {
        sum += scanner.nextInt()
    }
    print(sum)
}