package car

class Car(
    // properties + constructor
    val country: String,
    val brandName: String,
    var year: Int,
) {
    // properties
    var distanceRun: Int = 0

    // methods/functions
    fun runDistance(kilometers: Int) {
        println("Car is running for $kilometers km")
        this.distanceRun = this.distanceRun + kilometers
    }
}