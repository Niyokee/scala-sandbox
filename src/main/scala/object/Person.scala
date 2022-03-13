package `object`

class Person(name: String, age: Int, private val weight: Int)

// コンパニオンオブジェクト
object Person {
  def printWeight(): Unit = {
    val taro = new Person("Taro", 20, 70)
    println(taro.weight)
  }
}
