package character_counter

/*
*   تمرین شمارش تعداد تکرار در یک رشته:
*  */
fun main() {
    println(countCharacter("Hello world", 'l'))
}

fun countCharacter(text: String, char: Char): Int {
    var counter = 0
    for (i in 0..text.length - 1) {
        if (char == text[i]) {
            counter++
        }
    }
    return counter
}