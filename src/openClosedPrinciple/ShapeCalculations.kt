package openClosedPrinciple

class ShapeCalculations {
    fun calculateTotalArea(shapes: List<Shape>): Double {
        var totalArea = 0.0
        for (shape in shapes) {
            totalArea += shape.calculateArea()
        }
        return totalArea
    }
}