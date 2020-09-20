import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a1 = scanner.nextInt()
    val b1 = scanner.nextInt()
    val a2 = scanner.nextInt()
    val b2 = scanner.nextInt()

    print(if (Math.abs(a1 - a2) == 1 && Math.abs(b1 - b2) == 2 || Math.abs(a1 - a2) == 2 && Math.abs(b1 - b2) == 1) "YES" else "NO")
}