package classes

@main
def oopClasses() = {
  val myCar = Car()
  val yourCar = Car()

  println(myCar)
  println(yourCar)
  println()

  myCar.brand = "BMW"
  yourCar.brand = "Audi"

  println(myCar.brand)
  println(yourCar.brand)
  println()

  myCar.start()
  myCar.drive(34)
  println()

  yourCar.start()
  yourCar.drive(80)
}

class Car:
  var brand: String = "Toyota"
  var topSpeed = 100

  def start() =
    println(s"Starting the $brand")

  def drive(speed: Int) =
    println(s"Driving at speed of $speed")
