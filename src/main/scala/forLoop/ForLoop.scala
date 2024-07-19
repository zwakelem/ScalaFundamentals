package forLoop

@main
def forLoop(): Unit = {

  val collection = List(1, 2, 3)
  for(x <- collection)
    println(x)

  val animals = List("cat", "dog", "cow")
  for(animal <- animals)
    println(s"feeding the ${animal}")

    println("")
    println(" ####################################### ")
    println(" **** more for loops **** ")
    println("")

  for(i <- 1 to 12)
    val month = i match
      case 1 => "Jan"
      case 2 => "Feb"
      case 3 => "Mar"
      case 4 => "Apr"
      case 5 => "May"
      case 6 => "Jun"
      case 7 => "Jul"
      case 8 => "Aug"
      case 9 => "Sep"
      case 10 => "Oct"
      case 11 => "Nov"
      case 12 => "Dec"
      case _ => ""
    println(s"Month #$i is called $month")
}
