array
1. **Declaration and Initialization**:

   ```java
   int[] numbers = {1, 2, 3, 4, 5}; // Array of integers
   String[] names = {"Alice", "Bob", "Charlie"}; // Array of strings
   double[] grades = new double[4]; // Array with a specified size
   ```

2. **Accessing Elements**:

   ```java
   int firstNumber = numbers[0]; // Access the first element
   String thirdName = names[2]; // Access the third element
   ```

3. **Iterating Through an Array**:

   ```java
   for (int i = 0; i < numbers.length; i++) {
       System.out.println(numbers[i]);
   }

   for (String name : names) {
       System.out.println(name);
   }
   ```

4. **Modifying Array Elements**:

   ```java
   numbers[1] = 10; // Modify the second element
   names[0] = "Alicia"; // Modify the first element
   ```

5. **Finding the Maximum and Minimum**:

   ```java
   int max = Arrays.stream(numbers).max().getAsInt();
   int min = Arrays.stream(numbers).min().getAsInt();
   ```

6. **Searching in an Array**:

   ```java
   int searchValue = 3;
   boolean containsValue = Arrays.asList(numbers).contains(searchValue);
   int indexOfValue = Arrays.asList(numbers).indexOf(searchValue);
   ```

7. **Copying Arrays**:

   ```java
   int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);
   ```

8. **Sorting Arrays**:

   ```java
   Arrays.sort(numbers); // Sort in ascending order
   Arrays.sort(names); // Sort alphabetically
   ```

9. **Multidimensional Arrays**:

   ```java
   int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
   int element = matrix[1][2]; // Accessing a 2D array element
   ```

10. **Array of Objects**:

    ```java
    Person[] people = new Person[3];
    people[0] = new Person("Alice", 25);
    people[1] = new Person("Bob", 30);
    ```





String

public class StringMethodsExample {
public static void main(String[] args) {
// Declaration
String str1 = "Hello, World!";
String str2 = new String("Java is fun!");

        // charAt
        char firstChar = str1.charAt(0); // 'H'

        // length
        int length = str1.length(); // 13

        // substring
        String substring = str1.substring(7); // "World!"
        String substring2 = str1.substring(0, 5); // "Hello"

        // concat
        String concatStr = str1.concat(" Welcome to Java!");

        // equals
        boolean isEqual = str1.equals(str2); // false

        // equalsIgnoreCase
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello, world!"); // true

        // indexOf
        int indexOfComma = str1.indexOf(','); // 5

        // contains
        boolean containsJava = str2.contains("Java"); // true

        // replace
        String replacedStr = str1.replace("World", "Universe");

        // toLowerCase and toUpperCase
        String lowercaseStr = str1.toLowerCase();
        String uppercaseStr = str1.toUpperCase();

        // split
        String sentence = "Java is a programming language";
        String[] words = sentence.split(" "); // ["Java", "is", "a", "programming", "language"]

        // join (Java 8+)
        String joinedWords = String.join("-", words); // "Java-is-a-programming-language"

        // trim
        String stringWithWhitespace = "   Java   ";
        String trimmedStr = stringWithWhitespace.trim(); // "Java"

        // Printing results
        System.out.println("Original String: " + str1);
        System.out.println("First Character: " + firstChar);
        System.out.println("Length: " + length);
        System.out.println("Substring: " + substring);
        System.out.println("Concatenated String: " + concatStr);
        System.out.println("Strings Equal? " + isEqual);
        System.out.println("Strings Equal (ignore case)? " + isEqualIgnoreCase);
        System.out.println("Index of Comma: " + indexOfComma);
        System.out.println("Contains 'Java'? " + containsJava);
        System.out.println("Replaced String: " + replacedStr);
        System.out.println("Lowercase String: " + lowercaseStr);
        System.out.println("Uppercase String: " + uppercaseStr);
        System.out.println("Split Words: ");
        for (String word : words) {
            System.out.println("- " + word);
        }
        System.out.println("Joined Words: " + joinedWords);
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}





arraylist

1. **Declaration and Initialization**:

   ```java
   import java.util.ArrayList;

   // Declaration
   ArrayList<String> names = new ArrayList<String>();

   // Initialization
   ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
   ```

2. **Adding Elements**:

   ```java
   names.add("Alice");
   names.add("Bob");
   names.add("Charlie");
   ```

3. **Accessing Elements**:

   ```java
   String firstPerson = names.get(0);
   ```

4. **Iterating Through ArrayList**:

   ```java
   for (String name : names) {
       System.out.println(name);
   }
   ```

5. **Modifying Elements**:

   ```java
   names.set(1, "Bobby"); // Modify the second element
   ```

6. **Removing Elements**:

   ```java
   names.remove(0); // Remove the first element
   names.remove("Charlie"); // Remove by value
   ```

7. **Checking for Existence**:

   ```java
   boolean containsBob = names.contains("Bob");
   ```

8. **Finding Size**:

   ```java
   int size = names.size();
   ```

9. **Clearing ArrayList**:

   ```java
   names.clear();
   ```

10. **Checking if ArrayList is Empty**:

    ```java
    boolean isEmpty = names.isEmpty();
    ```

11. **Sorting ArrayList**:

    ```java
    Collections.sort(names); // Sort alphabetically
    ```

12. **Copying ArrayList**:

    ```java
    ArrayList<String> copyOfNames = new ArrayList<String>(names);
    ```

13. **ArrayList of Custom Objects**:

    ```java
    class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    ArrayList<Person> people = new ArrayList<Person>();
    people.add(new Person("Alice", 25));
    people.add(new Person("Bob", 30));
    ```

14. **ArrayList of Different Data Types (Java 5 and later)**:

    ```java
    ArrayList<Object> mixedList = new ArrayList<Object>();
    mixedList.add("Hello");
    mixedList.add(42);
    mixedList.add(true);
    ```

15. **Converting ArrayList to Array**:

    ```java
    String[] namesArray = names.toArray(new String[0]);
    ```

16. **Retaining Common Elements Between Two ArrayLists**:

    ```java
    ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry"));
    ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("banana", "cherry", "date"));

    list1.retainAll(list2); // list1 now contains "banana" and "cherry"
    ```







Basic Programs

Check the given number is EVEN or ODD.
  ```java
package com.java.basic;

import java.util.Scanner;

/*
* EVEN OR ODD
* ------------
* Divide the given number by 2
* If the reminder is 0 then its EVEN
* If the reminder is 1 then its ODD
*
* 22 EVEN number
* 23 ODD number
*
*/
public class EvenOrOdd {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the any number : ");
int num = scanner.nextInt();
if( num % 2 == 0)
System.out.println("Given number is EVEN");
else
System.out.println("Given number is ODD");
scanner.close();
}
}
/*
OUTPUT
Enter the any number : 22
Given number is EVEN

	OUTPUT
	Enter the any number : 25
	Given number is ODD
*/
```

Write a Java Program to find the Factorial of given number.
package com.java.basic;

import java.util.Scanner;

/*
* Factorial
* ----------
* In mathematics, the factorial of a positive integer n,
* denoted by n!, is the product of all positive integers
* less than or equal to n:
*
*  n! can be written as
*  n! = 1 * 2 * 3 * .... * (n-1) * n;
*
*  n! can also be written as
*  n! = n * (n-1)!
*
* say N = 4: Factorial 4 ( 4! ) is equal to 24.
* 4! = 4 * 3 * 2 * 1;
* 5! = 5 * 4 * 3 * 2 * 1;
* 5! = 5 * 4!
*
*/
public class Factorial {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the any number : ");
int N = scanner.nextInt();

		int result =1;
		for(int i=1; i<=N; i++)
			result = result * i;
		
		System.out.print("Factorial of "+N);
		System.out.print(" is "+result);
		scanner.close();
	}
}
/*
OUTPUT
Enter the any number : 5
Factorial of 5 is 120

	OUTPUT
	Enter the any number : 10
	Factorial of 10 is 3628800
*/


Find the Factorial of a number using Recursion.
package com.java.basic;

import java.util.Scanner;

/*
* Factorial Using Recursion
* --------------------------
* In mathematics, the factorial of a positive integer n,
* denoted by n!, is the product of all positive integers
* less than or equal to n:
*
*  n! can be written as
*  n! = 1 * 2 * 3 * .... * (n-1) * n;
*
*  n! can also be written as
*  n! = n * (n-1)!
*  This approach helps to calculate using Recursion
*
*  5! = 5 * 4!
*  4! = 4 * 3!
*  3! = 3 * 2!
*  2! = 2 * 1!
*  1! = 1
*
*/
public class FactorialUsingRecursion {

	//using recursion calculate factorial
	public static int factorial(int n){
		if(n == 1)
			return 1;
		//n * (n-1)!
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any number : ");
		int N = scanner.nextInt();
		
		int result = factorial(N);
		
		System.out.println("Factorial of "+N+" is ");
		System.out.println(result);
		
		scanner.close();
	}
}
/*
OUTPUT
Enter the any number : 5
Factorial of 5 is 120

	OUTPUT
	Enter the any number : 10
	Factorial of 10 is 3628800
*/

Swap two numbers without using third variable approach 1
package com.java.basic;

import java.util.Scanner;

/*
* Swap Two Numbers
* -----------------
* It is possible to swap two numbers without
* using third variable.
*
* Approach 1::
* using +, - operators
* a = 15, b = 20
*
* a = a + b // after a = 35, b = 20
* b = a - b // after a = 35, b = 15
* a = a - b // after a = 20, b = 15
*
*/
public class SwapApproach1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value for a : ");
int a = scanner.nextInt();
System.out.println("Enter the value for b : ");
int b = scanner.nextInt();

		System.out.println("Before swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		
		//using +, - operators
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		
		scanner.close();
	}
}
/*
OUTPUT
Enter the value for a : 15
Enter the value for b : 20
Before swapping a & b :
a = 15, b = 20
After swapping a & b :
a = 20, b = 15

	OUTPUT
	Enter the value for a : 2
	Enter the value for b : 7
	Before swapping a & b : 
	a = 15, b = 10
	After swapping a & b : 
	a = 10, b = 15
*/


