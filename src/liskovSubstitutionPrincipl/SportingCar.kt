package liskovSubstitutionPrincipl

class SportingCar : Car() {

    override fun turnOnEnginer() {
        System.out.println("Motor do carro esportivo ligado com potência!\n")
    }

    override fun turnOffEnginer() {
        System.out.println("Motor do carro esportivo parado\n")
    }

    fun speedUpCar() {
        System.out.println("Carro esportivo acelerando...")
    }

}
