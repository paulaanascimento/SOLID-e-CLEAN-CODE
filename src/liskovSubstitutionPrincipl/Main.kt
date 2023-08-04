package liskovSubstitutionPrincipl

fun main() {
    val normalCar = Car()
    val fasterCar : Car = SportingCar()

    normalCar.turnOnEnginer()
    fasterCar.turnOnEnginer()

    normalCar.turnOffEnginer()
    fasterCar.turnOffEnginer()

    if (fasterCar is SportingCar) {
        (fasterCar as SportingCar).speedUpCar()
    }

}