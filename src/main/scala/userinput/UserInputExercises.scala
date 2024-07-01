package userinput

import scala.io.StdIn

@main
def inputExe(): Unit = {
  /*println("Type your name:")
  val username = StdIn.readLine()
  println(s"Long time no see ${username}")*/

  println("Type a number:")
  val number = StdIn.readLine()
  println(s"${number.toInt * 5}")
}
