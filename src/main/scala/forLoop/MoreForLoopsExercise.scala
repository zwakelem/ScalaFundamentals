package forLoop

import scala.io.StdIn

@main
def moreForLoopExe(): Unit = {
  /*print("What is your number =: ")
  val maxValue = StdIn.readLine().toInt

  for(x <- (0 to maxValue).reverse if x % 7 == 0)
    print(s"$x \t")
  println()*/

  for(x <- 1 to 10)
    for(y <- 1 to x)
      print("\uD83D\uDE00")
    println()
}
