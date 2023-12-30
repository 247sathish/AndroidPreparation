```kotlin
fun main(args: Array<String>) {

//Variable 

    var i:Int = 5 //Int
    var l:Int=20//Long
    var d:Double=1.1 //Double
    var c:Char='c' //Char
    var b:Boolean=true //Boolean
    var s:String="hi" //String
    var nullint:Int?=null

    println("Int: "+i)
    println("Int: $i")
    println("Long: "+ l.toLong())
    println("Null initilize: "+nullint)
    nullint=10
    println("After adding value:"+nullint)


    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String

    /*myNum=10;*/ //value can not change because that is Val

    println(myNum)


//String  

    val str = "Hello, javatpoint!"
    println(str[0])
    println(str[1])
    println(str[str.length-1])


    val strr = "abc  "
    println("$strr is a string which length is ${strr.length}")
    println("$strr is a string which length is ${strr.trim().length}")

    val text = """Kotlin is official language  
        #announce by Google for  
        #android application development  
    """.trimMargin("#")
    println(text)

    val str1 = "Hello, World!"
    val str2 = "Hello, World!"
    println(str1==str2) //true  
    println(str1!=str2) //false  

    var string: String? = "Hello!"
    if(string != null) { // smart cast  
        println(string.length) // It works now!  
    }

    println(string!!.length)//




//Kotlin Array

    val size=5
    val arrWithNull:Array<String?> = arrayOfNulls(size)
    arrWithNull[0]="one"
    arrWithNull[2]="two"
    arrWithNull.set(2,"three")

    for(myvar in arrWithNull)
    {
        println(myvar)
    }

    val mynumArray:Array<Int> = arrayOf(1,2,3,4)
    //var mynumArray = arrayOf(1,2,3,4)

    for(myvar in mynumArray)
    {
        println(myvar)
    }


//Kotlin Collections
    //Methods of Immutable Collection (listOf,mapOf(),setOf()) read only functionalities

    //List
    val stringList: List<String> = listOf("Ajay","Vijay","Prakash","Vijay","Rohan")
    val list: List<String> = listOf()


    for(element in stringList){
        print(element+" ")
    }
    println()
    println(stringList.get(0))
    println(stringList.indexOf("Vijay"))
    println(stringList.lastIndexOf("Vijay"))
    println(stringList.size)
    println(stringList.contains("Prakash"))
    println(stringList.containsAll(list))
    println(stringList.subList(2,4))
    println(stringList.isEmpty())
    println(stringList.drop(1))
    println(stringList.dropLast(2))


    //MutableList
    var mutableList:MutableList<String> = mutableListOf()

    mutableList.add("Ajay") // index 0  
    mutableList.add("Vijay") // index 1  
    mutableList.add("Prakash") // index 2  

    var mutableList2:MutableList<String> = mutableListOf()
    var mutableList3:MutableList<String> = mutableListOf("Dharmesh","Umesh")
    var mutableList4:MutableList<String> = mutableListOf("Ajay","Dharmesh","Ashu")
    mutableList2.addAll(mutableList)
    mutableList.add("Rohan")
    mutableList.add("Raj")
    mutableList.add("Raj2")


    println(".....mutableList.....")
    for(element in mutableList){
        println(element)
    }
    println(".....mutableList[2].....")
    for(element1 in mutableList2){
        println(element1)
    }

    println(mutableList[2])
    mutableList.add(2,"Rohan")
    println("......mutableList.add(2,\"Rohan\")......")
    for(element in mutableList){
        println(element)
    }
    mutableList.add("Ashu")
    println(".....mutableList.add(\"Ashu\")......")
    for(element in mutableList){
        println(element)
    }
    mutableList.addAll(1,mutableList3)
    println("... mutableList.addAll(1,mutableList3)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.addAll(mutableList2)
    println("...mutableList.addAll(mutableList2)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.remove("Vijay")
    println("...mutableList.remove(\"Vijay\")....")
    for(element in mutableList){
        println(element)
    }
    mutableList.removeAt(2)
    println("....mutableList.removeAt(2)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.removeAll(mutableList2)
    println("....  mutableList.removeAll(mutableList2)....")
    for(element in mutableList){
        println(element)
    }

    println("....mutableList.set(2,\"Ashok\")....")
    mutableList.set(2,"Ashok")
    for(element in mutableList){
        println(element)
    }

    println(".... mutableList.retainAll(mutableList4)....")
    mutableList.retainAll(mutableList4)
    for(element in mutableList){
        println(element)
    }
    println(".... mutableList2.clear()....")
    mutableList2.clear()

    for(element in mutableList2){
        println(element)
    }
    println(".... mutableList2 after mutableList2.clear()....")
    println(mutableList2)

    println("....mutableList.subList(1,2)....")
    println(mutableList.subList(1,2))


    //set
    val mySet: Set<Int> = setOf(2,6,4,29,4,5)
    println(".......print set.........")
    for(element in mySet){
        println(element)
    }

    //mutableset
    var mymSet: MutableSet<Int> = mutableSetOf()
    mymSet.add(20)
    println(".......print mutable set.........")
    for(element in mymSet){
        println(element)
    }

    /*val mySet: Set<Int> = setOf(2,6,4,29,4,5)
    val mymSet: MutableSet<Int> = mutableSetOf()
    mymSet.addAll(mySet)
    mymSet.add(3)
      println(".......print set.........")  
    for(element in mymSet){  
        println(element)  
    } */


    //map

    val myMap: Map<Int,String> = mapOf(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")
    for(key in myMap.keys){
        println("Element at key $key = ${myMap.get(key)}")
    }

    //mutable map  
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap.put("name", "Ashu")
    mutableMap.put("city", "Delhi")

    //Hashmap
    val hashMap: HashMap<String,String> = hashMapOf()
    hashMap.put("department", "Development")
    hashMap.put("hobby", "Playing")

    println("......traverse mutableMap.......")
    for (key in mutableMap.keys) {
        println("Key = "+key +", "+"Value = "+mutableMap[key])
    }
    mutableMap.putAll(hashMap)
    println("......traverse mutableMap after mutableMap.putAll(hashMap).......")
    for (key in mutableMap.keys) {
        println("Key = "+key +", "+"Value = "+mutableMap[key])
    }



//For loop

    val numbers:Array<Int> = arrayOf(10, 20, 30, 40, 50)

    for (i in numbers.indices) {
        println(i) 			// 0, 1, 2, 3, 4
        println(numbers[i]) //10, 20, 30, 40, 50
    }


    for(i in numbers)
    {
        println(i) //10, 20, 30, 40, 50
    }


    for(i in 0 until numbers.size)
    {
        println(i) // 0, 1, 2, 3, 4
    }



    for(i in numbers.size-1 downTo 0)
    {
        println(numbers[i])// 50,40,30,20,10
    }


    for(i in 0 until numbers.size step 2)
    {
        println(numbers[i])//10,30,50
    }


//For Each


    // Using forEach loop with indices
    numbers.forEachIndexed { index, value ->
        println(index)      // 0, 1, 2, 3, 4
        println(value)      // 10, 20, 30, 40, 50
    }


    numbers.forEach { number -> println(number) }//10, 20, 30, 40, 50


    // Using forEach loop for elements
    numbers.forEach {
        println(it) // 10, 20, 30, 40, 50
    }


    // Using forEach loop for indices
    numbers.indices.forEach {
        println(it) // 0, 1, 2, 3, 4
    }


    // Using forEach loop in reverse order
    numbers.reversed().forEach {
        println(it)// 50,40,30,20,10
    }


    // Using forEach loop with indices and step
    numbers.forEachIndexed { index, value ->
        if (index % 2 == 0) {
            println(value)//10,30,50
        }
    }




//When
    val x:Any = "hi" // or val x:Any=6
    val result = when (x) {
        1 -> "One"
        2 -> "Two"
        in 6..10 -> "Between 6 and 10"
        is String -> "It's a string"

        else -> "Other"
    }
    println(result)


//Special Class
    //1.Data classes :
    In Kotlin, a data class is a special class that is primarily used to represent immutable data.
    Data classes automatically generate useful methods such as toString(), equals(), hashCode(), and copy(),
    based on the properties declared in the primary constructor.
    This helps in reducing boilerplate code when working with classes that are meant to hold data.


    data class Person(val name: String, val age: Int)

    fun main(args: Array<String>) {
        // Creating an instance of the data class
        val person = Person(name = "John", age = 30)

        // Accessing properties
        println("Name: ${person.name}")
        println("Age: ${person.age}")

        // Copying the data class with a modified property
        val olderPerson = person.copy(age = 35)

        println("Older Person: $olderPerson")

        // Destructuring declaration
        val (personName, personAge) = person
        println("Destructured Name: $personName")
        println("Destructured Age: $personAge")

        // Equality check
        val anotherPerson = Person(name = "John", age = 30)
        println("Are they equal? ${person == anotherPerson}")

        // Printing using toString()
        println(person)
    }


    //2.Enum :
    Enum classes in Kotlin allow you to represent a fixed set of constants
    // Define an enum class named Color with three constants
    enum class Color {
        RED,
        GREEN,
        BLUE
    }

    fun main() {
        // Using the enum constants
        val selectedColor = Color.GREEN

        // Accessing properties of the enum constants
        println("Selected Color: $selectedColor")

        // Enum class methods
        println("Name of the constant: ${selectedColor.name}")
        println("Ordinal value: ${selectedColor.ordinal}")

        // Using when expression with enum
        when (selectedColor) {
            Color.RED -> println("You chose Red!")
            Color.GREEN -> println("You chose Green!")
            Color.BLUE -> println("You chose Blue!")
        }
    }

    //3.Sealead Class :
    A sealed class in Kotlin is a special kind of abstract class that is used to represent restricted class hierarchies.
    A sealed class can be subclassed, but only within the same file where it is declared.

    sealed class Result {
        data class Success(val message: String) : Result()
        data class Error(val errorMessage: String) : Result()
    }

    fun processResult(result: Result) {
        when (result) {
            is Result.Success -> {
                println("Success: ${result.message}")
            }
            is Result.Error -> {
                println("Error: ${result.errorMessage}")
            }
        }
    }

    fun main() {
        val successResult = Result.Success("Operation successful")
        val errorResult = Result.Error("Operation failed")

        processResult(successResult)
        processResult(errorResult)
    }


    //Function
    //1.Top-level function:
    fun greet(name: String): String {
        return "Hello, $name!"
    }

    fun greet2(name: String="hi"): String {
        return "Hello, $name!"
    }

    fun main(a:Array<String>) {
        // Calling the top-level function
        val greeting = greet("Alice")
        println(greeting)
        println(greet2())
    }

    //2.Member function:
    class Person(val name: String) {
        // Member function
        fun introduce(): String {
            return "Hi, I'm $name."
        }
    }

    fun main(a:Array<String>) {
        // Creating an instance of the class
        val person = Person("Bob")

        // Calling the member function
        val introduction = person.introduce()
        println(introduction)
    }

    //3.Extension Function:
    extension functions allow you to add new functionality to existing classes .
    // Extension function for String
    fun String.reverse(): String {
        return this.reversed()
    }

    fun main() {
        // Using the extension function
        val reversedString = "Kotlin".reverse()
        println(reversedString)
    }




    //4.lambda :
    Lambda expression or simply lambda is an anonymous function; a function without name.
    These functions are passed immediately as an expression without declaration.

    syntax:
    val lambdaName: (parameters) -> returnType = { arguments -> functionBody }

    // Simple Lambda
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    // Using the lambda expression
    val result = multiply(4, 7)
    println("Result: $result")

    //Lambda as a Parameter or Higer order function
    fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
        return operation(x, y)
    }

    fun main() {
        val multiply: (Int, Int) -> Int = { a, b -> a * b }

        val result = calculate(4, 7, multiply)
        println("Result of multiplication: $result")
    }
    //Lambda with No Parameters
    val greet: () -> Unit = { println("Hello, Kotlin!") }
    fun main() {
        greet()
    }




    //5.Higher-Order Function:
    It takes  functions as parameters, or it returns a function.

    // Higher order function example: Calculator
    fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
        return operation(x, y)
    }
    fun add(x: Int, y: Int): Int {
        return x + y
    }
    fun subtract(x: Int, y: Int): Int {
        return x - y
    }
    fun multiply(x: Int, y: Int): Int {
        return x * y
    }

    fun main(a:Array<String>) {
        val result1 = calculate(10, 5){a, b -> a + b}
        println("Addition: $result1") // Output: Addition: 15
        val result2 = calculate(10, 5, ::subtract)
        println("Subtraction: $result2") // Output: Subtraction: 5
        val result3 = calculate(10, 5, ::multiply)
        println("Multiplication: $result3") // Output: Multiplication: 50
    }





//Scope Function:  https://typealias.com/start/kotlin-scopes-and-scope-functions/
    //execute block of code with in a specific context 
    //There are five types of scope functions: let, run, with, apply, also.

    1.let ,run, with all are returns the result of the last expression within the block.
    let object refernece is (it) and let execute only not null object.
    run and with object reference is (this).


    2.apply :returns the modified object itself and object reference is(this)
    3.also :returns the original object itself and object reference is(it)

    data class Person(var name: String, var age: Int)

    fun main(a:Array<String>) {
        // Creating a Person object named "John" with an age of 30
        val person = Person("John", 30)

        // Using let
        val letResult = person?.let {
            // The block inside let executes only if 'person' is not null
            println("Name length: ${it.name.length}")
            // Returning the result of the last expression in the block 
            it.name="LetSat"
            //name.toUpperCase()
            it.name
        } ?: 0 // If 'person' is null, letResult is set to 0



        // Using run(Extension Function)
        val runResult = person.run {
            // The block inside run operates on 'person'
            println("Age after five years: ${age + 5}")
            // Returning the result of the last expression in the block ("John Smith")
            this.name="Runsat"
            name.toUpperCase()

        }



        // Using with(Non-extension Function)
        val withResult = with(person) {
            // The block inside with operates on 'person' (implicitly)
            println("Current age: $age")
            // Returning the result of the last expression in the block ("JOHN")
            name="Withsat"
            name.toUpperCase()

        }

        // Using apply
        val applyResult = person.apply {
            // The block inside apply configures 'person'
            name="ApplySat"
            name=name.toUpperCase()

        }
        println("applyResult: $applyResult")

        // Using also
        val alsoResult = person.also {
            // The block inside also performs additional operations on 'person'
            println("Performing additional operations on $it")
            // Modifying the 'name' property to lowercase
            it.name =it.name.toLowerCase()
        }

        // Printing results
        println("letResult: $letResult")
        println("runResult: $runResult")
        println("withResult: $withResult")
        println("applyResult: $applyResult")
        println("alsoResult: $alsoResult")
        println("Original person object: $person")
    }




    //Delegation:
    Delegation in Kotlin is a design pattern that enables an object to hand over the responsibility of certain behaviors to another object.
    It is facilitated by the by keyword.

    Syntax:
    class Delegator : SomeInterface by DelegateObject {
        // Additional code in the delegator class
    }

    val lazyLoadedResource: String by lazy {

    }

    Here are some built-in delegates in Kotlin:

    Delegates.observable: Provides an observable property.
    Delegates.vetoable: Similar to observable, but allows vetoing the changes.
    lazy: Creates a lazy property.
    Delegates.notNull: Ensures that the property is always initialized before accessing its value.
    mapOf / mutableMapOf: Used for property delegation by map.

    Benefits of Delegation in Kotlin
    Code Reusability,Flexibility


//lateinit and lazyinit
    lateinit: The property cannot be of a nullable type.
    lazy: The property can be of either nullable or non-nullable type and prevent unnecerry initialion of object.


    withContext
    Inside a coroutine, we use**withContext** to switch between Dispatchers.

//https://javaconceptoftheday.com/java-interview-programs-with-solutions/
//https://www.interviewbit.com/kotlin-interview-questions/
    https://shirsh94.medium.com/top-100-kotlin-interview-questions-and-answers-d1f6785f336a


}

```
















```