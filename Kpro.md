```kotlin
import java.util.ArrayList

fun main() {
    // Uncomment the functions you want to call
    // OddorEven()
    // val isPalindrome = PalindromeString("madam")
    // if (isPalindrome) {
    //     println("palindrome")
    // } else {
    //     println("not a palindrome")
    // }
    // val isPalindrome = PalindromeNumber(12321)
    // if (isPalindrome) {
    //     println("palindrome")
    // } else {
    //     println("not a palindrome")
    // }
    // leafYear(2000)
    // for (i in 0 until 20) {
    //     if (isPrime(i)) {
    //         println("$i")
    //     }
    // }
    // val largestNum = largestNumber(10, 200, 30)
    // println("$largestNum")
    // fibonaicOrdinary(10)
    // for (i in 0 until 10) {
    //     val fib = fibonaicRecursion(i)
    //     println("$fib")
    // }
    // val fac = factorialOrdinary(5)
    // println("$fac")
    // val facR = factorialRegression(5)
    // println("$facR")
    // val dn = intArrayOf(10, 20, 30, 30, 40, 60, 40)
    // findDuplicateInt(dn)
    // val mystr = "Hi how are you you are"
    // findDuplicateWord(mystr)
    // val sarray = intArrayOf(100, 10, 40, 60, 200)
    // sortArray(sarray) // selection sort
    // val larray = intArrayOf(100, 10, 40, 60, 200)
    // val tl = lArray(larray)
    // println("$tl")
    // val rarray = intArrayOf(100, 20, 30, 40, 30, 40)
    // removeDuplicate(rarray)
    // val rearray = intArrayOf(100, 20, 30, 40, 30, 40)
    // reverseArray(rearray)
    // val eo = intArrayOf(100, 20, 30, 40, 30, 40)
    // evenOdd(eo)
    // val a1 = intArrayOf(10, 20, 30, 40, 50, 60)
    // val a2 = intArrayOf(20, 40, 90, 100)
    // intersectionFindCommon(a1, a2)
    // unionRemoveDuplicate(a1, a2)
    // val intArray = intArrayOf(10, 20, 30, 60, 70, 80, 70, 10, 10, 10)
    // val mfelement = mostFrequentElement(intArray)
    // println("$mfelement")
    // val mystrfre = "hi how are you you hi are bye are"
    // val mystrArray = mystrfre.split(" ")
    // val mystrfree = mostFrequentElementString(mystrArray)
    // println("$mystrfree")
    // val mystrfre2 = "hi how are you you hi are bye are"
    // val cArray = mystrfre2.replace(" ", "").toCharArray()
    // println("${mostFrequentChar(cArray)}")
    // val larrayelement = intArrayOf(20, 30, 50, 55, 1)
    // val l = findLargest(larrayelement)
    // println("$l")
    // val zArray = intArrayOf(10, 20, 0, 35, 0, 70, 0)
    // moveAllZeroAtFirst(zArray)
    // moveAllZeroAtLast(zArray)
    // val roArray = intArrayOf(20, 30, 50, 55, 1)
    // roatationArray(roArray)
    // swafstring("hi", "how")
    // val nvc = "Hi I am i"
    // numberOfVowelsConsonants(nvc)
    // val rstr = "Hi How Are You"
    // reverseString(rstr)
    // val nchar = "hi how are you"
    // numberOfCharacters(nchar)
    // val cstr = "abc"
    // combinationStr(" ", cstr, 0)
    // permutation(" ", cstr)

    val al = ArrayList<Int>()
    al.add(10)
    al.add(20)
    al.add(30)
    al.add(10)

    alRemoveDuplicate(al)
}

fun alRemoveDuplicate(al: ArrayList<Int>) {
    val iterator = al.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        val count = al.count { it == element }
        if (count > 1) {
            iterator.remove()
        }
    }

    for (n in al) {
        println(n)
    }
}

fun permutation(p: String, cstr: String) {
    if (cstr.isEmpty()) {
        println(p.trim())
    }

    for (i in 0 until cstr.length) {
        permutation(p + cstr[i], cstr.substring(0, i) + cstr.substring(i + 1))
    }
}

fun combinationStr(estr: String, cstr: String, num: Int) {
    for (i in num until cstr.length) {
        println((estr + cstr[i]).trim())
        combinationStr(estr + cstr[i], cstr, i + 1)
    }
}

fun numberOfCharacters(nchar: String) {
    val ch = nchar.toCharArray()
    var count = 0
    for (i in ch.indices) {
        if (ch[i] != 'h' && ch[i] != ' ') {
            count++
        }
    }
    println(count)
}

fun reverseString(rstr: String) {
    val ch = rstr.toCharArray()
    var myrev = ""
    for (i in ch.size - 1 downTo 0) {
        myrev = myrev + rstr[i]
    }

    println(myrev)
}

fun numberOfVowelsConsonants(nvs: String) {
    val cstr = "AEIOUaeiou"
    var c = 0
    var v = 0

    for (i in nvs.indices) {
        if (nvs[i] != ' ') {
            if (cstr.indexOf(nvs[i]) != -1) {
                v++
            } else {
                c++
            }
        }
    }

    println("consonants : $c vowels : $v")
}

fun swafstring(s1: String, s2: String) {
    var s1 = s1
    var s2 = s2

    s1 = s1 + s2
    s2 = s1.substring(0, (s1.length - s2.length))
    s1 = s1.substring(s2.length)

    println("s1: $s1 s2: $s2")
}

fun roatationArray(roArray: IntArray) {
    val rc = 2
    val arraysize = roArray.size
    val roatationarray = IntArray(arraysize)
    var ni = 0

    var rcNew = rc
    if (arraysize < rc) {
        rcNew = rc - arraysize
    }

    for (i in arraysize - rcNew until arraysize) {
        roatationarray[ni] = roArray[i]
        ni++
    }

    for (j in 0 until arraysize - rcNew) {
        roatationarray[ni] = roArray[j]
        ni++
    }

    println(roatationarray.contentToString())
}

fun moveAllZeroAtLast(zArray: IntArray) {
    var alength = 0
    for (i in zArray.indices) {
        if (zArray[i] != 0) {
            val temp = zArray[i]
            zArray[i] = zArray[alength]
            zArray[alength] = temp
            alength++
        }
    }
    println(zArray.contentToString())
}

fun moveAllZeroAtFirst(zArray: IntArray) {
    var alength = zArray.size - 1
    for (i in zArray.size - 1 downTo 0) {
        if (zArray[i] != 0) {
            val temp = zArray[i]
            zArray[i] = zArray[alength]
            zArray[alength] = temp
            alength--
        }
    }
    println(zArray.contentToString())
}

fun findLargest(larrayelement: IntArray): Int {
    var lar = larrayelement[0]
    for (i in larrayelement.indices) {
        if (larrayelement[i] > lar) {
            lar = larrayelement[i]
        }
    }
    return lar
}

fun mostFrequentChar(cArray: CharArray): Char {
    var mf = 0
    var mfe = ' '
    for (i in cArray.indices) {
        var cf = 1
        for (j in i + 1 until cArray.size) {
            if (cArray[i] == cArray[j]) {
                cf++
            }
        }
        if (mf < cf) {
            mf = cf
            mfe = cArray[i]
        }
    }
    println(mf)
    return mfe
}

fun mostFrequentElementString(StrArray: Array<String>): String {
    var mf = 0
    var mfe = " "
    for (i in StrArray.indices) {
        var cf = 1
        for (j in i + 1 until StrArray.size) {
            if (StrArray[i] == StrArray[j]) {
                cf++
            }
        }
        if (mf < cf) {
            mf = cf
            mfe = StrArray[i]
        }
    }
    return mfe
}

fun mostFrequentElement(IntArray: IntArray): Int {
    var mf = 0
    var mfe = 0
    for (i in IntArray.indices) {
        var cf = 1
        for (j in i + 1 until IntArray.size) {
            if (IntArray[i] == IntArray[j]) {
                cf++
            }
        }
        if (mf < cf) {
            mf = cf
            mfe = IntArray[i]
        }
    }
    return mfe
}

fun unionRemoveDuplicate(a1: IntArray, a2: IntArray) {
    val totalarray = a1.size + a2.size
    val newArray = IntArray(totalarray)
    var uasize = 0
    for (i in a1.indices) {
        newArray[uasize] = a1[i]
        uasize++
    }
    for (j in a2.indices) {
        var isg = false
        for (k in newArray.indices) {
            if (newArray[k] == a2[j]) {
                isg = true
                break
            }
        }
        if (!isg) {
            newArray[uasize] = a2[j]
            uasize++
        }
    }
    println(newArray.contentToString())
}

fun intersectionFindCommon(a1: IntArray, a2: IntArray) {
    for (i in a1.indices) {
        for (j in a2.indices) {
            if (a1[i] == a2[j]) {
                println("${a1[i]}")
            }
        }
    }
}

fun evenOdd(eo: IntArray) {
    for (i in eo.indices step 2) {
        println("${eo[i]}")
    }
}

fun reverseArray(rearray: IntArray) {
    var left = 0
    var right = rearray.size - 1
    while (left < right) {
        val temp = rearray[left]
        rearray[left] = rearray[right]
        rearray[right] = temp
        left++
        right--
    }
    println(rearray.contentToString())
}

fun removeDuplicate(rarray: IntArray) {
    var unique = 0
    for (i in rarray.indices) {
        var isDuplicate = false
        for (j in i + 1 until rarray.size) {
            if (rarray[i] == rarray[j]) {
                isDuplicate = true
                break
            }
        }
        if (!isDuplicate) {
            rarray[unique] = rarray[i]
            unique++
        } else {
            rarray[unique] = 0
            unique++
        }
    }
    for (i in rarray.indices) {
        if (rarray[i] != 0) {
            println("${rarray[i]}")
        }
    }
}

fun lArray(larray: IntArray): Int {
    for (i in 0 until larray.size - 1) {
        for (j in i + 1 until larray.size) {
            if (larray[i] < larray[j]) {
                val temp = larray[i]
                larray[i] = larray[j]
                larray[j] = temp
            }
        }
    }
    return larray[2]
}

fun sortArray(sarray: IntArray) {
    for (i in 0 until sarray.size - 1) {
        for (j in i + 1 until sarray.size) {
            if (sarray[i] < sarray[j]) {
                val temp = sarray[i]
                sarray[i] = sarray[j]
                sarray[j] = temp
            }
        }
    }
    println(sarray.contentToString())
}

/*fun findDuplicateWord(mystr: String) {
    val mystrArray = mystr.split(" ").filter { it.isNotBlank() }
    for (i in mystrArray.indices) {
        var count = 1
        if (mystrArray[i] != "") {
            for (j in i + 1 until mystrArray.size) {
                if (mystrArray[i] == mystrArray[j]) {
                    mystrArray[j] = ""
                    count++
                }
            }
        }
        if (count > 1) {
            println(mystrArray[i])
        }
    }
}*/

fun findDuplicateWord(mystr: String) {
    val mystrArray = mystr.split(" ").filter { it.isNotBlank() }
    val uniqueWords = mutableSetOf<String>()
    val duplicateWords = mutableSetOf<String>()

    for (word in mystrArray) {
        if (!uniqueWords.add(word)) {
            duplicateWords.add(word)
        }
    }

    for (word in duplicateWords) {
        println(word)
    }
}






fun findDuplicateInt(dn: IntArray) {
    for (i in 0 until dn.size - 1) {
        var count = 1
        if (dn[i] != 0) {
            for (j in i + 1 until dn.size) {
                if (dn[i] == dn[j]) {
                    dn[j] = 0
                    count++
                }
            }
        }
        if (count > 1) {
            println(dn[i])
        }
    }
}

fun factorialRegression(facr: Int): Int {
    if (facr <= 1) {
        return 1
    }
    return facr * factorialRegression(facr - 1)
}

fun factorialOrdinary(fac: Int): Int {
    var total = 1
    for (i in 1..fac) {
        total *= i
    }
    return total
}

fun fibonaicRecursion(fb: Int): Int {
    if (fb <= 1) {
        return 1
    }
    return fibonaicRecursion(fb - 1) + fibonaicRecursion(fb - 2)
}

fun fibonaicOrdinary(c: Int) {
    var first = 0
    var second = 1

    println("$first")
    println("$second")

    for (i in 2 until c) {
        val combine = first + second
        println("$combine")
        first = second
        second = combine
    }
}

fun largestNumber(n1: Int, n2: Int, n3: Int): Int {
    var largest = n1
    if (n2 > largest) {
        largest = n2
    }
    if (n3 > largest) {
        largest = n3
    }
    return largest
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun leafYear(n: Int) {
    if ((n % 4 == 0 && (n % 100) != 0) || (n % 400 == 0)) {
        println("leap year")
    } else {
        println("Not a leap year")
    }
}

fun PalindromeNumber(n: Int): Boolean {
    val orginalnumber = n
    var reversenumber = 0

    var temp = n
    while (temp != 0) {
        val digit = temp % 10
        reversenumber = reversenumber * 10 + digit
        temp = temp / 10
    }
    return orginalnumber == reversenumber
}

fun PalindromeString(str: String): Boolean {
    val mystr = str.toLowerCase()
    var left = 0
    var right = mystr.length - 1

    while (left < right) {
        if (mystr[left] != mystr[right]) {
            return false
        }
        left++
        right--
    }
    return true
}

fun OddorEven() {
    val mynumber = 10
    if (mynumber % 2 == 0) {
        println("even")
    } else {
        println("odd")
    }
}



```