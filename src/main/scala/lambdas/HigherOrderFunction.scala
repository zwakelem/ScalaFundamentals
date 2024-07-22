package lambdas

@main
def higherOrderFunc(): Unit = {
  val myLambda = (name: String) => println(s"Hello lambda $name")
  val names = List("Bob", "Anna", "Mark")

  sayHello4(names, myLambda)

  // both (above and below) these constructs are the same
  sayHello4(names, (name: String) => println(s"Hello lambda $name"))
}

def sayHello4(names: List[String], doSomething: String => Unit): Unit =
  for(name <- names)
    doSomething(name)
