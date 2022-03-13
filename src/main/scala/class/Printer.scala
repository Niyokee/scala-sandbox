package `class`

class APrinter {
  def print(): Unit = {
    println("A")
  }
}

class BPrinter extends APrinter {
  override def print(): Unit = {
    println("B")
  }
}
