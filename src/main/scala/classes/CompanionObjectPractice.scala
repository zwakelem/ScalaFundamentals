package classes

@main
def companionObjPtactice(): Unit = {
  ScalaCourse.getCourseMetaInfo()
  println()

  val course = ScalaCourse()
  course.getCourseInfo()
}

class ScalaCourse:
  import ScalaCourse.*

  def getCourseInfo() =
    println("Scala is a JVM language")
    getCourseMetaInfo()

object ScalaCourse:
  def getCourseMetaInfo() = println("Scala is easy")
