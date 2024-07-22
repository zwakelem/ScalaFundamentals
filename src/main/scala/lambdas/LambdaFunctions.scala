package lambdas

/**
 * Lambdas are functions with no name (anonymous functions)
 * they can be assigned to a variable
 */
@main
def lambdaFuncs(): Unit = {
  val myLambda = (name: String) => println(s"Hello lambda $name")
  myLambda("Zwaks")
}