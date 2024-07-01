package numbers


/**
 * numbers work the same as Java
 *
 * Byte is 8 bits in size: min -128 to 127
 * Short is 16 bits in size: min -32768 to 32767
 * Int is 32 bits in size: min -2 billion to 2 billion - default for numbers
 * Long is 64 bits in size: min -2 pow 64 to 2 pow 64
 *
 * Float 32 bits in size: 6-7 decimal digits
 * Double 64 bits in size: 15-16 decimal digits - default for decimal numbers
 *
 * Most commonly used are Int and Double
 */
@main
def numbers(): Unit = {
  val price = 34
  val items = 3
  val totalPrice = price * items
  println(totalPrice)

  val item = 5
  println(item.getClass) // int

  val item1 = 5_000_000
  println(item1.getClass) // int

  val price1 = 34.99
  println(price1.getClass) // double

  val noOfPeople = 8_000_000_000L
  println(noOfPeople.getClass) // long

  val noOfPeople1 = 8000000000L
  println(noOfPeople1.getClass) // long

  val price2 = 34.99f
  println(price2.getClass) // float

  println("##############################")
  println("##############################")
  println("##############################")

  val cats = 3
  println(cats.getClass) // int
  val dogs: Byte = 5
  println(dogs.getClass) // byte
  val days: Short = 3_000
  println(days.getClass)  // short
  val meals: Int = 3
  println(meals.getClass) // int
  val life: Long = 45
  println(life.getClass) // long
  val money: Double = 5.99
  println(money.getClass) // double
  val moreMoney: Float = 5.99
  println(moreMoney.getClass) // float

  println("##############################")
  println("##############################")
  println("##############################")

  val birds = 3
  val longBirds = birds.toLong
  println(cats.getClass) // int
  println(longBirds.getClass) // long
  // we have toByte, toShort, toInt, toLong, toFloat, toDouble

}
