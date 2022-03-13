package `class`

class Adder {
  // 複数の引数リストを持つメソッド
  // シンタックスシュガーを組み合わせて流暢なAPIを作ったり
  // implicit parameterのために必要
  def add(x: Int)(y: Int): Int = x + y
}

var adder = new Adder()
adder.add(2)(3)

// 最初の引数だけを適用して関数を作る（部分適用）
val fun = adder.add(2) _
fun(3)