Swap two numbers without using third variable approach 2.
package com.java.basic;

import java.util.Scanner;

/*
* Swap Two Numbers
* -----------------
* It is possible to swap two numbers without
* using third variable.
*
* Approach 2::
* using *, / operators (Multiplication , Division)
* a = 15, b = 10
*
* a = a * b // after a = 150, b = 10
* b = a / b // after a = 150, b = 15
* a = a / b // after a = 10, b = 15
*
*/
public class SwapApproach2 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value for a : ");
int a = scanner.nextInt();
System.out.println("Enter the value for b : ");
int b = scanner.nextInt();

		System.out.println("Before swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		
		//using *, / operators
		a = a * b;
		b = a / b;
		a = a / b;
		
		System.out.println("After swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		
		scanner.close();
	}
}
/*
OUTPUT
Enter the value for a : 15
Enter the value for b : 20
Before swapping a & b :
a = 15, b = 20
After swapping a & b :
a = 20, b = 15

	OUTPUT
	Enter the value for a : 15
	Enter the value for b : 10
	Before swapping a & b : 
	a = 15, b = 10
	After swapping a & b : 
	a = 10, b = 15
*/

Swap two numbers without using third variable approach 3.
package com.java.basic;

import java.util.Scanner;

/*
* Swap Two Numbers
* ----------------
* It is possible to swap two numbers without
* using third variable.
*
* Approach 3::
* using ^ (XOR) operator
* a = 3, b = 10
* (0011) (1010)
*
* a = a ^ b // a = 0011 ^ 1010 = 1001
* b = a ^ b // b = 1001 ^ 1010 = 0011
* a = a ^ b // a = 1001 ^ 0011 = 1010
*
*/
public class SwapApproach3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value for a : ");
int a = scanner.nextInt();
System.out.println("Enter the value for b : ");
int b = scanner.nextInt();

		System.out.println("Before swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		
		//using ^ (XOR) operators
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		scanner.close();
	}
}
/*
OUTPUT
Enter the value for a : 15
Enter the value for b : 20
Before swapping a & b :
a = 15, b = 20
After swapping a & b :
a = 20, b = 15

	OUTPUT
	Enter the value for a : 15
	Enter the value for b : 10
	Before swapping a & b : 
	a = 15, b = 10
	After swapping a & b : 
	a = 10, b = 15
*/
How to check the given number is Positive or Negative in Java?
package com.java.basic;

import java.util.Scanner;

/*
* Positive Or Negative
* ---------------------
* An integer is a whole number that can be either
* greater than 0, called positive, or less than 0,
* called negative.
*
* Zero is neither positive nor negative.
*
* 100 is Positive Number
* -22 is Negative Number
*
*/
public class PositiveOrNegative {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any integer : ");

		int n = scanner.nextInt();
		if(n > 0 )
			System.out.println(n+" is a Positive Number.");
		else if( n < 0 )
			System.out.println(n+" is a Negative Number.");
		else
			System.out.println("Zero is neither Positive nor Negative.");
		
		scanner.close();
	}
}
/*
OUTPUT
Enter any integer : 155
155 is a Positive Number.

	OUTPUT
	Enter any integer : -77
	-77 is a Negative Number.

	OUTPUT
	Enter any integer : 0
	Zero is neither Positive nor Negative.
*/
Write a Java Program to find whether given number is Leap year or NOT?
package com.java.basic;

import java.util.Scanner;

/*
* LEAP YEAR
* ---------
* This program is to check the given number is leap year or not.
*
* Leap Year Conditions
* 1. Year should be divisible by 4
* 2. If it is divisible by 100 then should be divisible by 400
* 3. If both conditions are not satisfied, then given input is not leap year.
*
* Example
* 2000	-	LEAP YEAR
* 2100	-	NOT A LEAP YEAR
* 2020	-	LEAP YEAR
* 2019	-	NOT A LEAP YEAR
* 1900	-	NOT A LEAP YEAR
* 1996	-	LEAP YEAR
  */
  public class LeapYear {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter a year :: ");
  int year = scanner.nextInt();

  	if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
  		System.out.println("YES LEAP YEAR!");
  	else
  		System.out.println("No its not leap year.");
  	
  	scanner.close();
  }
  }
  /*
  INPUT
  Enter a year :: 2020
  OUTPUT
  YES LEAP YEAR!

  INPUT
  Enter a year :: 2000
  OUTPUT
  YES LEAP YEAR!

  INPUT
  Enter a year :: 1996
  OUTPUT
  YES LEAP YEAR!

  INPUT
  Enter a year :: 2100
  OUTPUT
  No its not leap year.

  INPUT
  Enter a year :: 2019
  OUTPUT
  No its not leap year.

*/
Write a Java Program to Print 1 To 10 Without Using Loop.
package com.java.basic;

/*
* Print 1 to 10 without using loop
* --------------------------------
*
* Solution:
* Use recursion to print without using loop
*
*/
public class Print10WithoutLoop {
public static void main(String[] args) {
printWihtoutLoop(1);
}

	public static void printWihtoutLoop(int n){
		if(n <= 10){
			System.out.println(n);
			printWihtoutLoop( n+1 );
		}
	}
}
/*
OUTPUT
1
2
3
4
5
6
7
8
9
10
*/
Write a Java Program to print the digits of a Given Number.
package com.java.basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Digits of a Given Number
* -------------------------
* For any positive number print the digits
* of the number.
*
* Without using String functions.
*
* say Given number is 2019
* digits are 2, 0, 1, 9
*
* say Given number is 3245879
* digits are 3, 2, 4, 5, 8, 7, 9
*
*/
public class DigitsOfNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any positive integer :: ");
int num = scanner.nextInt();

		ArrayList<Integer> digitsList = new ArrayList<>();
		while(num > 0){
			int unitDigit = num % 10;
			digitsList.add(0, unitDigit);
			num = num/10;
		}
		
		System.out.println("The digits of the Giver Number : ");
		for(int digit : digitsList)
			System.out.print(digit+" ");
		scanner.close();
	}
}
/*
OUTPUT
Enter any positive integer :: 2019
The digits of the Giver Number :
2 0 1 9

	Enter any positive integer :: 3245879
	The digits of the Giver Number : 
	3 2 4 5 8 7 9
*/

Write a Java Program to find sum of the digits of a given number.
package com.java.numbers;

import java.util.Scanner;

//This program will calculate the sum of digits of a given number
/*
* say N = 153
* output is = 9 (1 + 5 + 3)
*
* say N = 1986
* output is = 24 (1 + 9 + 8 + 6)
  */
  public class SumOfDigits {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Please enter any number :: ");
  int N = Integer.parseInt(scanner.nextLine().trim());
  int tempN = N;
  int sum = 0;
  while( N > 0){
  int lastDigit = N %10;
  sum += lastDigit;
  N = N /10;
  }
  System.out.println("Sum of digits of "+tempN+" is :: "+sum);
  scanner.close();
  }
  }

/*
OUTPUT

	Please enter any number :: 
	1986
	Sum of digits of :: 1986 is :: 24

*/
Write a Java Program to find the smallest of 3 numbers (a,b,c) without using < or > symbol?
package com.java.numbers;

import java.util.Scanner;
/*
* 		FIND THE SMALLEST WIHTOUT USING < AND > SYMBOL
*
* 	Write a java program to find the smallest among a, b, c
*  without using < AND > symbol.
*
*  For comparing two numbers we need to use the relational operator.
*
*  The alternate idea is to find the divisor of a / b,
*  if result is 0 then a is small, else b is small
*
*  Then apply same logic with the result like c / a or c / b
*
*/
public class FindTheSmallest {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value of a ::");
int a = scanner.nextInt();
System.out.println("Enter the value of b ::");
int b = scanner.nextInt();
System.out.println("Enter the value of c ::");
int c = scanner.nextInt();
int smallest = findTheSamllest(a, b, c);
System.out.println("The smallest of a,b,c is :: "+smallest);
scanner.close();
}

	public static int findTheSamllest(int a,int b,int c){
		if( a/b == 0){
			//here a is smaller than b
			if( c/a == 0){
				//here c is smaller than a
				return c;
			}
			else{
				//here a is smaller than c
				return a;
			}
		}else{
			//here b is smaller a
			if( c/b == 0){
				//here c is smaller than b
				return c;
			}
			else{
				//here b is smaller than c
				return b;
			}
		}
	}
}
/*
Enter the value of a :: 20
Enter the value of b :: 10
Enter the value of c :: 30
The smallest of a,b,c is :: 10

	Enter the value of a :: 200
	Enter the value of b :: 100
	Enter the value of c :: 55
	The smallest of a,b,c is :: 55

	Enter the value of a :: 30
	Enter the value of b :: 50
	Enter the value of c :: 70
	The smallest of a,b,c is :: 30
*/


Write a java program to Reverse a given number.
package com.java.numbers;

import java.util.Scanner;

/*
* Reverse The Number
* Say the given number is 123
* Reverse of the number is 321
*
* Say the given number is 2019
* Reverse of the number is 9102
  */
  public class ReverseTheNumber {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter any positive number :: ");
  int num = Integer.parseInt(scanner.nextLine().trim());

  	int reversedNum = reverse(num);
  	System.out.println("Reverse of the given number is : "+reversedNum);
  	scanner.close();
  }

  public static int reverse(int num){
  int reversedNum = 0;
  while( num > 0){
  int unitDigit = num % 10;
  reversedNum = (reversedNum * 10) + unitDigit;
  num = num / 10;
  }
  return reversedNum;
  }

}
/*
OUTPUT
Enter any positive number :: 123
Reverse of the given number is : 321

	Enter any positive number :: 2019
	Reverse of the given number is : 9102

*/



