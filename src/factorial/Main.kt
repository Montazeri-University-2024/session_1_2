package factorial

fun main() {
    println(factorial(4))
}

fun factorial(number: Int): Int {
    var result = 1
    for (n in number downTo 1) {
        result *= n
    }
    return result
}