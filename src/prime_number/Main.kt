package prime_number

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(isPrime(11))
}

fun isPrime(number: Int): Boolean {
    for (i in 2..number - 1) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
