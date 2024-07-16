package flowcontrol

import scala.io.StdIn

@main
def ifPractice(): Unit = {
  /*print("Do you have car keys(yes or no):")
  val carKeys = StdIn.readLine()

  if("yes".equalsIgnoreCase(carKeys))
    println("Start car")
  else
    println("Cannot start car without keys")*/


  println("")
  println(" ########################## ")
  println("")

  print("Please input the current hour (0-23)")
  val input = StdIn.readLine()

  try {
    val hour = input.toInt
    if(hour < 12)
      println(s"it's $hour AM")
    else if(hour == 12)
      println(s"it's $hour PM")
    else
      println(s"it's ${hour -12} PM")
  } catch {
    case e: NumberFormatException =>
      println("Cannot read that number")
      e.printStackTrace()
  }
}
