class Complex(real: Double, imaginario: Double) {
  def re = real
  def im = imaginario
  override def toString() = "" + re + (if (im < 0) "" else "+") + im + "i"
}