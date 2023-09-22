import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val situation = scanner.nextLine()
    scanner.close()

    val result = isDangerousSituation(situation)
    println(result)
}

fun isDangerousSituation(situation: String): String {
    var consecutiveZeros = 0
    var consecutiveOnes = 0

    val chars = situation.toCharArray()

    for (c in chars) {
        if (c == '0') {

            consecutiveZeros++
            consecutiveOnes = 0
        } else {
            consecutiveOnes++
            consecutiveZeros = 0
        }

        if (consecutiveZeros == 7 || consecutiveOnes == 7) {
            return "YES"
        }
    }
    return "NO"
}
