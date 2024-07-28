package scopes

/**
 * By default the access modifier is public
 * private means methods and variables are only accessible from inside the class
 */
@main
def classScope() = {
  val myObject = MyClass()

  /*
  println(myObject.myClassVariable)
  myObject.myMethod()
  myObject.MyInnerClass().myInnerMethod()*/

  var myCar = Car()
  myCar.setSpeed(120)
  println(myCar.getSpeed())
}

class MyClass:
  private val myClassVariable = 5

  private def myMethod() = println(s"myMethod called myClassVariable = $myClassVariable")

  private class MyInnerClass:
    def myInnerMethod() = println("myInnerMethod called")

class Car:
  var speed: Int = 20

  def setSpeed(speed: Int) = this.speed = speed

  def getSpeed() = speed
