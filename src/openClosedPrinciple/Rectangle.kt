package openClosedPrinciple

class Rectangle(private val height: Double, private val width: Double) : Shape {
    override fun calculateArea(): Double {
        return height * width
    }
}