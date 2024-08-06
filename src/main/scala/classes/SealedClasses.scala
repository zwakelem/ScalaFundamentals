package classes

import scala.util.Random

/**
 * Not very commonly used
 * Can only be extended in the same file
 * Abstract by default so cannot be instantiated
 * Useful in match expressions
 */

@main
def sealedClasses(): Unit = {
  val somePlant = getPlant()
  somePlant match
    case x: Fruit => println(s"$x is sweet")
    case x: Vegetable => println(s"$x is tasty")
}

sealed class Plant

sealed class Fruit extends Plant

sealed class Vegetable extends Plant

class Apple2 extends Fruit

class Potato extends Vegetable

def getPlant(): Plant =
  if(Random.nextInt(100) % 2 == 0) Apple2() else Potato()