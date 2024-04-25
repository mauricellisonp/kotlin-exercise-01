import utils.*

fun main() {
    println("The factorial of 5 is: ${getFactorial(5)}")
    println("Is 6 a prime number? ${isPrime(6)}")
    println("The reverse of \"Hello World\" is: ${reverseString("Hello World")}")
    println("The max element in the array [4, 5, 6, 10, 1] is: ${findMaxElement(arrayOf(4, 5, 6, 10, 1))}")
    println("The fibonacci value at the 10th term is: ${getFibonacci(10)}")
    println("Is \"Was it a cat I saw\" a palindrome? ${checkPalindrome(" Was it a cat I saw")}")
    println("The sum of digits 3697 is: ${getSumOfDigits(3697)}")
    println("The GCD of 10 and 30 is: ${getGCD(10, 30)}")
    println("The number of vowels in the string \"Ellison Maurice\" are: ${countVowels(" Ellison Maurice")}")
    println("100°C in Fahrenheit is: ${celsiusToFahrenheit(100.0)} °F")
}