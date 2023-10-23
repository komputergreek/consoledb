package car

fun main() {
    val bmwCar = Car(
        country = "Germany",
        year = 2017,
        brandName = "bmw"
    )
    val mercedesCar = Car(
        country = "Germany",
        year = 2020,
        brandName = "mercedes"
    )

    println(bmwCar.distanceRun)
    bmwCar.runDistance(30)
    println(bmwCar.distanceRun)

    println("-----")

    println(mercedesCar.distanceRun)
    mercedesCar.runDistance(120)
    println(mercedesCar.distanceRun)
}