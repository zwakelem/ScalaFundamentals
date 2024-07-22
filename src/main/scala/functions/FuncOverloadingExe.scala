package functions

@main
def funcOverloadingExe(): Unit = {
  val animals = List("dog", "cat", "mouse")
  feedAnimal(animals)
  feedAnimal(animals.head)
}

def feedAnimal(animal: String): Unit = println(s"Feeding $animal")

def feedAnimal(animals: Iterable[String]): Unit =
  for(animal <- animals)
    feedAnimal(animal)
