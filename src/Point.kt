import kotlin.math.sqrt
import kotlin.math.pow
class Point (val x: Double, val y: Double) {
    fun distancePoint(other: Point): Double {
        return sqrt((x - other.x).pow(2) + (y - other.y).pow(2))
    }

}