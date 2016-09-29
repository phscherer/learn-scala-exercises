

package scala.learn

object Timer {
  def umPorSegundo(callback: () => Unit) {
      while (true) { 
        callback();
        Thread sleep 1000
      }
   }
   
  def oTempoPassa() {
      println("O tempo passa e o homem n�o percebe. (Dante Alighieri)")
   }
   
   def main(args: Array[String]) {
      umPorSegundo(oTempoPassa)
   }
}