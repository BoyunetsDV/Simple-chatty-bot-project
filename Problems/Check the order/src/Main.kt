import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()
    var isAsc = count > 0
    var prev = Int.MIN_VALUE
    repeat(count) {
        val inp = scanner.nextInt()

        if (prev == Int.MIN_VALUE) {
            prev = inp
        } else if (isAsc && prev > inp) {
            isAsc = false
        } else if (isAsc) {
            prev = inp
        }
    }
    print(if (isAsc) "YES" else "NO")
}