Numbers
Check whether the Given Number is a Palindrome or NOT
package com.java.numbers;

/*
* Palindrome Check
*
* Check the given number is Palinndrome Number or NOT
*
* A palindrome number is a number that remains the same when
* its digits are reversed.
*
* Say N = 16461
* reverse of N = 16461
* N and reverse of N are same
* So 16461 is Palindrome number
*
* Other examples are
* 12321, 1001, 10101
*
* NOT a Palindrome
* 100, 123, 2020
*
*/
public class PalindromeCheck {
public static void main(String[] args) {
int N = 12345;
String reverse = "";

		int temp = N;
		while(temp > 0){
			int d = temp % 10;
			temp = temp/10;
			reverse =  reverse + d; 
		}
		int reverseN = Integer.parseInt(reverse);
		if(N == reverseN)
			System.out.println(N+" is a Palindrome Number");
		else
			System.out.println(N+" is NOT a Palindrome Number");		
	}
}
/*
OUTPUT
16461 is a Palindrome Number

	OUTPUT
	12321 is a Palindrome Number

	OUTPTU
	12345 is NOT a Palindrome Number
*/


Write a Java Program to check whether the Given Number is Prime Number or NOT.
package com.java.numbers;

import java.util.Scanner;

/*

	Prime number is a number that is greater than 1 and divided by 1 or itself only. 
	In other words, prime numbers can't be divided by other numbers than itself or 1. 
	For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

*/
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number::");
		int number = Integer.parseInt(scanner.nextLine().trim());
		boolean status = checkPrimeNumber(number);
		if(status == true)
			System.out.println("The entered number is Prime Number");
		else
			System.out.println("The entered number is NOT a Prime Number");
		scanner.close();
	}
	
	private static boolean checkPrimeNumber(int number){
		if(number <= 1)
			return false;
		int length = number / 2;

		for(int i=2;i<length;i++)
			if(number % i ==0)
				return false;
		return true;
	}
}
/*

OUTPUT

Enter any number::
15
The entered number is NOT a Prime Number

Enter any number::
29
The entered number is Prime Number

*/


Write a Java Program to print Prime Numbers from 1 to N.

package com.java.numbers;

import java.util.Scanner;

/*
* This program will does the prime number check between the stand and end range
* say start is 5 and end is 10
* 5 is a Prime Number
* 6 is NOT a Prime Number
* 7 is a Prime Number
* 8 is NOT a Prime Number
* 9 is NOT a Prime Number
* 10 is NOT a Prime Number
  */
  public class PrimeNumberList {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the start value of the range ::");
  int start = Integer.parseInt(scanner.nextLine().trim());
  System.out.println("Enter the end value of the range ::");
  int end = Integer.parseInt(scanner.nextLine().trim());

  	for(int i = start; i<=end; i++){
  		if(checkPrimeNumber(i))
  			System.out.println(i+" is a Prime Number");
  		else
  			System.out.println(i+" is NOT a Prime Number");
  	}
  	scanner.close();
  }

  private static boolean checkPrimeNumber(int number){
  if(number <= 1)
  return false;
  int length = number / 2;

  	for(int i=2;i<length;i++)
  		if(number % i ==0)
  			return false;
  	return true;
  }
  }
  /*

OUTPUT - Test Case 1

Enter the start value of the range :: 100
Enter the end value of the range :: 110
100 is NOT a Prime Number
101 is a Prime Number
102 is NOT a Prime Number
103 is a Prime Number
104 is NOT a Prime Number
105 is NOT a Prime Number
106 is NOT a Prime Number
107 is a Prime Number
108 is NOT a Prime Number
109 is a Prime Number
110 is NOT a Prime Number

OUTPUT - Test Case 2

Enter the start value of the range :: 500
Enter the end value of the range :: 510
500 is NOT a Prime Number
501 is NOT a Prime Number
502 is NOT a Prime Number
503 is a Prime Number
504 is NOT a Prime Number
505 is NOT a Prime Number
506 is NOT a Prime Number
507 is NOT a Prime Number
508 is NOT a Prime Number
509 is a Prime Number
510 is NOT a Prime Number

*/


Write a Java Program to check whether the given number is Armstrong Number or NOT.
package com.java.numbers;

import java.util.Scanner;

/*
* 	Armstrong Number
*
* A positive number is called Armstrong number
* if it is equal to the
* sum of cubes of its digits
* for example 0, 1, 153, 370, 371, 407 etc.
*
* 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
* 370 = 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370
* 371 = 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
  */
  public class ArmstrongNumber {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter any positive number :: ");
  int num = Integer.parseInt(scanner.nextLine().trim());

  	if( checkArmstrongNumber(num) == true )
  		System.out.println("Given number "+num+" is a Armstrong Number.");
  	else
  		System.out.println("Given number "+num+" is NOT a Armstrong Number.");
  	scanner.close();
  }

  private static boolean checkArmstrongNumber(int num){
  int digitsSum = 0;
  int tempNum = num;

  	while( num > 0 ){
  		//get the unit digits of the number
  		int digit = num % 10;
  		//sum the cubes of the unit digit
  		digitsSum += digit * digit * digit;
  		num = num / 10;
  	}
  			
  	//check sum of the cubes of digits is equal to the number
  	if(digitsSum == tempNum)
  		return true;
  	return false;
  }
  }
  /*
  OUTPUT

  Enter any positive number :: 153
  The given number 153 is a Armstrong Number.

  Enter any positive number :: 370
  The given number 153 is a Armstrong Number.

  Enter any positive number :: 500
  The given number 500 is NOT a Armstrong Number.

*/


Write a Java Program to print Armstrong Numbers between 1 to 1000.
package com.java.numbers;

/*
* 	Armstrong Number from 1 to 1000
*
* A positive number is called Armstrong number
* if it is equal to the
* sum of cubes of its digits
* for example 0, 1, 153, 370, 371, 407 etc.
*
* Armstrong Numbers are
* 1 153 370 371 407
  */
  public class ArmstrongNumberList {

  public static void main(String[] args) {
  System.out.println("Armstrong Number from 1 to 1000 :: ");

  	for(int i=1; i<=1000; i++)
  		if(isArmstrongNumber(i))
  			System.out.print(i+" ");
  }

  private static boolean isArmstrongNumber(int num){
  int digitsSum = 0;
  int tempNum = num;

  	while( num > 0 ){
  		int digit = num % 10;
  		digitsSum += digit * digit * digit;
  		num = num / 10;
  	}
  			
  	if(digitsSum == tempNum)
  		return true;
  	return false;
  }
  }
  /*
  OUTPUT
  Armstrong Number from 1 to 1000 ::
  1 153 370 371 407
  */



Array Based Programs
Calculate the average of given array.
package com.java.array;

/*
* Calculate the Average of Given Array
* -------------------------------------
*
* This is one basic program using array.
* Steps
* 1. Declare a variable sum with 0
* 2. Iterate the array and add with sum variable
* 3. Divide the sum with array length
*
* array = {10, 10, 10, 10, 10};
* sum is 50
* array length is 5
* average is 10
*
* array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
* sum is 550
* array length is 10
* average is 55
  */
  public class Average {
  public static void main(String[] args) {
  //int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
  int array[] = {10, 10, 10, 10, 10};
  int n = array.length;
  int sum = 0;
  for(int v : array)
  sum += v;
  float average = sum/n;

  	System.out.println("The Given Array is : ");
  	for(int v : array)
  		System.out.print(v+" ");
  	System.out.println("\nThe Average of Given Array is : "+average);
  }
  }
  /*
  OUTPUT
  The Given Array is :
  10 20 30 40 50 60 70 80 90 100
  The Average of Given Array is : 55.0

  OUTPUT
  The Given Array is :
  10 10 10 10 10
  The Average of Given Array is : 10.0
  */



Find the second largest number in the given array.
package com.java.array;

import java.util.Arrays;

/*
* Find the Second Maximum in the Given Array
* ------------------------------------------
* array {10,32,34,54,19,29,38,45}
* max is 54, second max is 45
*
* array {10,20,30,40,50,60,70,80}
* max is 80, second max is 70
*
* The solution is, declare two variables
* one variable to store maximum in the array
* another variable to store second maximum
*
* assume 0th index value is max value
* and 1st index value is 2nd max value
* then iterate the array from index 2 to n
* compare every index value with max
* if it is greater than max value
* then update both max and second max
*
* else check the ith value is greater
* than 2nd max, if it so,
* then update only 2nd max value with ith value
  */
  public class SecondMaximum {
  public static void main(String[] args) {
  int array[] = {10,32,34,54,19,29,38,45};

  	//assume 0th index value is maximum
  	int max = array[0];
  	// assume 1st index value is 2nd maximum
  	int secondMax = array[1];
  	
  	//if 1st index value is greater than 0th index value
  	//then swap the max and secondMax variable
  	if(max < secondMax){
  		max = array[1];
  		secondMax = array[0];
  	}
  	//iterate from 2nd index
  	for(int i=2;i<array.length;i++){
  		if(array[i] > max){
  			//if ith index is greater than maximum 
  			//then update max and secondMax
  			secondMax = max;
  			max = array[i];
  		}else if(array[i] > secondMax){
  			//if ith index is not greater than max
  			//still need to check with secondMax
  			//if ith index greater than second max
  			//then update only second max
  			secondMax = array[i];
  		}
  	}
  	
  	System.out.println("Given array is : "+Arrays.toString(array));
  	System.out.println("Max value in the array is : "+max);
  	System.out.println("Second max value in the array is : "+secondMax);
  }
  }

/*
OUTPUT
Given array is :
[10, 32, 34, 54, 19, 29, 38, 45]
Max value in the array is : 54
Second max value in the array is : 45
*/


Find the second minimum number in the given array.

