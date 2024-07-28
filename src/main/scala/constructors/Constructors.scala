package constructors

@main
def constructors(): Unit = {
  val c1 = Car("BMW", 240)
  c1.show() // Car BMW has topspeed of 240

  val c2 = Car("Audi")
  c2.show() // Car Audi has topspeed of 200

  val c3 = Car(120)
  c3.show() // Car no model has topspeed of 120

  val t1 = Table()
  t1.display() // The table has 4 legs, and height of 20

  val t2 = Table(50)
  t2.display() //The table has 4 legs, and height of 50

  val t3 = Table(6, 10)
  t3.display() // The table has 6 legs, and height of 10
}

/*
 * variable initialised inside constructor are available inside the body of the class
 *
 * Classes can have multiple constructors, like Java
 * Car(brand: String, topspeed: Int) is the primary constructor for this class
 * so all the other constructors must call it
 */
class Car(brand: String, topspeed: Int):
  
  def this(brand: String) =
    this(brand, 200) // if we have a secondary constructor, we must call the primary constructor

  def this(topspeed: Int) =
    this("no model", topspeed) // also calling the primary constructor

  def this() =
    this("no model", 200) // also calling the primary constructor

  def show() =
    println(s"Car $brand has topspeed of $topspeed")

class Table(legs: Int, height: Int):

  def this() =
    this(4, 20)

  def this(height: Int) =
    this(4, height)

  def display() =
    println(s"The table has $legs legs, and height of $height")