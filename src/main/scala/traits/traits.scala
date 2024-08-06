package traits

/**
 * Traits are similar to Interfaces in Java
 * They define functionality that a class has or implements
 *
 */
@main
def traits(): Unit = {
  val myOven: Oven = getOven()
  println(myOven)
  myOven.turnOn()
  myOven.cook(100)
  myOven.turnOff()
}

trait Oven:
  val temperature: Int

  def turnOn(): Unit
  def turnOff(): Unit

  // implemented method in a trait, possible
  def cook(temp: Int) =
    println(s"Cooking at $temp degrees")

class LgOver extends Oven:
  override val temperature: Int = 180

  // the override keyword in optional
  override def turnOn(): Unit = println("LG oven turned on")

  def turnOff(): Unit = println("LG oven turned off")

  // u can even override the implemented function
  override def cook(temp: Int): Unit = println("LG oven cooking")

def getOven(): Oven = new LgOver()


