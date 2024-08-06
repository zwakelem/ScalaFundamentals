package classes

@main
def enumClasses(): Unit = {
  println(Color.RED) // RED

  decide(Color.BLUE) // You chose blue
  decide(Color.GREEN) // You chose green

  println(Color.valueOf("RED")) // RED
  println(Color.GREEN.ordinal) // 1 => GREEN is index 1 on the enum
  println(Color.values.toList) // List(RED, GREEN, BLUE)
  println(Color.fromOrdinal(2)) // BLUE
}

enum Color:
  case RED
  case GREEN
  case BLUE

def decide(color: Color) =
  color match
    case Color.RED => println("You chose red")
    case Color.BLUE => println("You chose blue")
    case Color.GREEN => println("You chose green")

