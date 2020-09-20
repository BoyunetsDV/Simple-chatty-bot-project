import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val days = scanner.nextInt()
    val foodCost = scanner.nextInt()
    val flightCost = scanner.nextInt()
    val nightCost = scanner.nextInt()
    print(flightCost * 2 + days * foodCost + (days - 1) * nightCost)
}