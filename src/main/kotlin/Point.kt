package point
import kotlin.math.sqrt

data class Point(var x: Double, var y: Double) {

    fun moveX(dx: Double) {
        x += dx
    }

    fun moveY(dy: Double) {
        y += dy
    }

    fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }

    fun distance(): Double {
        return sqrt(x * x + y * y)
    }

    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun times(other: Point): Point {
        return Point(x * other.x, y * other.y)
    }

    operator fun times(factor: Double): Point {
        return Point(x * factor, y * factor)
    }
}

