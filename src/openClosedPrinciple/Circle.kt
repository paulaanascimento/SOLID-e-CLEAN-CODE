package openClosedPrinciple

import kotlin.math.PI

class Circle(private val radius: Double) : Shape {
    override fun calculateArea(): Double {
        return PI * radius * radius
    }
}