package com.java.array;

import java.util.Arrays;

/*
* Find the Second Minimum in the Given Array
* -------------------------------------------
*
* array {10,32,34,54,19,29,38,45}
* minimum is 10, second minimum is 19
*
* array is {10,20,30,40,50,60,70,80}
* minimum is 10, second minimum is 20
*
* The solution is, declare two variables
* one variable to store minimum in the array
* another variable to store second minimum
*
* assume 0th index value is minimum value
* and 1st index value is 2nd min value
* then iterate the array from index 2 to n
* compare every index value with min variable
* if it is less than min variable
* then update both min and second min
*
* else check the ith value is less
* than 2nd min, if it so,
* then update only 2nd min variable with ith value
  */
  public class SecondMinimum {
  public static void main(String[] args) {
  int array[] = {10,32,34,54,19,29,38,45};

  	// assume 0th index value is minimum
  	int min = array[0];
  	// assume 1st index value is 2nd minimum
  	int secondMin = array[1];
  	
  	//if 1st index value is minimum than 0th index value
  	//then swap the min and secondMin variable
  	if(min > secondMin){
  		min = array[1];
  		secondMin = array[0];
  	}
  	
  	//iterate from 2nd index
  	for(int i=2;i<array.length;i++){
  		if(array[i] < min){
  			//if ith index is less than minimum 
  			//then update min and secondMin
  			secondMin = min;
  			min = array[i];
  		}else if(array[i] < secondMin){
  			//if ith index is not less than min
  			//still need to check with secondmin
  			//if ith index less than second min
  			//then update only second min
  			secondMin = array[i];
  		}
  	}
  	
  	System.out.println("Given array is : "+Arrays.toString(array));
  	System.out.println("Minimum value in the array is : "+min);
  	System.out.println("Second minimum value in the array is : "+secondMin);
  }
  }
  /*
  OUTPUT
  Given array is :
  [10, 32, 34, 54, 19, 29, 38, 45]
  Minimum value in the array is : 10
  Second minimum value in the array is : 19
  */

Find the missing Number in the given array of 1 to N.
package com.java.array;
/*
* Find the Missing Number in 1 to N
* ----------------------------------
* An array contains 1 to N numbers
* but one number in the array is missing
* Write the java program to find the missing no
*
* Steps:
* 1. Calculate the sum of the array
* 2. Calculate the sum of 1 to N
* 3. Subtract array from the expected sum
* 4. The result value is the missing no
*
*  Formula for Calculate sum of 1 to N
*  1 + 2+ 3 + 4 + 5 + ...... + N
*  sum = (N * (N+1)) / 2
*
*  array = {2, 4, 1, 6, 7, 5, 3, 9};
*  array Length = 8
*  sum of array = 37
*  N = array Length + 1 (missing no) = 9
*  sum of 1 to N =  45
*  missing no = sum of 1 to N - array sum
*  missing no = 45 - 37
*
* Note::
* ------
* This approach will work only for array contains
* value from 1 to n (order does not matter)
  */
  public class FindMissingNo {
  public static void main(String[] args) {
  //		int array[] = {2, 4, 1, 6, 7, 5, 3, 9};
  int array[] = {2, 4, 1, 6, 3};
  int n = array.length;

  	//calculate the sum of array
  	int arraySum = 0;
  	for(int v : array)
  		arraySum += v;

  	//array length is 8
  	//one no is missing, then n should be n+1
  	// here 8+1
  	n = n+1;
  	
  	//this calculates the sum from 1 to (n).
  	//1+2+3+....n
  	int expectedSum = (n * (n+1)) / 2;
  	
  	System.out.println("The Given Array is : ");
  	for(int v : array)
  		System.out.print(v+" ");
  	
  	int missingNo = expectedSum - arraySum;
  	System.out.println("\nMissing Number is : "+missingNo);
  }
  }
  /*
  OUTPUT
  The Given Array is :
  2 4 1 6 7 5 3 9
  Missing Number is : 8

  OUTPUT
  The Given Array is :
  2 4 1 6 3
  Missing Number is : 5
  */

Write a Java Program to find the Intersection of two arrays.

package com.java.array;

/*
* Find Intersection of Two Arrays
* --------------------------------
*
* INTERSECTION
* Common element in both arrays.
* Intersection array elements are should be
* present in both array1 and array2
*
* say array1 = {44, 49, 30, 25, 67, 69};
* say array2 = {88, 44, 69, 93, 30};
*
* intersection of two array is
* intersection = {44, 30, 69}
  */

public class IntersectionOfTwoArrays {
public static void main(String[] args) {
int array1[] = {44, 49, 30, 25, 67, 69};
int array2[] = {88, 44, 69, 93, 30};

		System.out.println("Given array 1 is : ");
		for(int v : array1)
			System.out.print(v+" ");
		
		System.out.println("\nGiven array 2 is : ");
		for(int v : array2)
			System.out.print(v+" ");
		
		int intersectionLength = array1.length;
		if(array2.length < array1.length)
			intersectionLength = array2.length;
		
		int intersectionArray[] = new int[intersectionLength];
		int k = 0;
		for(int a : array1){
			for(int b : array2){
				if(a == b){
					intersectionArray[k++] = a; 
					break;
				}
			}
		}
		
		System.out.println("\nIntersection of the array 1 & 2 is :");
		for(int i=0;i<k;i++)
			System.out.print(intersectionArray[i]+" ");
		
	}
}
/*
OUTPUT
Given array 1 is : 44 49 30 25 67 69
Given array 2 is : 88 44 69 93 30
Intersection of the array 1 & 2 is : 44 30 69  	
*/



Write a Java Program to find the Union of Two Arrays
package com.java.array;

/*
* Union Of Two Arrays
* -------------------
* The Union of Two Arrays Array1, Array2 is the
* new array which contains all the elements which are
* either in array1 or in array2, or in both arrays.
*
* array1 = {17, 23, 31, 14, 25, 26};
* array2 = {23, 44, 14, 8, 17};
*
* 17, 14 and 23 are present in both arrays
* UnionArray should contain only one time
*
* 31, 25 & 26 are present only in array1
* all these elements should present in UnionArray
*
* 44 & 8 are present only in array2
* all these elements should present in UnionArray
*
* UnionArray = {17, 23, 31, 14, 25, 26, 44, 8};
*
*/
public class UnionOfTwoArrays {
public static void main(String[] args) {
int array1[] = {17, 23, 31, 14, 25, 26};
int array2[] = {23, 44, 14, 8, 17};

		//if both arrays don't have any common element
		//then the max len will be array1 len + array2 len
		int unionArrayMaxLen = array1.length + array2.length;
		int unionArray[] = new int[unionArrayMaxLen];
	
		int k = 0;
		//copy all the elements from the 1st array
		for(int i=0;i<array1.length;i++,k++)
			unionArray[k] = array1[i];
	
		//iterate array2 and check the element is present in
		//unionArray or not
		//if the element is already present then continue
		//check with next element
		//if the element is not present then add it to
		//unionArray
		for(int i=0;i<array2.length;i++){
			int j = 0;
			for(j=0;j<k;j++)
				if(unionArray[j] == array2[i])
					break;
			if(j == k)
				unionArray[k++] = array2[i];
		}
		
		System.out.println("Given Array 1 is : ");
		for(int i=0;i<array1.length;i++)
			System.out.print(array1[i]+" ");
		
		System.out.println("\nGiven Array 2 is : ");
		for(int i=0;i<array2.length;i++)
			System.out.print(array2[i]+" ");
		
		System.out.println("\nUnion of Two Array is : ");
		for(int i=0;i<k;i++)
			System.out.print(unionArray[i]+" ");
	}
}
/*
OUTPUT

	Given Array 1 is : 
	17 23 31 14 25 26 
	Given Array 2 is : 
	23 44 14 8 17 
	Union of Two Array is : 
	17 23 31 14 25 26 44 8  
*/

Write a Java Program to find the Union of Tow Arrays using HashSet.

package com.java.array;

import java.util.Arrays;
import java.util.HashSet;

/*
* Union Of Two Arrays using HashSet
* ---------------------------------
* The Union of Two Arrays Array1, Array2 is the
* new array which contains all the elements which are
* either in array1 or in array2, or in both arrays.
*
* array1 = {17, 23, 31, 14, 25, 26};
* array2 = {23, 44, 14, 8, 17};
*
* Using HashSet
*
* HashSet will allow to store only unique elements
* duplicate elements will not be stored.
*
* Steps
* 1. Create new HashSet
* 2. Add the 1st array to HashSet
* 3. Add 2nd array to HashSet
* 4. Duplicate elements will not be stored
* 5. HashSet contains union both Array1 & Array2
*
* Collections will allow only reference type
* That's why array also created as reference type
  */
  public class UnionArrayUsingHashSet {
  public static void main(String[] args) {
  Integer array1[] = {17, 23, 31, 14, 25, 26};
  Integer array2[] = {23, 44, 14, 8, 17};

  	HashSet<Integer> set = new HashSet<>();
  	//add all the elements of array1
  	set.addAll(Arrays.asList(array1));
  	//add all the elements of array2
  	//duplicate elements will not be added
  	set.addAll(Arrays.asList(array2));
  	
  	//convert HashSet to array[]
  	Integer unionArray[] = set.toArray(new Integer[set.size()]);
  	
  	System.out.println("Given Array 1 is : ");
  	for(int v : array1)
  		System.out.print(v+" ");
  	
  	System.out.println("\nGiven Array 2 is : ");
  	for(int v : array2)
  		System.out.print(v+" ");
  	
  	System.out.println("\nUnion Of Two Arrays is :");
  	for(int v : unionArray)
  		System.out.print(v+" ");
  }
  }
  /*
  OUTPUT
  Given Array 1 is :
  17 23 31 14 25 26
  Given Array 2 is :
  23 44 14 8 17
  Union Of Two Arrays is :
  17 23 8 25 26 44 14 31
  */



