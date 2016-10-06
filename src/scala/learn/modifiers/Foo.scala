object Foo {
  class Inner {
    def f() { println("Learning access modifiers"); }
    
    class InnerMost {
      f()
    }
  }
  
  def main(args: Array[String]) {
    (new Inner).f()
  }
}