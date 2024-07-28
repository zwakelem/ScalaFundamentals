package constructors

@main
def initialisationPractice(): Unit = {
  val laptop = Laptop("HP", 680)
  laptop.displayInfo()
}

class Laptop(brand: String, memory: Int):

  init()

  def displayInfo() =
    println(s"this $brand laptop has $memory MB memory")

  def init() =
    println("installing Ubuntu OS")