Write a Java Program to Move all Zero to End of the Array.
package com.java.array;

/*
* Move All the Zeros to end of the Array
* ---------------------------------------
* Assume the given array contains some zero
* in some index positions.
*
* Move all the zero to end of the Array
*
* array[] = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0}
*
* after moving to end of the array
*
* array[] = {1, 4, 3, 2, 1, 0, 0, 0, 0, 0}
  */
  public class MoveAllZerosToEnd {
  public static void main(String[] args) {
  int array[] = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0};
  System.out.println("The Given Array is :: ");
  for(int v : array)
  System.out.print(v+" ");

  	int count = 0;
  	for(int i=0;i<array.length;i++)
  		if(array[i] != 0)
  			array[count++] = array[i];
  	
  	while(count < array.length)
  		array[count++] = 0;
  	
  	System.out.println("\nAfter moving all zeros to end of array :: ");
  	for(int v : array)
  		System.out.print(v+" ");

  }
  }
  /*
  OUTPUT
  The Given Array is ::
  1 0 4 3 0 0 2 0 1 0
  After moving all zeros to end of array ::
  1 4 3 2 1 0 0 0 0 0
  */

Write a Java Program to Move all Zeros to Start of the Array
package com.java.array;

/*
* Move All the Zeros to Start of the Array
* -----------------------------------------
* Assume the given array contains some zero
* in some index positions.
*
* Move all the zero to start of the Array
*
* array[] = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0}
*
* after moving to start of the array
*
* array[] = {0, 0, 0, 0, 0, 1, 4, 3, 2, 1}
  */
  public class MoveAllZerosToFront {
  public static void main(String[] args) {
  int array[] = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0};
  System.out.println("The Given Array is :: ");
  for(int v : array)
  System.out.print(v+" ");

  	int count = array.length-1;
  	for(int i=array.length-1 ;i >= 0; i--)
  		if(array[i] != 0)
  			array[count--] = array[i];
  	
  	while(count >= 0)
  		array[count--] = 0;
  	
  	System.out.println("\nAfter moving all zeros to start of array :: ");
  	for(int v : array)
  		System.out.print(v+" ");
  }
  }
  /*
  OUTPUT
  The Given Array is ::
  1 0 4 3 0 0 2 0 1 0
  After moving all zeros to start of array ::
  0 0 0 0 0 1 4 3 2 1  
  */

Write a Java Program to Reverse the given array without using additional Array.
package com.java.array;

/*
* Reverse the Array without using additional Array
* ------------------------------------------------
*
* given array[]= {1,2,3,4,5,6,7,8,9,10};
* reversed array[]= {10,9,8,7,6,5,4,3,2,1};
*
* Steps to reverse
* swap 0th index with (N-1) index (swap 1 & 10)
* swap 1st index with (N-2) index (swap 2 & 9)
* swap 2nd index with (N-3) index (swap 3 & 8)
* swap 3rd index with (N-4) index (swap 4 & 7)
* swap 4th index with (N-5) index (swap 5 & 6)
*
* In General
*
* swap i th index with (N - 1 - i) index
* No of iterations will by (N/2)
*
*/

public class ReverseArray {
public static void main(String[] args) {
int array[]= {1,2,3,4,5,6,7,8,9,10};
int N = array.length;
int temp;

		System.out.println("The Given Array is : ");
		for(int x : array) {
			System.out.print(x+" ");
		}
		
		// N/2 iterations
		for(int i=0;i<N/2;i++) {
			//swap ith index with N-i-1 index
			temp = array[i];
			array[i] = array[N - 1 - i];	
			array[N - 1 - i] = temp;
		}
		
		System.out.println("\nThe Reversed Array is : ");
		for(int x : array) {
			System.out.print(x+" ");
		}
	}
}
/*
OUTPUT
The Given Array is :
1 2 3 4 5 6 7 8 9 10
The Reversed Array is :
10 9 8 7 6 5 4 3 2 1
*/

Write a program to find the Most Frequent Element in an given array.
package com.java.array;

/*
* Find the Most Frequent Element in an Array
* -------------------------------------------
* Using Brute Force Approach
*
* For the each element, scan the entire array
* to find its duplicates. Maintain two variables
* max_freq and output to store the maximum frequent
* and output with that frequency respectively.
*
* Say array is {8, 9, 3, 3, 6, 3, 8, 1, 6};
* start with 8 and scan all the element for 8 (i=0)
* max_freq = 2 and output = 8
*
* then next scan all the 9 (i=1)
* 9 is repeated only one time so its count is = 1
* So don't update max_frequent
*
* then next scan all the 3(i=2)
* 3 is occurred 3 times in the array
* now max_freq = 3 and output = 3
*
* Continue the same procedure for all the
* elements in the array
*
* Finally output variable will return the most
* frequent element in the array.
*
* When two elements have the same frequent values
* then minimum of both will the output.
*
*/
public class FindMostFrequent {
public static void main(String[] args) {
int arr[] = {3, 9, 1, 3, 6, 3, 8, 1, 6};
//		int arr[] = {1, 9, 1, 3, 2, 3, 10};
//		int arr[] = {2, 1, 2, 2, 1, 3};

		int max_freq = 0;
		int output = 0;
		int N = arr.length;
		
		for(int i=0;i<N;i++){
			int cur_freq = 1;
			for(int j=i+1;j<N;j++){
				if(arr[i] == arr[j])
					cur_freq++;
			}
			if(cur_freq > max_freq){
				max_freq = cur_freq;
				output = arr[i];
			}else if(cur_freq == max_freq && output > arr[i]){
				max_freq = cur_freq;
				output = arr[i];
			}
		}
		
		System.out.println("Most Frequent element is :: "+output);
		System.out.println("Occurred "+max_freq+" times.");
	}
}
/*
INPUT
{3, 9, 1, 3, 6, 3, 8, 1, 6}
OUTPUT
Most Frequent element is :: 3
Occurred 3 times.

	INPUT
	{1, 9, 1, 3, 2, 3, 10}
	OUTPUT
	Most Frequent element is :: 1
	Occurred 2 times.

	INPUT
	{2, 1, 2, 2, 1, 3}
	OUTPUT
	Most Frequent element is :: 2
	Occurred 3 times.
*/



Write a program to find the Most Frequent Element using HashTable.
package com.java.array;

import java.util.Hashtable;

/*
* Find the Most Frequent Element in an Array
* ------------------------------------------
* Using Hash Table
*
* We can create a hash table and store elements and
* their frequency counts as key value pair.
*
* Create a Hash Table to store frequency of each
* element in the given array. Consider elements
* in the array as key and their frequency as value
*
* First scan the array one by one and check
* if value associated with any key (as that
* particular element) exist in the Hash Table or not
*
* If exist, increment the value of that key by 1
* If not, store the value as 1
*
* During the iteration, we are also storing the most
* frequent element and its frequency in the parameter
* output and max_freq respectively.
*
*
* Say array is {8, 9, 3, 3, 6, 3, 8, 1, 6};
* Create a Hash Table
* H = key --> value
*
* Iterate the array using for loop
* at i = 0
* 8 --> 1
* at i = 1
* 8 --> 1
* 9 --> 1
* at i = 2
* 8 --> 1
* 9 --> 1
* 3 --> 1
* at i = 3
* 8 --> 1
* 9 --> 1
* 3 --> 2
* ...
*
* at i = n-1
* 8 --> 2
* 9 --> 1
* 3 --> 3
* 6 --> 2
* 1 --> 1
*
* So 3 is the output
* Because 3 repeated 3 times (max frequency).
*
*/
public class FindMostFrequentUsingHashtable {

	public static void main(String[] args) {
//		int arr[] = {3, 9, 1, 3, 6, 3, 8, 1, 6};
//		int arr[] = {1, 9, 1, 3, 2, 3, 10};
int arr[] = {2, 1, 2, 2, 1, 3};
int N = arr.length;
int output = 0;
int max_freq = 0;
Hashtable<Integer, Integer> table = new Hashtable<>();

		for(int i=0;i<N;i++){
			if(table.containsKey(arr[i]))
				table.put(arr[i], table.get(arr[i])+1);
			else
				table.put(arr[i], 1);
			int val = table.get(arr[i]);
			if(max_freq < val){
				output = arr[i];
				max_freq = val;
			}
		}
		System.out.println("Most Frequent element is :: "+output);
		System.out.println("Frequency of the element is :: "+max_freq);
	}
}
/*
INPUT
{3, 9, 1, 3, 6, 3, 8, 1, 6}
OUTPUT
Most Frequent element is :: 3
Frequency of the element is :: 3

	INPUT
	{1, 9, 1, 3, 2, 3, 10}
	OUTPUT
	Most Frequent element is :: 1
	Frequency of the element is :: 2
	
	INPUT
	{2, 1, 2, 2, 1, 3}
	OUTPUT
	Most Frequent element is :: 2
	Frequency of the element is :: 3
*/

Write a java program to Rotate the Given Array d times.
package com.java.array;

import java.util.Arrays;

