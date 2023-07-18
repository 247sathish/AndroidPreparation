**Fibonacci**
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
1. Using Recursion:
```java
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
```
```kotlin
fun fibonacci(n: Int): Int {
    if (n <= 1)
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    val count = 10
    for (i in 0 until count) {
        print("${fibonacci(i)} ")
    }
}
```


2. Using an Array:
```java
public class Fibonacci {
    public static void main(String[] args) {
        int count = 10;
        int[] fibonacci = new int[count];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
```
```kotlin
fun main() {
    val count = 10
    val fibonacci = IntArray(count)
    fibonacci[0] = 0
    fibonacci[1] = 1

    for (i in 2 until count) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }

    for (i in 0 until count) {
        print("${fibonacci[i]} ")
    }
}
```
3. Using Variables:
```java
public class Fibonacci {
    public static void main(String[] args) {
        int count = 10;
        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 2; i < count; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
```
```kotlin
fun main() {
    val count = 10
    var first = 0
    var second = 1

    print("$first $second ")

    for (i in 2 until count) {
        val next = first + second
        print("$next ")
        first = second
        second = next
    }
}
```




**Prime Number**
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
```java
public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int num = 17;

        if (isPrime(num))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
```
```kotlin
fun isPrime(number: Int): Boolean {
    if (number <= 1)
        return false

    for (i in 2 until number) {
        if (number % i == 0)
            return false
    }

    return true
}

fun main() {
    val num = 17

    if (isPrime(num))
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}
```



**Palindrome**
A palindrome is a word, phrase, number, or sequence of characters that reads the same forward and backward. 
In other words, it remains unchanged when its characters are reversed.

Here are a few examples of palindromes:
Words: "level", "deed", "radar", "noon"
Phrases: "A man, a plan, a canal: Panama", "Madam, in Eden, I'm Adam"
Numbers: 121, 1221, 12321
Character Sequences: "ABBA", "1234321", "abcddcba"
```java
public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "AbcBa";

        if (isPalindrome(word))
            System.out.println(word + " is a palindrome.");
        else
            System.out.println(word + " is not a palindrome.");
    }
}
```
```kotlin
fun isPalindrome(str: String): Boolean {
    val input = str.toLowerCase()
    var left = 0
    var right = input.length - 1

    while (left < right) {
        if (input[left] != input[right])
            return false
        left++
        right--
    }

    return true
}

fun main() {
    val word = "AbcBa"

    if (isPalindrome(word))
        println("$word is a palindrome.")
    else
        println("$word is not a palindrome.")
}

```
Palindrome number
```java
public class Palindrome {
public static boolean isPalindrome(int number) {
int originalNumber = number;
int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverse;
    }

    public static void main(String[] args) {
        int num = 12321;

        if (isPalindrome(num))
            System.out.println(num + " is a palindrome number.");
        else
            System.out.println(num + " is not a palindrome number.");
    }
}
```
```kotlin
fun isPalindrome(number: Int): Boolean {
val originalNumber = number
var reverse = 0

    var num = number
    while (num != 0) {
        val digit = num % 10
        reverse = reverse * 10 + digit
        num /= 10
    }

    return originalNumber == reverse
}

fun main() {
val num = 12321

    if (isPalindrome(num))
        println("$num is a palindrome number.")
    else
        println("$num is not a palindrome number.")
}
```