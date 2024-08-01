package inheritance

@main
def InheritancePrinciple(): Unit = {
  val carol = Daughter("Zulu")
  println(carol.hairColor)
  println(carol.eyeColor)
  carol.say("Hi")
}

class Mom(nativeToungue: String): // (nativeToungue: String) is the primary constructor
  val hairColor = "brown"
  val eyeColor = "blue"
  def height = 1.6

  def say(message: String) = println(s"Mom says '$message' in $nativeToungue") // Mom says 'Hi' in Zulu

class Daughter(lang: String) extends Mom(lang): // Daughter must have same constructor, passing String to Mom
  override val hairColor: String = "blonde"
  override def height = 1.7

  override def say(message: String): Unit =
    println(s"Daughter says $message") // Daughter says Hi
    // calling say function in the super class
    super.say(message) // Mom says 'Hi' in Zulu =>
//    println(s"Mom's hair color is ${super.hairColor}") Error => cannot use super with val or var
    // but we can use it with def, and we can define variables with def
    println(s"Mom's height is ${super.height} and Daughter height is ${height}") // Mom's height is 1.6 and Daughter height is 1.7

