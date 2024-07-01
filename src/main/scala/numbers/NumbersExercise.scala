package numbers

import scala.io.StdIn

@main
def numbersExe(): Unit = {
  print("Input a number:")
  val num = StdIn.readLine()

  println(num.toByte)
  println(num.toShort)
  println(num.toInt)
  println(num.toLong)
  println(num.toFloat)
  println(num.toDouble)
}