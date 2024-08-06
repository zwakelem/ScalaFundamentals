package traits

/**
 * like Java, a class can extend(implement) more than one trait
 * Traits also inherit from each other
 */
@main
def moreTraits(): Unit = {
  val myCouch = Couch()
  myCouch.sit()
  myCouch.sleep()
  println()

  val myDog = Labrador()
  myDog.moveAround()
  myDog.liveBirth()
  myDog.beCute()
}

trait PlaceToSit:
  def sit():Unit

trait PlaceToSleep:
  def sleep():Unit

class Couch extends PlaceToSleep, PlaceToSit:
  override def sit(): Unit = println("Sitting on a couch")

  override def sleep(): Unit = println("Sleeping on a couch")

trait Animal:
  def moveAround(): Unit

trait Mammal extends Animal:
  def liveBirth(): Unit

trait Dog extends Mammal:
  def beCute(): Unit

class Labrador extends Dog:
  override def moveAround(): Unit = println("Labrador moving around!!")

  override def liveBirth(): Unit = println("Labrador giving birth")

  override def beCute(): Unit = println("Labrador being cute")


