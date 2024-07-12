package collections.setsandhashsets

@main
def funcExercises(): Unit = {
  val primes = Set(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)

  val is21Prime = primes.contains(21)
  val is13Prime = primes.contains(13)
  println(s"21 is a prime number: ${is21Prime}")
  println(s"13 is a prime number: ${is13Prime}")

  println("")
  println("#########################################")
  println("")
  
  val myDrinks = Set("water", "coke", "beer", "orange juice")
  val theirDrinks = Set("water", "orange juice", "pineapple juice", "milk")
  println(s"Drink we both like ${myDrinks.intersect(theirDrinks)}")
}
