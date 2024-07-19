package patternmatching

import scala.io.StdIn
import scala.util.Random

@main
def patternMatching(): Unit = {
  /*print("Type an animal =: ")
  val input = StdIn.readLine()

  var action = ""
  input match
    case "dog" => action = "pet it"
    case "cat" => action = "feed it"
    case "crocodile" => action = "ran away"
    case _ => action = "google it"*/

  // below construct is the same as above!!
  // match can return a value

  /*val action = input match
    case "dog" | "rabbit" | "hamster" => "pet it" // or matches any stated options
    case "cat" => "feed it"
    case "crocodile" => "ran away"
    case _ => "google it"

  println(s"When you see a $input, you $action")*/

  println("")
  println(" ###################################")
  println("")

  val number = Random.nextInt(100)
  println(s"number is $number")

  number % 2 match
    case 0 => println("number is even")
    case 1 => println("number is odd")
    // note that case _ is optional

  println("")
  println(" ###################################")
  println(" *** Lists *** ")

  // we can match Lists as well
  val numbers = List(1, 2, 3)
  numbers match
    case List(1, 2, 3) => println("single digits")
    case List(10, 11, 12) => println("double digits")
    case _ => println("unknown")

  println("")
  println(" ###################################")
  println(" *** Tuples *** ")

  val animalFeed = ("cat", "cat food")
  animalFeed match
    case ("cat", _) => println("cat info")
    case ("dog", _) => println("dog info")
    case _ => println("random tuple")

}
