package operatorsandbooleans

/**
 * The result type of an operation is the same as the largest operand
 * in terms of size in memory
 *
 * Byte < Short < Int < Long < Float < Double
 */

@main
def operators(): Unit = {

  val a: Long = 8784211
  val b: Float = 12.55f
  val r = a / b

  println(r)
  println(r.getClass) // float

  println("***********************")

  val username = "Lucy"
  val greeting = s"Hello, $username"
  println(greeting) // Hello, Lucy

  println("***********************")

  val products = 3
  val price = 9.99
  val total = s"Your total is $$${products * price}"
  val total1 = s"Your total is ${products * price}"
  println(total) // Your total is $29.97
  println(total1) // Your total is 29.97

}
