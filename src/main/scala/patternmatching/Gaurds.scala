package patternmatching

import scala.util.Random

@main
def gaurds(): Unit = {
  val weekday = "Monday"
  val isItAm = false

  weekday match
    case "Saturday" if isItAm => println("Sleep in") // matches when its Saturday AND morning
    case "Sunday" if isItAm => println("Go to church") // matches when its Sunday AND morning
    case "Saturday" | "Sunday" if !isItAm => println("Go have fun!!") // matches when its Saturday OR Sunday AND NOT morning
    case _ => println("Go to work.") // catches everything else

  println("")
  println(" ###################################")
  println(" *** Ranges *** ")

  /*val number = Random.nextInt(20)
  number match
    case x if 0 until 10 contains number => println(s"single digit $x")
    case y if 10 until 20 contains number => println(s"double digit $y")
    case _ => println("we shouldn't get here")*/

    /*
     * x and y are local variables that contain the number that matches
     * above and below constructs are the same
     */

  val number = Random.nextInt(20)
  number match
    case x if 0 until 10 contains number => println(s"single digit $number")
    case y if 10 until 20 contains number => println(s"double digit $number")
    case _ => println("we shouldn't get here")
}
