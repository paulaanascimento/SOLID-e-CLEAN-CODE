package liskovSubstitutionPrincipl

open class Car {
   open fun turnOnEnginer() {
        System.out.println("Motor do carro ligado")
    }
    open fun turnOffEnginer() {
        System.out.println("Motor do carro parado")
    }
}

