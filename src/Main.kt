fun main() {
    // Kotlin Variables
    var a = 10 // Mutable variable (can be reassigned)
    val b = 20 // Immutable variable (cannot be reassigned)

    println("Initial values: a = $a, b = $b")

    a = 15 // Allowed
    println("Updated a: $a")

    // Uncommenting the next line will cause an error
    // b = 25 // Error: Val cannot be reassigned

    // Declare and Assign a Variable
    var num: Number
    num = 10
    println("Number: $num")

    // Incorrect Variable Declaration (Uncomment to see error)
    // var name
    // name = "John"
    // println(name)

    // String Concatenation and Interpolation
    val firstName = "Kunal"
    val lastName = "Khandelwal"
    println("Concatenation: " + firstName + " " + lastName)
    println("String Template: My name is $firstName $lastName")

    // Kotlin Data Types
    val myNum: Int = 5          // Int
    val myDoubleNum: Double = 5.99 // Double
    val myLetter: Char = 'D'    // Char
    val myBoolean: Boolean = true // Boolean
    val myText: String = "Hello" // String

    println("Int: $myNum, Double: $myDoubleNum, Char: $myLetter, Boolean: $myBoolean, String: $myText")

    // Strings as Arrays
    val name: String = "Kunal"
    println("Character at index 2: ${name[2]}")

    // String Methods
    println("Length of name: ${name.length}")
    println("Lowercase: ${name.lowercase()}")
    println("Uppercase: ${name.uppercase()}")
    println("Comparing lowercase and uppercase: ${name.lowercase().compareTo(name.uppercase())}")
    println("String concatenation using plus(): ${firstName.plus(lastName)}")

    // Booleans
    val isKotlinFun: Boolean = true
    println("Is Kotlin fun? $isKotlinFun")

// Conditionals
//Standard just like other languages

if(10<2){
print("yeheh")
}else{
    println("nhehe")
}
    val time = 20
    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)




}

