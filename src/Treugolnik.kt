//import kotlin.math.sqrt
import kotlin.math.pow
class Treugolnik (val point1: Point,val point2: Point,val point3: Point) {

   // val a: Double = point2.distancePoint(point3)
   // val b: Double = point1.distancePoint(point3)
    //val c: Double = point1.distancePoint(point2)

        //fun area(): Double {
       // val s = (a + b + c) / 2
       // return sqrt(s * (s - a) * (s - b) * (s - c))
   // }

    fun centerOkr(): Point {
        val d = 2 * (point1.x * (point2.y - point3.y) + point2.x * (point3.y - point1.y) + point3.x * (point1.y - point2.y))
        val deltaX = ((point1.x.pow(2) + point1.y.pow(2)) * (point2.y - point3.y) + (point2.x.pow(2) + point2.y.pow(2)) * (point3.y - point1.y) + (point3.x.pow(2) + point3.y.pow(2)) * (point1.y - point2.y)) / d
        val deltaY = ((point1.x.pow(2) + point1.y.pow(2)) * (point3.x - point2.x) + (point2.x.pow(2) + point2.y.pow(2)) * (point1.x - point3.x) + (point3.x.pow(2) + point3.y.pow(2)) * (point2.x - point1.x)) / d
        return Point(deltaX, deltaY)
    }

}