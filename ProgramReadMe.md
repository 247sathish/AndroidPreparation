# **Program**

**Fibonacci**
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8,
13, 21, 34, 55 etc.

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
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.

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
A palindrome is a word, phrase, number, or sequence of characters that reads the same forward and
backward.
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

**Factorial**
4! = 4*3*2*1 = 24

```java
public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int factorialResult = factorial(number);
        System.out.println("The factorial of " + number + " is: " + factorialResult);
    }
}
```

```kotlin
fun factorial(n: Int): Int {
    if (n == 0 || n == 1)
        return 1

    var result = 1
    for (i in 2..n) {
        result *= i
    }

    return result
}


fun main() {
    val number = 5
    val factorialResult = factorial(number)
    println("The factorial of $number is: $factorialResult")
}
```

Factorial Program using recursion

```java
public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int factorialResult = factorial(number);
        System.out.println("The factorial of " + number + " is: " + factorialResult);
    }
}
```

```kotlin
fun factorial(n: Int): Int {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    val number = 5
    val factorialResult = factorial(number)
    println("The factorial of $number is: $factorialResult")
}

```

**Reverse a Number**

```java
public class ReverseNumber {
    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverse(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}

```

```kotlin
fun reverse(number: Int): Int {
    var n = number
    var reversedNumber = 0

    while (n != 0) {
        val digit = n % 10
        reversedNumber = reversedNumber * 10 + digit
        n /= 10
    }

    return reversedNumber
}

fun main() {
    val number = 12345
    val reversedNumber = reverse(number)
    println("Original number: $number")
    println("Reversed number: $reversedNumber")
}
```

**Find Largest of Three Numbers**

```java
public class LargestOfThree {
    public static int findLargest(int num1, int num2, int num3) {
        int largest = num1;

        if (num2 > largest)//change to lesthan means find smallest number
            largest = num2;

        if (num3 > largest)
            largest = num3;

        return largest;
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int number3 = 15;

        int largestNumber = findLargest(number1, number2, number3);

        System.out.println("The largest number among " + number1 + ", " + number2 + ", and " + number3 + " is: " + largestNumber);
    }
}

```

```kotlin
fun findLargest(num1: Int, num2: Int, num3: Int): Int {
    var largest = num1

    if (num2 > largest)
        largest = num2

    if (num3 > largest)
        largest = num3

    return largest
}

fun main() {
    val number1 = 50
    val number2 = 20
    val number3 = 15

    val largestNumber = findLargest(number1, number2, number3)

    println("The largest number among $number1, $number2, and $number3 is: $largestNumber")
}

```

**Display Even Numbers**

```java
public class EvenNumbers {
    public static void displayEvenNumbers(int start, int end) {
        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            //if (i % 2 != 0)//odd number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a newline after displaying the even numbers
    }

    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 20;

        displayEvenNumbers(startNumber, endNumber);
    }
}

```

```kotlin
fun displayEvenNumbers(start: Int, end: Int) {
    println("Even numbers between $start and $end:")
    for (i in start..end) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
    println() // Print a newline after displaying the even numbers
}

fun main() {
    val startNumber = 1
    val endNumber = 20

    displayEvenNumbers(startNumber, endNumber)
}

```

# **Array**

**copy all elements of one array into another array**

```java
public class ArrayCopy {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];

        // Copy elements from sourceArray to destinationArray
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Print the elements of destinationArray
        System.out.print("Copied elements: ");
        for (int num : destinationArray) {
            System.out.print(num + " ");
        }
    }
}
```

```kotlin
fun main() {
    val sourceArray = intArrayOf(1, 2, 3, 4, 5)
    val destinationArray = IntArray(sourceArray.size)

    // Copy elements from sourceArray to destinationArray
    for (i in sourceArray.indices) {
        destinationArray[i] = sourceArray[i]
    }

    // Print the elements of destinationArray
    print("Copied elements: ")
    for (num in destinationArray) {
        print("$num ")
    }
}

```

**duplicate elements of an array**

```java
public class DuplicateElements {
    public static void findDuplicates(int[] arr) {
        System.out.print("Duplicate elements in the array: ");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 3};

        findDuplicates(array);
    }
}

```

