import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val celsius = scanner.nextDouble()
    print(celsius * 1.8 + 32)
}