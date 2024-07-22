package lambdas

@main
def higherOrderFuncExercise(): Unit = {
  val numbers = Array[Double](2, 3, 5, 7, 9, 68, 34, 23)
  println(numbers.toList)
  val newNumbers = hoFunc(numbers, (number: Double) => number / 10)
  println(newNumbers.toList)
}

def hoFunc(numbers: Array[Double], lambdaFunc: Double => Double): Array[Double] =
  for(i <- numbers.indices)
    if(numbers(i) % 2 == 0)
      numbers(i) = lambdaFunc(numbers(i))
  numbers

