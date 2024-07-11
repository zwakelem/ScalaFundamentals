package exceptions

import scala.io.StdIn

@main
def exceptionHandle(): Unit = {
  print("Input number: ")
  val input = StdIn.readLine()

//  throw IllegalStateException("I don't like this")
  try {
    val number = input.toInt
  } catch {
    case f: NumberFormatException => {
      println("Number Format Exception occurred")
      f.printStackTrace()
    }
    case e: Exception => {
      println("Exception occured")
    }
  } finally {
    println("Finally free up resources")
  }
  println("Continuing execution")
}
