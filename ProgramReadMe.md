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

Display Even Numbers 
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
copy all elements of one array into another array
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
        return `array[size - 3]`;
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

            return `arr[total - 3]`
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
public class SecondSmallestInArrayExample{  
	public static int getSecondSmallest(int[] a, int total){  
	    int temp;  
            for (int i = 0; i < total; i++)   
                    {  
                        for (int j = i + 1; j < total; j++)   
                        {  
                            if (a[i] > a[j])   
                            {  
                                temp = a[i];  
                                a[i] = a[j];  
                                a[j] = temp;  
                            }  
                        }  
                    }  
                   return `a[1]`;//2nd element because index starts from 0  
            }  
	public static void main(String args[]){  
	int a[]={1,2,5,6,3,2};  
	System.out.println("Second smallest: "+getSecondSmallest(a,6));  
	}
}
//return a[total-1] means finding largest number in array
//return a[total-3] means finding third largest number in array
//return a[0] means finding smallest number in array
//return a[3] means finding third smallest number in array

```