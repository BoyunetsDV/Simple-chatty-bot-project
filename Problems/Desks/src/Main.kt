import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val classOne = scanner.nextInt()
    val classTwo = scanner.nextInt()
    val classThree = scanner.nextInt()
    print(classOne / 2 + classOne % 2 + classTwo / 2 + classTwo % 2 + classThree / 2 + classThree % 2)
}