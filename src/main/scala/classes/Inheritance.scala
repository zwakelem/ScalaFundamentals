package classes

@main
def inheritance(): Unit = {
  val myDog = Corgi()
  val dog2: Dog = Corgi()

  println(myDog.size)
  myDog.play()
  myDog.bark()

  println(dog2.size)
  dog2.play()
  dog2.bark()
}

// keyword "open" means this class is inheritable, not final is Java terms
open class Dog:
  var size: Int = 0

  def bark() =
    println("Bark ...")

  def play() =
    println("Play ...")

class Corgi extends Dog

