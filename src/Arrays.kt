fun main(){
    val cars = arrayOf("XUV", "SUV", "Sedan")
    cars[0]= "OPel"
    println(cars[0])
    println(cars.size)

//    Contains in array?
    if ("XUV" in cars){
        print("Hai")
    }else{
        println("nahi hai")
    }

//    Looping thorugh array
    for (x in cars)
        println(x)


}