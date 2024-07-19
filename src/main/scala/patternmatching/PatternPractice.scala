package patternmatching

import scala.io.StdIn

@main
def patternPractice(): Unit = {
  print("How many meals do you have a day := ")
  var numOfMeals = StdIn.readLine().toInt

  if(numOfMeals < 0)
    numOfMeals *= -1

  numOfMeals match
    case x if 1 until 3 contains numOfMeals => println("increase the number of meals")
    case 3 => println("Perfect!!")
    case y if !(1 until 3 contains numOfMeals) => println("Decrease your meals fatso!!")
}
