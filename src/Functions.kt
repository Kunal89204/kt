fun main (){
    println("Hello world")
    myFunc()
    myFunction(20,40)
}


fun myFunc(){
    println("I just got executed")
}

fun myFunction(x: Int, y: Int): Int {
    return (x + y)
}