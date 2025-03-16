// Base class
open class Car(val brand: String, val model: String, val year: Int) {

    open fun startEngine() {
        println("$brand $model's engine started!")
    }

    fun displayInfo() {
        println("Car: $brand $model ($year)")
    }
}

// Derived class (Inheritance)
class ElectricCar(brand: String, model: String, year: Int, val batteryCapacity: Int) : Car(brand, model, year) {

    override fun startEngine() {
        println("$brand $model is running silently on battery power!")
    }

    fun chargeBattery() {
        println("$brand $model is charging. Battery: $batteryCapacity kWh")
    }
}

// Interface
interface Vehicle {
    fun honk()
}

// Implementing Interface
class Truck(val loadCapacity: Int) : Vehicle {

    override fun honk() {
        println("Truck horn: Honk! Honk!")
    }

    fun loadGoods() {
        println("Truck loaded with $loadCapacity kg of goods.")
    }
}

// Data class
data class Owner(val name: String, val age: Int)

// Main function
fun main() {
    val car1 = Car("Toyota", "Corolla", 2022)
    car1.startEngine()
    car1.displayInfo()

    val tesla = ElectricCar("Tesla", "Model S", 2023, 100)
    tesla.startEngine()
    tesla.chargeBattery()

    val truck = Truck(5000)
    truck.honk()
    truck.loadGoods()

    val owner = Owner("John Doe", 35)
    println("Car Owner: ${owner.name}, Age: ${owner.age}")
}
