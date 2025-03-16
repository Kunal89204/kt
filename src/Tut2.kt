fun main(){
    val day = 4;

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        else -> "Invalid day"
    }

    print(result)

//    While loop
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    var ice = 0
    while (ice < 10) {
        if (ice == 4) {
            ice++
            continue
        }
        println(ice)
        ice++
    }
}
