
package scala.learn

import java.util.{Date, Locale}
import java.text.DateFormat._
import java.text.SimpleDateFormat

object DateFormat {
  def main(args: Array[String]) {
    val dataAtual = new Date
    val df = getDateInstance(LONG, Locale.CANADA)
    val dfBr = new SimpleDateFormat("dd/MM/yyyy")
    println(dfBr format dataAtual)
  }
}