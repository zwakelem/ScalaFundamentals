package functions

import scala.io.StdIn

@main
def functionExe(): Unit = {
  for(i <- 1 to 10)
    sayHello()

  for(i <- 1 to 3)
    multiplyUserInputBy17()
}

def sayHello(): Unit = {
  println("Hello everyone!!")
}

def multiplyUserInputBy17(): Unit = {
  print("Give me a number =: ")
  val number = StdIn.readLine().toInt
  println(s"Your number multiplied by 17 is ${number * 17}")
}
