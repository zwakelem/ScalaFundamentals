package expressions

import scala.io.StdIn

@main
def rangeExe(): Unit = {

  val r = 0 to 1000 by 17
  println(r.toList)
  println(r.length)

  print("How many cats do you have =:")
  val numOfCats = StdIn.readLine().toInt

  /*val message = if(Range.inclusive(1,3).contains(numOfCats))
    "few cats"
  else if(Range.inclusive(4,6).contains(numOfCats))
    "several cats"
  else
    "many cats"*/

  // these 2 constructs (above and below) are the same :-D

  val message = if(1 to 3 contains numOfCats)
    "few cats"
  else if(4 to 6 contains numOfCats)
    "several cats"
  else
    "many cats"

  println(message)
}
