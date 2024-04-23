import Math

fun main() {
    println("The factorial of 5 is: ${Math().getFactorial(5)}")
    println("Is 6 a prime number? ${Math().isPrime(6)}")
    println("The reverse of \"Hello World\" is: ${Math().reverseString("Hello World")}")
    println("The max element in the array [4, 5, 6, 10, 1] is: ${Math().findMaxElement(arrayOf(4, 5, 6, 10, 1))}")
    println("The fibonacci value at the 10th term is: ${Math().getFibonacci(10)}")
    println("Is \"Was it a cat I saw\" a palindrome? ${Math().checkPalindrome(" Was it a cat I saw")}")
    println("The sum of digits 3697 is: ${Math().getSumOfDigits(3697)}")
    println("The GCD of 10 and 30 is: ${Math().getGCD(10, 30)}")
    println("The number of vowels in the string \"Ellison Maurice\" are: ${Math().countVowels(" Ellison Maurice")}")
    println("100°C in Fahrenheit is: ${Math().celsiusToFahrenheit(100.0)} °F")
}