```kotlin
fun findDuplicates(arr: IntArray) {
    print("Duplicate elements in the array: ")

    for (i in 0 until arr.size - 1) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                print("${arr[i]} ")
                break
            }
        }
    }
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 2, 5, 6, 1, 3)

    findDuplicates(array)
}

```

**print the elements of an array in reverse order**

```java
public class ReverseArray {
    public static void printArrayInReverse(int[] arr) {
        System.out.print("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        printArrayInReverse(array);
    }
}

```

```kotlin
fun printArrayInReverse(arr: IntArray) {
    print("Array in reverse order: ")
    for (i in arr.size - 1 downTo 0) {
        print("${arr[i]} ")
    }
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)

    printArrayInReverse(array)
}

```

**print the elements of an array present on even position**

```java
public class EvenPositionElements {
    public static void printEvenPositionElements(int[] arr) {
        System.out.print("Elements at even positions: ");
        for (int i = 0; i < arr.length; i += 2) //int i=1 means odd
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        printEvenPositionElements(array);
    }
}
```

```kotlin
fun printEvenPositionElements(arr: IntArray) {
    print("Elements at even positions: ")
    for (i in arr.indices step 2) //for (i in 1 until arr.size step 2) means odd
    {
        print("${arr[i]} ")
    }
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)

    printEvenPositionElements(array)
}

```

**print the largest element in an array**

```java
public class LargestElement {
    public static int findLargest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) //< lessthan using for find smallest
            {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 9, 2, 7};

        int largestElement = findLargest(array);
        System.out.println("The largest element in the array is: " + largestElement);
    }
}

```

```kotlin
fun findLargest(arr: IntArray): Int {
    var largest = arr[0]

    for (i in 1 until arr.size) {
        if (arr[i] > largest) {
            largest = arr[i]
        }
    }

    return largest
}

fun main() {
    val array = intArrayOf(5, 3, 9, 2, 7)

    val largestElement = findLargest(array)
    println("The largest element in the array is: $largestElement")
}

```

**sort the elements of an array in ascending order**

```java
public class SortAsc {
    public static void sortArrayAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])//< lessthan using for decending order
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 7, 1};

        sortArrayAscending(array);

        System.out.println("Elements of array sorted in ascending order: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}


```

```kotlin
fun sortArrayAscending(arr: IntArray) {
    for (i in 0 until arr.size - 1) {
        for (j in i + 1 until arr.size) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
}

fun main() {
    val array = intArrayOf(5, 2, 8, 7, 1)

    sortArrayAscending(array)

    println("Elements of array sorted in ascending order: ")
    for (num in array) {
        print("$num ")
    }
}
```

**find Third Largest Number in an Array**

```java
public class ThirdLargestInArrayExample {
    public static int getThirdLargest(int[] array, int size) {
        if (array == null || size < 3) {
            throw new IllegalArgumentException("Array should have at least three elements.");
        }

        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[size - 3];
    }

    public static void main(String args[]) {
        int numbers[] = {12, 2, 5, 3, 50, 100, 1001, 10, 1000};

        try {
            int thirdLargest = getThirdLargest(numbers, 9);
            System.out.println("Third Largest: " + thirdLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

```kotlin
class ThirdLargestInArrayExample {
    companion object {
        fun getThirdLargest(arr: IntArray, total: Int): Int {
            if (arr.size < 3) {
                throw IllegalArgumentException("Array should have at least three elements.")
            }

            for (i in 0 until total) {
                for (j in i + 1 until total) {
                    if (arr[i] > arr[j]) {
                        val temp = arr[i]
                        arr[i] = arr[j]
                        arr[j] = temp
                    }
                }
            }

            return arr[total - 3]
        }
    }
}

fun main() {
    val numbers = intArrayOf(12, 2, 5, 3, 50, 100, 1001, 10, 1000)

    try {
        val thirdLargest = ThirdLargestInArrayExample.getThirdLargest(numbers, 9)
        println("Third Largest: $thirdLargest")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

```

**find Second Smallest Number in an Array**

```java
public class SecondSmallestInArrayExample {
    public static int getSecondSmallest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];//2nd element because index starts from 0  
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 5, 6, 3, 2};
        System.out.println("Second smallest: " + getSecondSmallest(a, 6));
    }
}
//return a[total-1] means finding largest number in array
//return a[total-3] means finding third largest number in array
//return a[0] means finding smallest number in array
//return a[3] means finding third smallest number in array

