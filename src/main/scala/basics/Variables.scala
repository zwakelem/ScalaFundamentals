package basics

@main
// variables
def variables(): Unit = {
  var tvShows = "many" // var is for mutable variables
  println(tvShows)
  tvShows = "too many" // variables can be re-assigned
  println(tvShows)
  //tvShows = 5 // Error!! cannot change type

  val color = "blue" // val in immutable
  //color = "red" // Error!! re-assign val variable
}