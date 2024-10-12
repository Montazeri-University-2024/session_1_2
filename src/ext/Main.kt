package ext


fun repeatAction(number: Int, action: () -> Unit) {
    for (i in 0..number) {
        action()
    }
}

fun List<Int>.myFilter(condition: (number: Int) -> Boolean): List<Int> {
    val newList = mutableListOf<Int>()
    this.forEach {
        if (condition(it)) {
            newList.add(it)
        }
    }
    return newList
}

fun performOperation(num1: Int, num2: Int, operation: (num1: Int, num2: Int) -> Int): Int {
    return operation(num1, num2)
}