```

```kotlin
class SecondSmallestInArrayExample {
    companion object {
        fun getSecondSmallest(arr: IntArray, total: Int): Int {
            if (arr.size < 2) {
                throw IllegalArgumentException("Array should have at least two elements.")
            }

            for (i in 0 until total) {
                for (j in i + 1 until total) {
                    if (arr[i] > arr[j]) {
                        val temp = arr[i]
                        arr[i] = arr[j]
                        arr[j] = temp
                    }
                }
            }

            return arr[1]
        }
    }
}

fun main() {
    val numbers = intArrayOf(1, 2, 5, 6, 3, 2)

    try {
        val secondSmallest = SecondSmallestInArrayExample.getSecondSmallest(numbers, 6)
        println("Second Smallest: $secondSmallest")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
```

**Remove duplicate element in an Array**

```java
public class RemoveDuplicateInArrayExample {

    public static int removeDuplicateElements(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];

        // Copying back to the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 40, 50, 50};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);

        // Printing array elements
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

OR

```java
public class RemoveDuplicatesFromArrayExample {

    public static void removeDuplicates(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int length = arr.length;
        int uniqueIndex = 1;

        for (int i = 1; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueIndex; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }

        // Fill the remaining elements with 0 (optional, depending on your requirements)
        for (int i = uniqueIndex; i < length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 5, 6};
        removeDuplicates(numbers);

        System.out.println("Array without Duplicates: ");
        for (int num : numbers) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }
}

```

```kotlin
fun removeDuplicates(arr: IntArray): IntArray {
    if (arr.size < 2) {
        return arr
    }

    val uniqueList = mutableListOf<Int>()

    for (num in arr) {
        var isDuplicate = false
        for (uniqueNum in uniqueList) {
            if (num == uniqueNum) {
                isDuplicate = true
                break
            }
        }
        if (!isDuplicate) {
            uniqueList.add(num)
        }
    }

    val result = IntArray(uniqueList.size)
    for (i in uniqueList.indices) {
        result[i] = uniqueList[i]
    }

    return result
}

fun main() {
    val numbers = intArrayOf(1, 2, 2, 3, 4, 4, 5, 5, 6)
    val result = removeDuplicates(numbers)

    println("Array without Duplicates: ${result.joinToString(" ")}")
}
```

**print Odd and Even Numbers from an Array**

```java

public class OddEvenNumbers {
    public static void printOddEvenNumbers(int[] arr) {
        System.out.println("Even numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printOddEvenNumbers(numbers);
    }
}


```

```kotlin


fun printOddEvenNumbers(arr: IntArray) {
    println("Even numbers:")
    arr.forEach { num ->
        if (num % 2 == 0) {
            print("$num ")
        }
    }
    println()

    println("Odd numbers:")
    arr.forEach { num ->
        if (num % 2 != 0) {
            print("$num ")
        }
    }
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    printOddEvenNumbers(numbers)
}

```

**Sort an Array using the for Loop**

```java

public class SortArrayExample2 {
    public static void main(String[] args) {
        // Creating an instance of an array
        int[] arr = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.println("Array elements after sorting:");

        // Sorting logic (Bubble Sort)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            // Prints the sorted element of the array
            System.out.println(arr[i]);
        }
    }
}



```

```kotlin
fun main() {
    // creating an instance of an array
    val arr = intArrayOf(78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65)
    println("Array elements after sorting:")

    // sorting logic (Bubble Sort)
    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            var tmp = 0
            if (arr[i] > arr[j]) {
                tmp = arr[i]
                arr[i] = arr[j]
                arr[j] = tmp
            }
        }
        // prints the sorted element of the array
        println(arr[i])
    }
}


```

# **String**

**Count the total number of characters in a string**

```java
public class CharacterCount {
    public static int countCharacters(String str) {
        int count = 0;
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != 'l')//Counts each character except l letter 
            {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        int totalCharacters = countCharacters(str);

        System.out.println("Total number of characters in the string: " + totalCharacters);
    }
}

```

```kotlin
fun countCharacters(str: String): Int {
    var count = 0
    val charArray = str.toCharArray()

    for (i in 0 until charArray.size) {
        if (charArray[i] != 'l') { // Counts each character except the letter 'l'
            count++
        }
    }

    return count
}

fun main() {
    val str = "Hello, World!"
    val totalCharacters = countCharacters(str)

    println("Total number of characters in the string: $totalCharacters")
}

```

**count the total number of vowels and consonants in a string**

```java
public class VowelConsonantCount {
    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1)//character avilable in "vowels"  returs that string index or return -1
                {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);
        System.out.println("Total number of consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        String str = "Hue!";
        countVowelsAndConsonants(str);
    }
}
```

OR

```java
public class CountVowelConsonant {
    public static void main(String[] args) {

        //Counter variable to store the count of vowels and consonant    
        int vCount = 0, cCount = 0;

        //Declare a string    
        String str = "This is a really simple sentence";

        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            //Checks whether a character is a vowel    
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter    
                vCount++;
            }
            //Checks whether a character is a consonant    
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                //Increments the consonant counter    
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
```

```kotlin

fun countVowelsAndConsonants(str: String) {
    var vowelCount = 0
    var consonantCount = 0
    val vowels = "AEIOUaeiou"

    for (ch in str) {
        if (ch.isLetter()) {
            if (vowels.contains(ch)) {
                vowelCount++
            } else {
                consonantCount++
            }
        }
    }

    println("Total number of vowels: $vowelCount")
    println("Total number of consonants: $consonantCount")
}

fun main() {
    val str = "Hello"
    countVowelsAndConsonants(str)
}
```

OR

```kotlin
fun isVowel(ch: Char): Boolean {
    return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
            ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
}

fun countVowelsAndConsonants(str: String) {
    var vowelCount = 0
    var consonantCount = 0

    for (ch in str) {
        if (ch.isLetter()) {
            if (isVowel(ch)) {
                vowelCount++
            } else {
                consonantCount++
            }
        }
    }

    println("Total number of vowels: $vowelCount")
    println("Total number of consonants: $consonantCount")
}

fun main() {
    val str = "Hello"
    countVowelsAndConsonants(str)
}

```

**Remove all the white spaces from a string**

```java

public class removeWhiteSpace {
    public static void main(String[] args) {

        String str1 = "Remove white spaces";

        //Removes the white spaces using regex    
        str1 = str1.replaceAll("\\s+", "");

        System.out.println("String after removing all the white spaces : " + str1);
    }
}

```

OR

```java
public class RemoveWhiteSpaces {
    public static String removeWhiteSpaces(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String inputString = "Hello, World! How are you?";
        String result = removeWhiteSpaces(inputString);
        System.out.println("String without white spaces: " + result);
    }
}
```

```kotlin

fun removeWhiteSpaces(str: String): String {
    val stringBuilder = StringBuilder()

    for (ch in str) {
        if (!ch.isWhitespace()) {
            stringBuilder.append(ch)
        }
    }

    return stringBuilder.toString()
}

fun main() {
    val inputString = "Hello, World! How are you?"
    val result = removeWhiteSpaces(inputString)
    println("String without white spaces: $result")
}

```

**Determine whether a given string is palindrome**

```java

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String inputString = "radar";

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
}


```

OR

```java

public class PalindromeString {
    public static void main(String[] args) {
        String string = "KayAk";
        boolean flag = true;

        //Converts the given string into lowercase    
        string = string.toLowerCase();

        //Iterate the string forward and backward, compare one character at a time     
        //till middle of the string is reached    
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}


```

```kotlin

fun main() {
    var string = "KayAk"
    var flag = true

    // Converts the given string into lowercase
    string = string.toLowerCase()

    // Iterate the string forward and backward, compare one character at a time
    // till the middle of the string is reached
    for (i in 0 until string.length / 2) {
        if (string[i] != string[string.length - i - 1]) {
            flag = false
            break
        }
    }

    if (flag) {
        println("Given string is palindrome")
    } else {
        println("Given string is not a palindrome")
    }
}


```

```kotlin
fun isPalindrome(str: String): Boolean {
    var left = 0
    var right = str.length - 1

    while (left < right) {
        if (str[left] != str[right]) {
            return false
        }
        left++
        right--
    }

    return true
}

fun main() {
    val inputString = "radar"

    if (isPalindrome(inputString)) {
        println("$inputString is a palindrome.")
    } else {
        println("$inputString is not a palindrome.")
    }
}

```

**Find Reverse of the string**

```java

public class Reverse {
    public static void main(String[] args) {
        String string = "Dream big";
        //Stores the reverse of given string    
        String reversedStr = "";

        //Iterate through the string from last and add each character to variable reversedStr    
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + string.charAt(i);
        }

        System.out.println("Original string: " + string);
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr);
    }
}


```

```java

public class ReverseString {
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String reversedString = reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);
    }
}


```

```kotlin
fun main() {
    val string = "Dream big"
// Stores the reverse of the given string
    var reversedStr = ""

    // Iterate through the string from last and add each character to the variable reversedStr
    for (i in string.length - 1 downTo 0) {
        reversedStr += string[i]
    }

    println("Original string: $string")
    // Display the reverse of the given string
    println("Reverse of given string: $reversedStr")
}
```

```kotlin

fun reverseString(str: String): String {
    val charArray = str.toCharArray()
    var left = 0
    var right = charArray.size - 1

    while (left < right) {
        val temp = charArray[left]
        charArray[left] = charArray[right]
        charArray[right] = temp

        left++
        right--
    }

    return String(charArray)
}

fun main() {
    val inputString = "Hello, World!"
    val reversedString = reverseString(inputString)
    println("Reversed String: $reversedString")
}

```

**Find the duplicate word in a string**

```java

public class DuplicateWordsInString {
    public static void findDuplicateWords(String str) {
        // Split the string into words using whitespace as the delimiter
        String[] words = str.split("\\s+");
        int count;

        System.out.println("Duplicate words in the string:");

        // Iterate through the words and find duplicates
        for (int i = 0; i < words.length; i++) {
            count = 1;

            // Check if the word is already checked
            if (words[i] != null) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        count++;
                        // Mark the word as checked to avoid duplicates
                        words[j] = null;
                    }
                }

                // Display the duplicate word if found
                if (count > 1) {
                    System.out.println(words[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "Java is a programming language. Python is also a programming language. Java is versatile.";
        findDuplicateWords(inputString);
    }
}


```

```kotlin

fun findDuplicateWords(str: String) {
    // Split the string into words using whitespace as the delimiter
    val words = str.split("\\s+".toRegex()).toTypedArray()
    var count: Int

    println("Duplicate words in the string:")

    // Iterate through the words and find duplicates
    for (i in 0 until words.size) {
        count = 1

        // Check if the word is already checked
        if (words[i] != null) {
            for (j in i + 1 until words.size) {
                if (words[i].equals(words[j], ignoreCase = true)) {
                    count++
                    // Mark the word as checked to avoid duplicates
                    words[j] = null
                }
            }

            // Display the duplicate word if found
            if (count > 1) {
                println(words[i])
            }
        }
    }
}

fun main() {
    val inputString =
        "Java is a programming language. Python is also a programming language. Java is versatile."
    findDuplicateWords(inputString)
}

```

**Swap two string variables without using third or temp variable**

```java

public class SwapStringsExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Swap the strings using concatenation
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}

```

```kotlin

fun main() {
    var str1 = "Hello"
    var str2 = "World"

    println("Before swapping:")
    println("str1: $str1")
    println("str2: $str2")

    // Swap the strings using Kotlin's smart string interpolation
    str1 = "$str2$str1"
    str2 = str1.substring(str2.length)
    str1 = str1.substring(0, str1.length - str2.length)

    println("After swapping:")
    println("str1: $str1")
    println("str2: $str2")
}


```

**Remove duplicates from ArrayList**

```java

import java.util.ArrayList;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("apple");
        words.add("grapes");
        words.add("banana");

        System.out.println("Original ArrayList: " + words);
        removeDuplicates(words);
        System.out.println("ArrayList after removing duplicates: " + words);
    }

    public static void removeDuplicates(ArrayList<String> list) {
        int size = list.size();

        for (int i = 0; i < size - 1; i++) {
            String currentElement = list.get(i);
            for (int j = i + 1; j < size; j++) {
                String nextElement = list.get(j);
                if (currentElement.equals(nextElement)) {
                    list.remove(j);
                    size--;
                    j--;
                }
            }
        }
    }
}


```

```kotlin

fun main() {
    val words = ArrayList<String>()
    words.add("apple")
    words.add("banana")
    words.add("orange")
    words.add("apple")
    words.add("grapes")
    words.add("banana")

    println("Original ArrayList: $words")
    removeDuplicates(words)
    println("ArrayList after removing duplicates: $words")
}

fun removeDuplicates(list: ArrayList<String>) {
    val size = list.size

    for (i in 0 until size - 1) {
        val currentElement = list[i]
        for (j in i + 1 until size) {
            val nextElement = list[j]
            if (currentElement == nextElement) {
                list.removeAt(j)
            }
        }
    }
}


```


**Find length of string in java without using length()**


```java
public class StringLength {
public static int getLength(String str) {
int count = 0;

        // Iterate through the string and count the characters
        for (char c : str.toCharArray()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = getLength(str);
        System.out.println("Length of the string: " + length);
    }
}
```




**demonstration of try catch and finally**

The try block is used to enclose the code that may raise an exception. 

If an exception occurs within the try block, it is caught and handled by the corresponding catch block. 

The finally block is used to specify a piece of code that will always be executed, whether an exception occurs or not.

```java
class MyException {
    public static void main(String args[]) {
        try {
            int a = 10, b = 0, c;
            c = a / b;//exception occurred
        } catch (ArithmeticException e) {
            System.out.println("EXception caught:" + e);//exception caught
        } finally {
            System.out.println("Statement out of try-catch block");//this will be always executed
        }
    }
}
```

	Sr.No	Exception Type	                Cause of Exception
	1.	  ArithmeticException	        Arithmetic error such as diving number by zero.
	2.	  ArraysOutOfBoundExceptions	Caused when array index is out of bound.
	3.	  IOException	                Caused by an attempt to access a non existed file.
	4.	  NullPointerException	        Caused by referencing a null object.



Sure, I'll provide a demonstration of `try`, `catch`, and `finally` with examples for each exception:

1. `ArithmeticException`:
```java
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }

    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }
}
```

Output:
```
ArithmeticException caught: / by zero
Finally block executed.
Program continues...
```

2. `ArrayIndexOutOfBoundsException`:
```java
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Element at index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
```

Output:
```
ArrayIndexOutOfBoundsException caught: 5
Finally block executed.
Program continues...
```

3. `IOException`:
```java
import java.io.*;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("non_existent_file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println("Line from file: " + line);
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
```

Output:
```
IOException caught: non_existent_file.txt (No such file or directory)
Finally block executed.
Program continues...
```

4. `NullPointerException`:
```java
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
```

Output:
```
NullPointerException caught: null
Finally block executed.
Program continues...
```

In each example, the appropriate exception is caught in the `catch` block, and the `finally` block is executed regardless of whether an exception occurred or not. The program continues after the exception handling.





**Print even and odd numbers using threads**

```java

public class EvenOddPrinter {
    private static final int MAX_NUMBER = 10;
    private static int currentNumber = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        // Create two threads, one for printing even numbers and another for odd numbers
        Thread evenThread = new Thread(() -> printEvenNumbers(), "EvenThread");
        Thread oddThread = new Thread(() -> printOddNumbers(), "OddThread");

        // Start both threads
        evenThread.start();
        oddThread.start();
    }

    public static void printEvenNumbers() {
        while (currentNumber <= MAX_NUMBER) {
            // Synchronize on the common lock to ensure exclusive access to the shared currentNumber
            synchronized (lock) {
                // Check if the current number is even
                if (currentNumber % 2 == 0) {
                    // Print the current even number along with the thread name
                    System.out.println(Thread.currentThread().getName() + ": " + currentNumber);
                    // Increment the currentNumber for the next iteration
                    currentNumber++;
                }
            }
        }
    }

    public static void printOddNumbers() {
        while (currentNumber <= MAX_NUMBER) {
            // Synchronize on the common lock to ensure exclusive access to the shared currentNumber
            synchronized (lock) {
                // Check if the current number is odd
                if (currentNumber % 2 != 0) {
                    // Print the current odd number along with the thread name
                    System.out.println(Thread.currentThread().getName() + ": " + currentNumber);
                    // Increment the currentNumber for the next iteration
                    currentNumber++;
                }
            }
        }
    }
}

```

In this code, we have a shared currentNumber variable that starts from 1. Two threads (evenThread
and oddThread) are created, each responsible for printing either even or odd numbers. Both methods (
printEvenNumbers() and printOddNumbers()) are executed concurrently by their respective threads.

To ensure that the shared currentNumber variable is accessed safely by both threads without data
race, we use a common lock object and synchronize on it using the synchronized keyword. This allows
only one thread to access the synchronized block at a time, preventing any potential conflicts when
accessing and updating the currentNumber.

The printEvenNumbers() method checks if the current number is even using the % (modulo) operator and
prints it if it's even. The printOddNumbers() method checks if the current number is odd and prints
it accordingly. The process repeats until the currentNumber reaches the MAX_NUMBER, which is set to
10 in this example.

When you run this code, the two threads will print even and odd numbers alternately until the
maximum number (10) is reached.

```kotlin
import kotlin.concurrent.thread

object EvenOddPrinter {
    private const val MAX_NUMBER = 10
    private var currentNumber = 1
    private val lock = Any()

    @JvmStatic
    fun main(args: Array<String>) {
        // Create two threads, one for printing even numbers and another for odd numbers
        val evenThread = thread(start = true) { printEvenNumbers() }
        val oddThread = thread(start = true) { printOddNumbers() }

        // Wait for both threads to complete
        evenThread.join()
        oddThread.join()
    }

    private fun printEvenNumbers() {
        while (currentNumber <= MAX_NUMBER) {
            // Synchronize on the common lock to ensure exclusive access to the shared currentNumber
            synchronized(lock) {
                // Check if the current number is even
                if (currentNumber % 2 == 0) {
                    // Print the current even number along with the thread name
                    println("${Thread.currentThread().name}: $currentNumber")
                    // Increment the currentNumber for the next iteration
                    currentNumber++
                }
            }
        }
    }

    private fun printOddNumbers() {
        while (currentNumber <= MAX_NUMBER) {
            // Synchronize on the common lock to ensure exclusive access to the shared currentNumber
            synchronized(lock) {
                // Check if the current number is odd
                if (currentNumber % 2 != 0) {
                    // Print the current odd number along with the thread name
                    println("${Thread.currentThread().name}: $currentNumber")
                    // Increment the currentNumber for the next iteration
                    currentNumber++
                }
            }
        }
    }
}

```

```java

public class OddEven implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub

        for (int i = 1; i <= 10; i++) {
            synchronized (this) {
                if (i % 2 == 0 && Thread.currentThread().getName().equals("t2")) {
                    try {
                        notifyAll();
                        System.out.println("Even Thread : " + i);
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                } else if (i % 2 != 0 && Thread.currentThread().getName().equals("t1")) {
                    try {
                        notifyAll();
                        System.out.println("Odd Thread : " + i);
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public static void main(String[] args) {

        OddEven obj = new OddEven();
        Thread t1 = new Thread(obj, "t1");
        Thread t2 = new Thread(obj, "t2");
        t1.start();
        t2.start();

    }
}

```


```java
public class OddEvenPrinter {
public static void main(String[] args) {
// Create two threads, one for printing odd numbers and another for even numbers
Thread oddThread = new Thread(() -> printNumbers(true), "OddThread");
Thread evenThread = new Thread(() -> printNumbers(false), "EvenThread");

        // Start both threads
        oddThread.start();
        evenThread.start();
    }

    public static void printNumbers(boolean isOddThread) {
        // Determine the starting number based on the thread type (odd or even)
        int start = isOddThread ? 1 : 2;

        // Iterate through the numbers and print the ones for the respective thread type
        for (int i = start; i <= 10; i += 2) {
            if (isOddThread) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } else {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
```




