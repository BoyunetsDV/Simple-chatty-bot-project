import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val miles = scanner.nextDouble()
    val timeInRoad = scanner.nextDouble()
    print(miles / timeInRoad)

}