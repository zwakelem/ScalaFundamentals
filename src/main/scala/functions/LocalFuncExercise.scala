package functions

@main
def localFuncExercise(): Unit = {
  userBankBalances(Map("Zwaks" -> 12.56, "Bob" -> 4.67, "Sibo" -> 6.90))
}

def userBankBalances(usersMap: Map[String, Double]): Unit = {
  def doubleADouble(number: Double): Double = number * 2

  for(user <- usersMap.keys)
    val finalBalance = doubleADouble(usersMap(user))
    println(s"User $user final balance is $finalBalance")

}
