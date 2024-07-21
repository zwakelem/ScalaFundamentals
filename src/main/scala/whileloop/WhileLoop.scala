package whileloop

@main
def whileLoop(): Unit = {

  val puzzlePieces = 20
  var piecesPlaced = 0
  while(piecesPlaced < puzzlePieces)
    piecesPlaced += 1
    println(s"Place piece #$piecesPlaced")
  println("\nPuzzle complete!!")
}
