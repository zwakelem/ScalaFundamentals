package functions

@main
def funcOverloading(): Unit = {
  println(multiply(7))
  println(multiply(7, 3))

  val people = List("Anna", "Bob", "Noxy")
  helloFunc(people(1))
  helloFunc(people)
}

def multiply(number: Int) = number * 2

def multiply(number: Int, multipier: Int) = number * multipier

def helloFunc(person: String): Unit = println(s"Hello $person")

def helloFunc(people: Iterable[String]): Unit =
  for(person <- people)
    println(s"Hi there $person")
