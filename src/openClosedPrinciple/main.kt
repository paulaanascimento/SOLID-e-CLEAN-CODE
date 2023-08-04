package openClosedPrinciple

fun main() {
    val rectangle1 = Rectangle(10.0, 5.0)
    val circle1 = Circle(10.0)
    val square1 = Square(5.0)

    val shapeCalculations = ShapeCalculations()
    val shapes = listOf(rectangle1, circle1, square1)

    val totalArea = shapeCalculations.calculateTotalArea(shapes)
    println("Total area: $totalArea")
}