/*
* Rotate the Given array d times
* -------------------------------
* Write java program to rotate (clockwise) the given array
* d number of times.
*
* Steps:
* 1. Create new array of same size
* 2. Create a new index variable new_index = 0
* 3. Copy the array from index d to n
* to the new array of index 0, and increment new_index
* 4. Copy the array from index 0 to d
* to the new array and increment new_index.
*
* Given array is {1, 2, 3, 4, 5, 6}
* d = 2
*
* New array = {0, 0, 0, 0, 0, 0}
*
* copy index from d to n to new array
* New array = {5, 6, 0, 0, 0, 0}
*
* copy index from 0 to d to new array
* New array = {5, 6, 1, 2, 3, 4}
*
* Finally after rotation
* {5, 6, 1, 2, 3, 4}
*
*/
public class ArrayRotation {
public static void main(String[] args) {
int arr[] = {1, 2, 3, 4, 5, 6};
int d = 6;
int n = arr.length;

		if(d > n)
			d = d-n;
		int new_arr[] = new int[n];
		int new_index = 0;
		for(int i=(n-d);i<n;i++,new_index++)
			new_arr[new_index] = arr[i];
		for(int i=0;i<(n-d);i++,new_index++)
			new_arr[new_index] = arr[i];
		
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Array after rotation");
		System.out.println(Arrays.toString(new_arr));
	}
}
/*
INPUT
arr[] = {1, 2, 3, 4, 5, 6}
d = 2
OUTPUT
{5, 6, 1, 2, 3, 4}

	INPUT
	arr[] = {1, 2, 3, 4, 5, 6}
	d = 4
	OUTPUT
	{3, 4, 5, 6, 1, 2}
	
	INPUT
	arr[] = {1, 2, 3, 4, 5, 6}
	d = 6
	OUTPUT
	{1, 2, 3, 4, 5, 6}
*/






String Based Programs
Write a java program to check Given String is Palindrome or NOT\
package com.java.strings;

/*
* Palindrome Check
* -----------------
* A String is a palindrome,
* if it is remain unchanged even when it is reversed.
*
* A String is a palindrome,
* if it equals to the reverse of the string
*
* example words are ::
* malayalam, radar, madam, civic, level, racecar, refer
  */

public class Palindrome {
public static void main(String[] args) {
String word = "malayalam";
//		String word = "radar";
//		String word = "madam";
//		String word = "sathish";
//		String word = "java";

		System.out.println("The Given String \""+word+"\"");
		if( checkPalindrome(word) )
			System.out.println("Yes, it is a Palindrome");
		else
			System.out.println("No, it is NOT a Palindrome");
	}
	
	private static boolean checkPalindrome(String str){
		int strLen = str.length();

		//The logic is compare 1st char with last char (nth char)
		//Then compare 2nd char with (n-1) char
		//here index starts with 0, so compare index 0 with index (n-1)
		//then compare index 1 with index (n-2)
		//do this comparison for half of the string,
		//if is palindrome 2nd half the string is mirror(reverse) of the 1st half 
		for(int i=0; i < str.length()/2; i++)
			if(str.charAt(i) != str.charAt(strLen-i-1))
				return false;
		return true;
	}
}
/*

	OUTPUT
	
	The Given String "malayalam"
	Yes, it is a Palindrome
	
	The Given String "radar"
	Yes, it is a Palindrome

	The Given String "madam"
	Yes, it is a Palindrome
	
	The Given String "sathish"
	No, it is NOT a Palindrome

	The Given String "java"
	No, it is NOT a Palindrome
*/

How to Swap two Strings without using third (temporary) variable?
package com.java.strings;

import java.util.Scanner;

/*
* Swap Two Strings without using third variable
* ---------------------------------------------
* Say String1 is : good
* Say String2 is : bad
* The output should print string1 is bad and string2 is good
*
*/

public class SwapTwoStrings {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the String 1 : ");
String str1 = scanner.nextLine().trim();
System.out.println("Enter the String 2 : ");
String str2 = scanner.nextLine().trim();

		str1 = str1 + str2;
		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("After swapping ::");
		System.out.println("String 1 is : "+str1);
		System.out.println("String 2 is : "+str2);
		scanner.close();
	}
}
/*
OUTPUT
Enter the String 1 : good
Enter the String 2 : bad
After swapping::
String 1 is : bad
String 2 is : good

	Enter the String 1 : hello
	Enter the String 2 : world
	After swapping::
	String 1 is : world
	String 2 is : hello
*/

Write a java program to Reverse a String without using in-build function.
package com.java.strings;

import java.util.Scanner;

/*
* Reverse the String without using InBuild Functions
* --------------------------------------------------
* Say given String :: hello
* Reversed String :: olleh
*
* Say given String :: good
* Reversed String :: doog
*
* Steps::
* -------
* - get the input string from the user
* - convert the string into char array
* - initiate two pointer say
* i = 0, and j = length(string) - 1
* - swap chars at ith and jth place
* - then do i++, j--
* - continue the above steps str_len / 2 times
*
*/

public class ReverseString {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the String :: ");
String str = scanner.nextLine();
String reversedString = reverseString(str);
System.out.println("Reversed String is :: "+reversedString);
scanner.close();
}

	public static String reverseString(String str){
		char[] charArray = str.toCharArray();
		int j = charArray.length-1;
		for(int i=0 ;i < charArray.length/2; i++, j--){
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		return new String(charArray);
	}
}
/*
OUTPUT
Enter the String :: hello
Reversed String is :: olleh

	Enter the String :: good
	Reversed String is :: doog
*/

Write a java program to Count the Number of Words in a given String.
package com.java.strings;

import java.util.Scanner;

/*
* Count the number of Words
* --------------------------
* Write the java program to count the number of
* words in the given string without string functions
*
* solution::
* ----------
* Count the number of white spaces " "
*
*
* say Given String : java programming
* no of words : 2
* say Given String : code
* no of words : 1
*
*/

public class CountWords {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any String : ");
String str = scanner.nextLine().trim();
if(str.length() == 0){
System.out.println("Number of wrods : 0");
System.exit(0);
}
System.out.println("Number of words : "+countWords(str));
scanner.close();
}

	private static int countWords(String str){
		int count = 1;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			System.out.println(ch);
			if(ch == ' ' || ch == '\t' || ch == '\n'){
				count++;
				ch = str.charAt(i+1);
				while(ch == ' ' || ch == '\t' || ch == '\n'){
					i++;
					ch = str.charAt(i+1);
					//this while loop removes continuous white spaces
				}
			}
		}
		return count;
	}
}
/*
OUTPUT
Enter any String : java programming
Number of words : 2

	Enter any String : 123		123
	Number of words : 2
		
	Enter any String : code
	Number of words : 1

	Enter any String : I am a good      coder
	Number of words : 5
*/

Write a java program to Count the Number of Vowels in the given string.
package com.java.strings;

/*
* 	Count the Vowels
* ------------------
*
* A vowel is a syllabic speech sound pronounced
* without any stricture in the vocal tract.
* Vowels are one of the two principal classes of
* speech sounds, the other being the consonant.
* Vowels vary in quality, in loudness and also in quantity.
*
* The letters a, A, e, E, i, I, o, O, u and U are called vowels.
* The other letters in the alphabet are called consonants.
*
*
* say the string is "Hello"
* the vowels are {e, o}
* Count is 2
*
* say the string is "Tamil"
* the vowels are {a, i}
* Count is 2
*
* say the string is "why"
* there are no Vowels in this word
* Count is 0
*
* Words without vowels are
* sky, spy, try, fly, lynch, myth, dry, why, sync, shy, ply,
* by, cry, crypt, fry, gym, psych, spy
  */

public class CountVowels {
public static void main(String[] args) {
//		String line = "Java Interview Programs";
//		String line = "Hello World!";
String line = "Rhythm";
int count = 0;

		System.out.println("Given String is :"+line);
		line = line.toLowerCase();
		for(char ch : line.toCharArray()){
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
				break;
			}
		}
		System.out.println("Number of Vowels are :"+count);
	}
}
/*
OUTPUT
Given String is :Java Interview Programs
Number of Vowels are :8

	Given String is :Hello World!
	Number of Vowels are :3

	Given String is :Rhythm
	Number of Vowels are :0
*/

Check Given String is Rotation of Another String.
package com.java.strings;

import java.util.Scanner;

/*
* Check Given String is Rotation of Another String
* -------------------------------------------------
*
* Say String 1 : abcd
* Say String 2 : bcda
* String 2 is rotation of string 1
*
* Rotation means order should be maintained,
* same set of characters forming another string
* without changing its order ( like b follows a, d follows c)
*
*/

public class StringRotationOfAnother {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the string 1 ::");
String str1 = scanner.nextLine().trim();
System.out.println("Enter the string 2 ::");
String str2 = scanner.nextLine().trim();

		if(checkStringRotation(str1, str2))
			System.out.println("String 2 is rotation of String 1");
		else
			System.out.println("String 2 is NOT rotation of String 1");
		scanner.close();
	}
	
	private static boolean checkStringRotation(String str1,String str2){
		if(str1 == null || str2 == null)
			return false;
		if(str1.length() != str2.length())
			return false;
		
		//add string 1 with string 1 itself
		//it helps to identify its rotation
		str1 = str1 + str1;
		
		if(str1.contains(str2))
			return true;
		
		return false;
	}
}

/*
OUTPUT

	Enter the string 1 :: greeting
	Enter the string 2 :: inggreet
	String 2 is rotation of String 1
	
	Enter the string 1 :: abcdef
	Enter the string 2 :: bcdefa
	String 2 is rotation of String 1

	Enter the string 1 :: java
	Enter the string 2 :: jaav
	String 2 is NOT rotation of String 1

*/



Write a Java Program to check two strings are Anagram to each other or NOT.
package com.java.strings;

import java.util.Arrays;
import java.util.Scanner;

