package utils

fun getFactorial(number: Int): Int {
    var result = 1

    for (n in number downTo 2) {
        result *= n
    }

    return result
}

fun isPrime(number: Int, divisor: Int = 2): Boolean {
    if (number <= 3) {
        return true
    }

    if (number % divisor == 0) {
        return false
    }

    if (divisor * divisor > number) {
        return true
    }

    return isPrime(number, divisor + 1)
}

fun reverseString(input: String): String {
    return input.reversed()
}

fun <T : Comparable<T>> findMaxElement(array: Array<T>): T {
    return array.max()
}

fun getFibonacci(number: Int): Int {
    var term1 = 0
    var term2 = 1

    if (number == 1) {
        return 0
    }
    if (number == 2) {
        return term2
    }

    var fibonacciValue = 0

    for (i in 3..number) {
        fibonacciValue = term1 + term2
        term1 = term2
        term2 = fibonacciValue
    }

    return fibonacciValue
}

fun checkPalindrome(input: String): Boolean {
    val cleanInput = input.filter { it.isLetterOrDigit() }.lowercase()

    return cleanInput == cleanInput.reversed()
}

fun getSumOfDigits(number: Int): Int {
    return if (number == 0) {
        0
    } else {
        number % 10 + getSumOfDigits(number / 10)
    }
}

fun getGCD(number1: Int, number2: Int): Int {
    var num1 = number1
    var num2 = number2

    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }

    return num1
}

fun countVowels(input: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')

    return input.count { it.lowercaseChar() in vowels }
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}