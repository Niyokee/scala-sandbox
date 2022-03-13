package `class`

abstract class Shape {
  def area: Double
}
class Rectangle(val width: Double, val height: Double) extends Shape {
  override def area: Double = width * height
}
class Circle(val radius: Double) extends Shape {
  override def area: Double = radius * radius * math.Pi
}