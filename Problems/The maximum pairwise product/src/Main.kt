import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var max1 = 1
    var max2 = 1
    val count = scanner.nextInt()
    repeat(count) {
        val inp = scanner.nextInt()
        if (max1 < inp) {
            if (max2 < max1) {
                max2 = max1
            }
            max1 = inp
        } else if (max2 < inp) {
            max2 = inp
        }
    }
    print(max1 * max2)
}