package inheritance

@main
def inheritancePractice(): Unit = {
  val bird = Bird("yellow", 30)
  val parakeet = Parakeet("brown", 40)

  bird.fly()
  parakeet.fly()

  println(s"the average speed of birds is ${(parakeet.getFlightSpeed() + bird.getFlightSpeed()) / 2}")

}

class Bird(color: String, flightSpeed: Int):

  def fly() = println(s"That $color bird flies at $flightSpeed km/h")

  def getFlightSpeed() =
    flightSpeed

class Parakeet(color: String, flightSpeed: Int) extends Bird(color, flightSpeed):

  override def fly(): Unit =
    println(s"$color parakeet flying at $flightSpeed km/h")


