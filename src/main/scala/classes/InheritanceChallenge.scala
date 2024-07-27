package classes

@main
def inheritanceChallenge(): Unit = {
  val engineer = Engineer()
  engineer.name = "Engineer"
  val doctor = Doctor()
  doctor.name = "Doctor"

  engineer.study()
  engineer.work()

  doctor.work()
  doctor.study()
}

open class Job:
  var name: String = "job"
  var revenue: Int = 300
  var salary: Int = 200

  def work() =
    revenue += salary
    println(s"$name working has made revenue to be $revenue")

  def study() =
    salary += salary
    println(s"$name studying has increased my salary to $salary")

class Engineer extends Job

class Doctor extends Job

