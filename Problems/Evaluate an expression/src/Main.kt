import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextDouble()
    print(Math.pow(x, 3.0) + Math.pow(x, 2.0) + x + 1)
}