/*
* Check 2 strings are Anagram to each other or NOT
* ------------------------------------------------
* Anagram ::
* -----------
* Two Strings are called as Anagrams if they contain same set of
* characters but in different order
*
* Say String 1 : keep
* Say String 2 : peek
* String 1 & 2 are Anagrams
* String 2 have same set of characters but in different order
*
* Other examples are
* listen === silent
* triangle === integral
*
*/
public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String 1 :: ");
		String str1 = scanner.nextLine().trim();
		
		System.out.println("Enter the String 2 :: ");
		String str2 = scanner.nextLine().trim();
		
		if( bestApproach(str1, str2) )
			System.out.println("Both strings are Anagrams.");
		else
			System.out.println("Both strings are NOT Anagrams.");
		scanner.close();
	}
	
	private static boolean bestApproach(String str1, String str2){
		//remove the white spaces in the strings
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		//check both strings have the same length
		if(str1.length() != str2.length())
			return false;

		//anagram means both strings having the same characters
		//so we can use XOR operator, a XOR a will be zero
		//so string1 chars XOR string 2 chars will be zero
		//else both strings are not anagram
		int value = 0;
		for(int i=0;i<str1.length();i++){
			value = value ^ (int)str1.charAt(i);
			value = value ^ (int)str2.charAt(i);
		}
		return value == 0 ? true : false;
	}
	
	private static boolean checkAnagrams(String str1, String str2){
		//remove the white spaces in the strings
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		//check both strings have the same length
		if(str1.length() != str2.length())
			return false;
		
		//convert string to character array
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		
		//sort the character array, it will be easy for comparison
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		//now compare both character array
		if(Arrays.equals(array1, array2))
			return true;
		return false;
	}
}
/*
OUTPUT

	Enter the String 1 :: keep
	Enter the String 2 :: peek
	Both strings are Anagrams.
	
	Enter the String 1 :: mother in law
	Enter the String 2 :: hitler woman
	Both strings are Anagrams.

	Enter the String 1 :: listen
	Enter the String 2 :: silent
	Both strings are Anagrams.
	
	Enter the String 1 :: triangle
	Enter the String 2 :: integral
	Both strings are Anagrams.

*/



Write a Java program to find the Most Repeated Character in the Given String.
package com.java.strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
* 	Most Repeated Character
* ------------------------
* Write a Java Program to find Most repeated character.
*
* solution:
* Use Hashmap to store the occurrences of the
* character.
* say Given string : malayalam
* m is occurred 2 times
* a is occurred 4 times
* l is occurred 2 times
* y is occurred 1 time
*
* So "m" is the most repeated char
*
*/

public class MostRepeatedChar {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any String : ");
String str = scanner.nextLine().trim();

		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for(Character c : str.toCharArray()){
			if(charMap.containsKey(c))
				charMap.put(c, charMap.get(c)+1);
			else
				charMap.put(c, 1);
		}
		
		int maxCount = 0 ;
		char mostRepeatedChar = 0;
		
		Set<Character> keySet = charMap.keySet();
		for(Character c : keySet){
			int value = charMap.get(c);
			if(maxCount < value){
				maxCount = value;
				mostRepeatedChar = c;
			}
		}

		System.out.println("Most Repeated Character is : "+mostRepeatedChar);
		System.out.println("Repeated count is : "+maxCount);
		scanner.close();
	}
}
/*
OUTPUT
Enter any String : malayalam
Most Repeated Character is : a
Repeated count is : 4

	Enter any String : java
	Most Repeated Character is : a
	Repeated count is : 2
*/


How do you count the Number of Words in a given String using Split method?
package com.java.strings;

import java.util.Scanner;

/*
* Count the number of Words using split method
* ---------------------------------------------
* Write the java program to count the number of
* words in the given string using split method
*
* string.split("\\s");
* The above method returns the no of words
*
* say Given String : java programming
* no of words : 2
* say Given String : code
* no of words : 1
*
*/

public class CountWords2 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any String : ");
String str = scanner.nextLine().trim();

		String words[] = str.split("\\s");
		int wordCount = words.length;
		
		System.out.println("Number of words : "+wordCount);
		scanner.close();
	}
}
/*
OUTPUT
Enter any String : java programming
Number of words : 2

	Enter any String : 123 123
	Number of words : 2
		
	Enter any String : code
	Number of words : 1

	Enter any String : I am a good coder
	Number of words : 5
*/



Write a Java Program to Print All Combinations of a given String.
package com.java.strings;

import java.util.Scanner;

/*
* Combination
* ------------
*
* A combination is a selection of all or part of
* a set of objects, without regard to the order in
* which objects are selected.
*
* For example, suppose we have a set of
* three letters: A, B, and C. We might ask how many ways
* we can select 2 letters from that set.
* Each possible selection would be an example of a combination.
* The complete list of possible selections
* would be: AB, AC, and BC.
*
* When the order doesn't matter, it is a Combination.
* When the order does matter it is a Permutation.
*
* Order does matter
  1 2 3
  1 3 2
  2 1 3
  2 3 1		
  3 1 2
  3 2 1

*/

public class CombinationOfString {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any String : ");
String s = scanner.nextLine().trim();
System.out.println("All Combinations are :: ");
combination("", s,0);
scanner.close();
}

	public static void combination(String c,String s,int curIndex){
		for(int i=curIndex;i<s.length();i++){
			System.out.println(c+s.charAt(i));
			combination(c+s.charAt(i), s, i+1);
		}
	}
}
/*
OUTPUT
Enter any String : abc
All Combinations are ::
a
ab
abc
ac
b
bc
c

	Enter any String : 123
	All Combinations are :: 
	1
	12
	123
	13
	2
	23
	3
*/

Write a Java Program to Print All Permutations of a given String.
package com.java.strings;

import java.util.Scanner;

/*
* Permutation
* ------------
*
* A permutation, also called an �arrangement number�
* or �order,� is a rearrangement of the elements of
* an ordered list S into a one-to-one correspondence
* with S itself. A string of length n has n! permutation.
*
* Permutation of String "abc" are
* abc, acb, bac, bca, cab, cba
*
*/
public class PermutationOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String s = scanner.nextLine().trim();
		permutation("", s);
		scanner.close();
	}
	
	public static void permutation(String p,String s){
		if(s.length() == 0)
			System.out.println(p);
		for(int i=0; i < s.length(); i++){
			permutation(p+s.charAt(i), s.substring(0, i)+s.substring(i+1));
		}
	}
}
/*
OUTPUT

	Enter any String : abc
	abc
	acb
	bac
	bca
	cab
	cba
	
	Enter any String : 1234
	1234
	1243
	1324
	1342
	1423
	1432
	2134
	2143
	2314
	2341
	2413
	2431
	3124
	3142
	3214
	3241
	3412
	3421
	4123
	4132
	4213
	4231
	4312
	4321
*/



Sorting
Bubble Sort
package com.algorithm.sorting;

import java.util.Arrays;

/*
* Bubble Sort
* ------------ 
* Bubble sort, sometimes referred to as sinking sort,
* is a simple sorting algorithm that repeatedly steps
* through the list, compares adjacent elements and
* swaps them if they are in the wrong order.
*
* The pass through the list is repeated until the
* list is sorted. The algorithm, which is a comparison
* sort, is named for the way smaller or larger
* elements "bubble" to the top of the list.
*
* Time Complexity
* ----------------
* Worst Case : O(n^2)
* Best Case : O(n)
  */

public class BubbleSort {
public static void main(String[] args) {
int array[] ={3,60,35,2,45,320,5};
System.out.println("Before Sorting :: ");
System.out.println(Arrays.toString(array));
bubbleSort(array);
System.out.println("After Sorting :: ");
System.out.println(Arrays.toString(array));
}

	public static void bubbleSort(int array[]){
		int n = array.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
/*
OUTPUT
Before Sorting ::
[3, 60, 35, 2, 45, 320, 5]
After Sorting ::
[2, 3, 5, 35, 45, 60, 320]
*/


Quick Sort
package com.algorithm.sorting;

import java.util.Arrays;
/*
* Quick Sort
* ----------
* Quicksort (partition-exchange sort) is an efficient
* sorting algorithm.
*
* Quicksort is a divide-and-conquer algorithm.
* It works by selecting a 'pivot' element from the
* array and partitioning the other elements into
* two sub-arrays, according to whether they are
* less than or greater than the pivot.
* The sub-arrays are then sorted recursively.
* This can be done in-place, requiring small additional
* amounts of memory to perform the sorting.
*
* Time Complexity
* ---------------
* Worst Case 	: O(n^2)
* Best Case 	: O(n*log(n))
*
*/

public class QuickSort {
public static void main(String[] args) {
int array[] = {90,23,101,45,65,23,67,89,34,23};
System.out.println("Before Sorting :: ");
System.out.println(Arrays.toString(array));
sort(array,0,array.length-1);
System.out.println("After Sorting :: ");
System.out.println(Arrays.toString(array));
}

	public static void sort(int array[], int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			sort(array, low, pi - 1);
			sort(array, pi + 1, high);
		}
	}

	public static int partition(int array[], int low, int high) {
		int pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return i + 1;
	}
}
/*
OUTPUT
Before Sorting ::
[90, 23, 101, 45, 65, 23, 67, 89, 34, 23]
After Sorting ::
[23, 23, 23, 34, 45, 65, 67, 89, 90, 101]
*/


Selection Sort
package com.algorithm.sorting;

import java.util.Arrays;

/*
* Selection Sort
* --------------
* The selection sort algorithm sorts an array
* by repeatedly finding the minimum element
* (considering ascending order) from unsorted
* part and putting it at the beginning.
* The algorithm maintains two subarrays in a given array.
* - The subarray which is already sorted.
* - Remaining subarray which is unsorted.
*
* Time Complexity
* ---------------
* Worst Case 	: O(n^2)
* Best Case 	: O(n*log(n))
*
*/

public class SelectionSort {
public static void main(String[] args) {
int array[] = {64,25,12,22,11};
System.out.println("Before Sorting :: ");
System.out.println(Arrays.toString(array));
selectionSort(array);
System.out.println("After Sorting :: ");
System.out.println(Arrays.toString(array));
}

	public static void selectionSort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int minIndex = i;
			for (int j = i + 1; j < n; j++)
				if (array[j] < array[minIndex])
					minIndex = j;
			//swap the minimum elt with the elt in index i.
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}
}
/*
OUTPUT
Before Sorting ::
[64, 25, 12, 22, 11]
After Sorting ::
[11, 12, 22, 25, 64]
*/



Insertion Sort
package com.algorithm.sorting;

