package `class`

class Point(_x: Int, _y: Int) {
  val x: Int = _x
  val y: Int = _y
}


// クラス名の直後にコンストラクタ引数の定義がある
// val/varによってコンストラクタ引数をフィールドとして後悔する
class Point(val x: Int, val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }

  override def toString: String = "(" + x + "," + y + ")"
}

val p1 = new Point(1, 1)
val p2 = new Point(2, 2)
p1 + p2

