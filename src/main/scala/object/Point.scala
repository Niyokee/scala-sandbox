package `object`

// ユーティリティメソッドやグローバルな状態の置き場所
// 同盟クラスのオブジェクトのファクトリメソッド
class Point(val x: Int, val y: Int)

// ファクトリメソッド
// applyメソッドはScala処理系に特別に扱われる
// クラスの実装の詳細を内部に隠しておける
// Pointではなくそのサブクラスのインスタンスを返すことができる
object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}

// ケースクラスを用いて簡単にかける
case class Point(x: Int, y: Int)