import java.util.Arrays;
/*
* Insertion Sort
* --------------
* Insertion sort is the sorting mechanism where
* the sorted array is built having one item at a time.
* The array elements are compared with each
* other sequentially and then arranged simultaneously
* in some particular order.
*
* It is much less efficient on large lists than
* more advanced algorithms such as quicksort, heapsort,
* or merge sort.
*
* Time Complexity
* ---------------
* Worst Case : O(n^2)
* Best Case : O(n)
  */

public class InsertionSort {
public static void main(String[] args) {
int array[] ={3,60,35,2,45,320,5};
System.out.println("Before Sorting :: ");
System.out.println(Arrays.toString(array));
insertionSort(array);
System.out.println("After Sorting :: ");
System.out.println(Arrays.toString(array));
}

	public static void insertionSort(int array[]){
		int n = array.length;
		for(int i=1;i<n;i++){
			int key = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > key){
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}
	}
}
/*
OUTPUT
Before Sorting ::
[3, 60, 35, 2, 45, 320, 5]
After Sorting ::
[2, 3, 5, 35, 45, 60, 320]
*/

Merge Sort
package com.algorithm.sorting;

import java.util.Arrays;

/*
* Merge Sort
* ----------
* In computer science, merge sort is an efficient, general-purpose,
* comparison-based sorting algorithm.
* Merge sort is a divide and conquer algorithm.
*
* It divides input array in two halves, calls itself for
* the two halves and then merges the two sorted halves.
*
*
* Time Complexity
* ---------------
* Worst Case : O(n*log(n))
* Best Case : O(n*log(n))
  */

public class MergeSort {
public static void main(String[] args) {
int array[] = {90,23,101,45,65,23,67,89,34,23};
System.out.println("Before Sorting :: ");
System.out.println(Arrays.toString(array));
sort(array,0,array.length-1);
System.out.println("After Sorting :: ");
System.out.println(Arrays.toString(array));
}

	public static void mergeSort(int array[], int leftIndex, int midIndex, int rightIndex) {
		int n1 = midIndex - leftIndex + 1;
		int n2 = rightIndex - midIndex;

		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			leftArray[i] = array[leftIndex + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = array[midIndex + 1 + j];

		int i = 0, j = 0;
		int k = leftIndex;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public static void sort(int array[], int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int midIndex = (leftIndex + rightIndex) / 2;
			sort(array, leftIndex, midIndex);
			sort(array, midIndex + 1, rightIndex);
			mergeSort(array, leftIndex, midIndex, rightIndex);
		}
	}
}

/*
OUTPUT
Before Sorting ::
[90, 23, 101, 45, 65, 23, 67, 89, 34, 23]
After Sorting ::
[23, 23, 23, 34, 45, 65, 67, 89, 90, 101]
*/




Searching
Linear Search
package com.algorithm.search;

/*
* Linear Search
* --------------
* In computer science, a linear search or
* sequential search is a method for finding
* an element within a list.
*
* It sequentially checks each element of the
* list until a match is found or the
* whole list has been searched.
*
* Time Complexity
* ----------------
* Worst Case 	O(n)
* Best Case 	O(1)
  */

public class LinearSearch {
public static void main(String[] args) {
int array[] ={3,60,35,2,45,320,5};
int X = 320;

		for(int i=0;i<array.length;i++)
			if(X == array[i]){
				System.out.println("Element found at index : "+i);
				return;
			}
			
		System.out.println("Element NOT found");
	}
}
/*
OUTPUT
array[] ={3,60,35,2,45,320,5}
X = 320
Element found at index : 5

	OUTPUT
	array[] ={3,60,35,2,45,320,5}
	X = 12
	Element NOT found
*/


Binary Search
package com.algorithm.search;

/*
* Binary Search
* -------------- 
* In computer science, binary search, also known as
* half-interval search is a search algorithm that
* finds the position of a target value within a sorted array.
*
* Binary search compares the target value to the middle element
* of the array. If they are not equal, the half in which
* the target cannot lie is eliminated and the search continues
* on the remaining half, again taking the middle element
* to compare to the target value, and repeating this until
* the target value is found. If the search ends with the
* remaining half being empty, the target is not in the array.
*
* Time Complexity
* ----------------
* Worst Case 	O(log n)
* Best Case	O(1)
*
* This search is faster than linear search.
  */

public class BinarySearch {
public static void main(String[] args) {
int array[] = { 10, 20, 30, 40, 50 };
int key = 50;
int index = binarySearch(array, key);
if(index == -1)
System.out.println("Element NOT found.");
else
System.out.println("Element found at index : "+index);
}

	public static int binarySearch(int array[], int key) {
		int leftIndex = 0, rightIndex = array.length - 1;
		while (leftIndex <= rightIndex) {
			int mid = (leftIndex + rightIndex) / 2;
			if (array[mid] == key)
				return mid;
			if (array[mid] < key)
				leftIndex = mid + 1;
			else
				rightIndex = mid - 1;
		}
		return -1;
	}
}
/*
OUTPUT
array[] = { 10, 20, 30, 40, 50 }
key = 50
Element found at index : 4

	OUTPUT
	array[] = { 10, 20, 30, 40, 50 }
	key = 100
	Element NOT found.
*/


Print the Series
Write the Java Program to print the following series EVEN number Series
package com.java.series;

import java.util.Scanner;

/*
* EVEN Number Series
* ------------------
* 0 2 4 6 8 10 12 14 ....
*
* In the for loop, either use i++, check i is even and print
* Else in the for loop use i+=2 then print i value
* i starts with value 0
  */
  public class EvenNumberSeries {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the N value : ");
  int N = scanner.nextInt();

  	System.out.println("Even numbers up to "+N);
  	for(int i=0;i<=N;i+=2)
  		System.out.print(i+" ");
  	
  	scanner.close();
  }
  }

/*
OUTPUT
Enter the N value : 25
Even numbers up to 25
0 2 4 6 8 10 12 14 16 18 20 22 24

	Enter the N value : 14
	Even numbers up to 14
	0 2 4 6 8 10 12 14 
*/

Write the Java Program to print the following series ODD number Series
package com.java.series;

import java.util.Scanner;

/*
* ODD Number Series
* ------------------
* 1 3 5 7 9 11 13 15 17 19 .....
*
* In the for loop, either use i++, check i is odd and print
* Else in the for loop use i+=2 then print i value
* i starts with value 1
  */

public class OddNumberSeries {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the N value :");
int N = scanner.nextInt();

		System.out.println("ODD numbers up to "+N);
		for(int i=1;i<=N;i+=2)
			System.out.print(i+" ");
		
		scanner.close();
	}
}
/*
OUTPUT

	Enter the N value : 20
	ODD numbers up to 20
	1 3 5 7 9 11 13 15 17 19

	Enter the N value : 13
	ODD numbers up to 13
	1 3 5 7 9 11 13
*/

Write the Java Program to print the following series Pattern Series
package com.java.series;

import java.util.Scanner;
/*
* Write the program to print the following series
*
* 3 33 333 3333 33333 333333 .....
*
* Best approach
* Use String variable and starts with 3,
* and append 3 for every iteration
*
*/

public class PatternSeries {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the N value for the series : ");
int N = scanner.nextInt();

		int baseValue = 3;
		int result = 0;
		for(int i=0;i<N;i++){
			result = result + baseValue * (int)Math.pow(10, i);
			System.out.print(result+" ");
		}
		
		System.out.print("\nUsing String approach: ");
		//Alternate approach
		String s = "";
		for(int i=0;i<N;i++){
			s += "3";
			System.out.print(s+" ");
		}
		
		scanner.close();
	}
}
/*
OUTPUT
Enter the N value for the series : 5
3 33 333 3333 33333
Using String approach:
3 33 333 3333 33333

	Enter the N value for the series : 10
	3 33 333 3333 33333 333333 3333333 33333333 333333333 -961633963
	Using String approach: 
	3 33 333 3333 33333 333333 3333333 33333333 333333333 3333333333 
*/

Write the Java Program to print the following series Fibonacci Series
package com.java.series;

/*
* Fibonacci Series
* ----------------
* In mathematics, the Fibonacci numbers,
* commonly denoted Fn, form a sequence,
* called the Fibonacci sequence, such that
* each number is the sum of the
* two preceding ones, starting from 0 and 1.
*
* In other words, the previous two numbers
* are added to get the next number, starting from 0 & 1.
*
* The Fibonacci Sequence is the series
* of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
*
*/

public class FibonacciSeries {
public static void main(String[] args) {
int N = 10;
int num1 = 0;
int num2 = 1;

		System.out.println("Fibonacci series N="+N);
		System.out.print(num1+" "+num2);
		int i = 2;
		while(i <= N){
			i++;
			int temp = num1+num2;
			num1 = num2;
			num2 = temp;
			System.out.print(" "+num2);
		}
	}
}
/*
OUTPUT
Fibonacci series N=15
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610

	Fibonacci series N=10
	0 1 1 2 3 5 8 13 21 34 55
*/

Write the Java Program to print the following series Prime Number Series
package com.java.series;

/*
* Prime Number Series
* --------------------
* 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 ....
*
* Prime Number
* ------------
* A prime number is a natural number greater than 1
* that is not a product of two smaller natural numbers.
*
* A natural number thats divisible only by itself and 1.
*
*/

public class PrimeNumberSeries {
public static void main(String[] args) {
int n = 100;
System.out.println("Prime numbers up to : "+n);
for(int i=2; i<=n; i++)
if(isPrime(i))
System.out.print(i+", ");
}
public static boolean isPrime(int num){
for(int i=2;i<=Math.sqrt(num);i++)
if(num % i == 0)
return false;
return true;
}
}
/*
OUTPUT
n = 20
Prime numbers up to : 20
2, 3, 5, 7, 11, 13, 17, 19

	OUTPUT
	n = 100
	Prime numbers up to : 100
	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 
	43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 

*/




