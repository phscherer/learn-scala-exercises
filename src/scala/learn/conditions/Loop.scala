object Loop {
  def main(args: Array[String]): Unit = {
    var loop = 10;
    
    while (loop >= 5) {
      println("Finalizar loop em... " + (loop-5))
      loop -= 1
    }
    
    for (i<-10 to 1 by -1; j <- i to 1 by -1) {
      println("Foo! Bar! -> " + i)
    }  
  }
}