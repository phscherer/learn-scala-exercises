package scala.learn

import java.io.File
import java.util.Calendar
import java.io.BufferedWriter
import java.io.FileWriter


object CreateTxtFile {
  
  private val extension = ".txt";
  
  def writeAndCreateFile(text: String) {
    val file = new File("paulo" + currentTime() + extension)
    val writter = new BufferedWriter(new FileWriter(file))
    val palavras = text.split(" ")
    
    for (palavra <- palavras) {
      palavra match {
        case "@@@" => writter.newLine()
        case _ => writter.write(palavra + " ")
      }
    }
    writter.close()
  }
  
  def currentTime(): String = {
    val output = Calendar.getInstance.getTime
    output.toString().replace(":", "-");
  }
  
  def main(args: Array[String]) {
    writeAndCreateFile("Learning Scala Code! =)")
  }
}