import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    repeat(count) {
        val inp = scanner.nextInt()
        if (inp == 5) {
            a++
        } else if (inp == 4) {
            b++
        } else if (inp == 3) {
            c++
        } else if (inp == 2) {
            d++
        }
    }
    print("$d $c $b $a")
}