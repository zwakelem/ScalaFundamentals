package userinput

import scala.io.StdIn
import java.util.List
import scala.util.Random

@main
def userInput(): Unit = {
  /*println("Type something:")
  val input = StdIn.readLine()
  println(input)

  val number = input.toInt
  println(number * 2)*/

  println(Random.nextInt()) // from -2 billion to + 2 billion something => 1817574790
  println(Random.nextInt(100)) // limit to less than 100 => 43
  println(Random.nextString(20)) // likely to give you Chinese characters => 픜⏄黤䪎溼■ꦭ慕斧읪⬘䅓寠씓㧄ǘ吩轲잮錠
  println(Random.nextPrintableChar()) // prints random chars => F
  println(Iterator.continually(Random.nextPrintableChar()).take(20).mkString) // print 20 random chars => `Y.e{{&o)+r^&H>&^\Gk


}
