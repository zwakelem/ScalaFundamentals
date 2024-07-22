package functions

/**
 * Parameters can have default values
 * function that doesn't return anything(void in Java) is type Unit
 * return keyword can be omitted if it the last line in the function
 */
@main
def FunctionParams(): Unit = {
//  double() // can work because function defined with default value ****
  for(i <- 1 to 10)
    double(i)

  val people = List("Mark", "Didi", "Noxy", "Thuli")
  sayHello(people)

  double(3, "3 * 2 = ")
  double(7)

  val r = 6
  val area = calculateRadius(r)
  println(s"A circle of radius $r, has an area of $area")

  val clients = List("Anna", "Bob", "William")
  for(client <- clients)
    val greeting = personalisedGreeting(client)
    println(greeting)
}

//def double(number: Int): Unit = {
//  println(s"Double of $number is ${number * 2}")
//}

//def double(number: Int = 3): Unit = { // parameter with a default value ****
//  println(s"Double of $number is ${number * 2}")
//}

def double(number: Int, message: String = "message is "): Unit = {
  println(s"$message $number")
}

def sayHello(people: List[String]): Unit = {
  for(person <- people)
    println(s"Hello there $person!!")
}

//def calculateRadius(radius: Int): Double = {
//  val pi = 3.14159
//  pi * radius * radius // return keyword can be omitted
//}

// this construct (below) is used for single line functions
// does the same thing as the above function
def calculateRadius(radius: Int): Double = 3.14159 * radius * radius


def personalisedGreeting(person: String): String = {
  person(0) match
    case 'A' => s"Are you Ok $person"
    case 'W' => s"What's up $person"
    case _ => s"Hi $person"
}