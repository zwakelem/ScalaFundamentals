package constructors

@main
def initialisation(): Unit = {
  val car = Car2("Ferrari", 350)
}

/*
  println(s"Brand $brand has topspeed $topspeed")
  canFly()

  the above lines will executed after the object is created
 */
class Car2(brand: String, topspeed: Int):
  println(s"Brand $brand has topspeed $topspeed")
  canFly()

  def canFly() =
    if(topspeed > 300)
      println("this car can fly")

