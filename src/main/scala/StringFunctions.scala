@main
def stringFunctions(): Unit = {
  val myPet = "Crocodile"
  println(myPet.length)

  val myName = "zwaks"
  println(myName.capitalize)

  val myAnimal = "Giraffe"
  println(myAnimal.toLowerCase)
  println(myAnimal.toUpperCase)

  val myText = " with spaces "
  println(myText)
  println(myText.trim)
  println(myText(3))      // works like charAt()
  println(myText.charAt(3))
  println(myText.substring(3)) // just like Java :-)
  println(myText.trim.length) // you can chain these functions, even with immutable val
}
