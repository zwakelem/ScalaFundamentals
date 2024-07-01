@main
// String interpolation
def stringInter(): Unit = {
  val myDog = "Teddy"
  println(s"My dog's name is $myDog, he is good") // nice :)

  println(s"I have ${1+1} cats")
  println(s"I have ${5/2} cats")

  println("This is a \n new \\line")
  println(raw"This is a \n new \\line") // raw doesn't interpret anything, prints as is

  //** String exercises **//

  val catName = "My cat's name is \"Fluffy\""
  println(catName.length)

  val myCar = "My car won't start"
  println(myCar.substring(3, 6))

  val clientName = "John"
  println(s"Hello $clientName, good to see you again")

  val apples = 3
  val oranges = 6
  println(s"available fruits is ${apples + oranges}")

  val client = "Mary"
  val products = 3
  val price = 30
  println(s"Hello $client, your total amount is ${products * price}")

  //** multiline string **//
  val str1 = "This is a\nmultiline\nstring"
  println(str1)

  val str2 = """This is a
      multiline
      string
      """
  println(str2)

  val str3 = """This is a
        |multiline
        |string
        |""".stripMargin
  println(str3)
}
