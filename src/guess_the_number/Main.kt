package guess_the_number

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    guessNumber(Random.nextInt(1..100), 10)
}

fun guessNumber(targetNumber: Int, guessCounter: Int) {
    var counter = 0
    while (counter < guessCounter) {
        print("${counter+1}/$guessCounter, guess :")
        val input = readlnOrNull()?.toInt()
        input?.let {
            if (input == targetNumber) {
                println("__________________________")
                println("You did it")
                println("__________________________")
                return
            }
            if (input > targetNumber) {
                println("Guess Smaller")
            }
            if (input < targetNumber) {
                println("Guess Bigger")
            }
        }
        counter++
    }
}