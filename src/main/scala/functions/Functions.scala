package functions

@main
def functions(): Unit = {
  for(i <- 1 to 10)
    sayHello2()

  var i = 5
  while(i > 0)
    printAlphabet()
    i -= 1
}

def sayHello2(): Unit = {
  println("Hello everyone!!")
}

def printAlphabet(): Unit = {
  println("a, b, c, d, e, ....")
}
