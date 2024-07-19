package patternmatching

import scala.io.StdIn

@main
def patternPractice2(): Unit = {
  print("What is your name =: ")
  val name = StdIn.readLine()

  /*name match
    case x if 'a' to 'c' contains name.charAt(0) => println(s"you fall into a to c category $x")
    case y if 'd' to 'h' contains name.charAt(0) => println(s"you fall into d to h category $y")
    case _ => println("You are not important :-)")*/

  name(0).toUpper match
    case 'A' | 'B' | 'C' => println(s"Hello $name, welcome!!")
    case x if 'D' to 'H' contains name(0).toUpper => println(s"Hi $name hoe are you!!")
    case _ => println(s"Hi $name")
}
