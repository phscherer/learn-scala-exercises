impackage scala.learn

port scala.learn.Complex


object ComplexNumbers {
  def main(args: Array[String]) {
    val c = new Complex(1.2, 5.5)
    println(c.toString())
  }
}