

package scala.learn

object TimerAnonymous {
  def umPorSegundo(callback: () => Unit) {
      while (true) { callback(); Thread sleep 1000 }
   }
  
  def main(args: Array[String]) {
    umPorSegundo { () => println("Um por segundo nessa bagaça.") }
  }
}