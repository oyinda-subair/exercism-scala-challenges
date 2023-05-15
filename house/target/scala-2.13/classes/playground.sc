
List("This is the malt", " that lay in the house that Jack built.")(1)

for(v <- 4 to 8) {
  println(v)
}

val l = (4 to 4).toList.map{ v => s"$v"}.mkString("\n")

(10 to 2 by -1).toList

def verseTwo = {
  List("This is the malt ", "that lay in the house that Jack built.")
}

def verseThree: String = {
  val l = List("This is the rat ", "that ate the malt ")
  val v2 = verseTwo.last
  (l :+ v2).mkString
}
println(s"$verseThree")