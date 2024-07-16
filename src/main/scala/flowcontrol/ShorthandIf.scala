package flowcontrol

import scala.io.StdIn

/**
 * if can return a value in Scala
 */
@main
def shorthandIf(): Unit = {
  print("Please enter a number: ")
  val number = StdIn.readLine().toInt
  var isEven: String = null

  // construct 1
  if(number % 2 == 0)
    isEven = "Number is even"
  else
    isEven = "Number is odd"

  // construct 2
  if(number % 2 == 0) isEven = "Number is even" else isEven = "Number is odd"

  // construct 3
  isEven = if(number % 2 == 0) "Number is even" else "Number is odd"

  // construct 4
  isEven = if(number % 2 == 0)
    println("true value")
    "Number is even"
  else
    println("false value")
    "Number is odd"

  // all the above constructs do the same thing
  println(isEven)
}
