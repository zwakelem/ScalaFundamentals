package classes

/**
 * Everything is an object, Boolean, List, Integer etc
 */
@main
def oopClassesPractice(): Unit = {
  val myAnimal = Animal()
  myAnimal.run()

  myAnimal.topSpeed = 30
  myAnimal.run()
}

class Animal:
  var topSpeed: Int = 25

  def run(): Unit =
    println(s"animal is running at $topSpeed")
