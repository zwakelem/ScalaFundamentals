package scopes

@main
def scopesPractice() = {
  val myBankAccount = BankAccount()
  myBankAccount.setBalance(10)
  println(myBankAccount.getCreditRating())
  println(myBankAccount.getBalance())

  myBankAccount.setBalance(30)
  println(myBankAccount.getCreditRating())
  println(myBankAccount.getBalance())
}

class BankAccount:
  private var balance = 0
  private var creditRating = 4

  def getBalance() = balance

  def setBalance(newBalance: Int) =
    if(newBalance > balance)
      creditRating += 1
    else
      creditRating -= 1
    balance = newBalance

  def getCreditRating() = creditRating
