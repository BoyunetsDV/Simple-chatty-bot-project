import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val a1 = scanner.nextInt()
    val b1 = scanner.nextInt()

    print(if (a == a1 || b == b1 || Math.abs(a - a1) == Math.abs(b - b1)) "YES" else "NO")
}