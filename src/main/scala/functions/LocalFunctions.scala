package functions

@main
def localFunc(): Unit = {
  listAnimals()

//  listOneAnimal("dog") Error => this function is not in scope here
}

def listAnimals(): Unit =
  def listOneAnimal(animal: String): Unit = // a function defined within a function
    println(s"I have a $animal")

  val myAnimals = Set("cat", "dog", "cow")
  for(animal <- myAnimals)
    listOneAnimal(animal)
