package functions

@main
def repeatedParams(): Unit = {
  sayHello3("Zwaks", "Sanda", "Sibo")
  sayHello3("Simphy")

  val users = List("John", "Bob", "Mark")
//  sayHello3(users) Error cannot use List
  sayHello3(users:_*) // but we can use the splat operator

  // these 2 constructs are the same
  
  sayHello3(users*) // latest syntax for splat operator
}

def sayHello3(person: String*): Unit = { // varargs parameter in Java
  for(p <- person)
    println(s"Hello there $p")
}
