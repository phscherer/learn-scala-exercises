package scala

import java.io._

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc;
  var y: Int = yc;
  
  // Move X e Y para novas posições.
  def move(dx: Int, dy: Int) {
    x=x+dx
    y=y+dy
    
    println("Posição atual X -> " + x)
    println("Posição atual Y -> " + y)
  }
}