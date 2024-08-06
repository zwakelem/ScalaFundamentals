package classes

/**
 * Commonly used are created to store data
 * Primary constructor has at least one parameter
 * All primary constructor parameters are immutable
 * Can have a body but not required
 *
 * Below methods are automatically generated in a case class
 * toString(), equals() and copy()
 */
@main
def caseClasses() = {
  val user1 = User("zwaks", "zwaks@email.com", "1234")
  println(user1) // User(zwaks,zwaks@email.com,1234) => note that this isn't an memory address of an object

  val rUser = RegularUser("zwaks", "zwaks@email.com", "1234")
  println(rUser) // classes.RegularUser@246ae04d
  println()

  val u1 = User("zwaks", "zwaks@email.com", "1234")
  val u2 = User("zwaks", "zwaks@email.com", "1234")

  val r1 = RegularUser("zwaks", "zwaks@email.com", "1234")
  val r2 = RegularUser("zwaks", "zwaks@email.com", "1234")

  println(s"RegularUser equality ${r1 == r2}") // RegularUser equality false
  println(s"Case class User equality ${u1 == u2}") // Case class User equality true
  println()

  val u3 = User("zwaks", "zwaks@email.com", "1234")
  val u4 = u3.copy(email = "email@email.com")
  println(u3)
  println(u4)
}

case class User(name: String, email: String, password: String)

class RegularUser(name: String, email: String, password: String)
