package expressions

@main
def ifExp(): Unit = {

  val str = if(326 / 72 * 15 +93 % 13 == 65)
    "Maths is hard"
  else
    "Maths is easy"

  // this is still crazy to me :-D
  println(str)

}
