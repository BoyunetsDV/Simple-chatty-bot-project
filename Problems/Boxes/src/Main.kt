import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var x1 = scanner.nextInt()
    var y1 = scanner.nextInt()
    var z1 = scanner.nextInt()
    var x2 = scanner.nextInt()
    var y2 = scanner.nextInt()
    var z2 = scanner.nextInt()

    if (x1 > y1) {
        val t = y1
        y1 = x1
        x1 = t
    }
    if (y1 > z1) {
        val t = y1
        y1 = z1
        z1 = t
    }
    if (x1 > y1) {
        val t = y1
        y1 = x1
        x1 = t
    }
    if (x2 > y2) {
        val t = y2
        y2 = x2
        x2 = t
    }
    if (y2 > z2) {
        val t = y2
        y2 = z2
        z2 = t
    }
    if (x2 > y2) {
        val t = y2
        y2 = x2
        x2 = t
    }

    print(
            if (x1 == x2 && y1 == y2 && z1 == z2) {
                "Box 1 = Box 2"
            } else if (x1 <= x2 && y1 <= y2 && z1 <= z2) {
                "Box 1 < Box 2"
            } else if (x1 >= x2 && y1 >= y2 && z1 >= z2) {
                "Box 1 > Box 2"
            } else {
                "Incomparable"
            })
}