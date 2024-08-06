package classes

/**
 * Nested classes are classes defined inside other classes
 *
 */
@main
def nestedClasses() = {
  val c = Car5()
  c.drive() // Exception in thread "main" java.lang.StackOverflowError
}

class Car5:
  val engine = Engine()
  var speed = 100
  def drive(): Unit =
    engine.run()
    println(s"Driving at $speed kmh")

  class Engine:
    val rpm = 300

    def run() =
      Car5.this.speed = 150
      Car5.this.drive()
      println("Engine is running")

