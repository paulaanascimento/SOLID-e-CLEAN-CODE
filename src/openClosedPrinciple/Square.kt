package openClosedPrinciple

class Square(private val side: Double): Shape {
    override fun calculateArea(): Double {
        return side * side
    }
}