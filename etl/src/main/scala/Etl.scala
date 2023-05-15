object Etl {
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] = {
    for {
      e <- scoreMap
      s <- e._2
    } yield {
      s.toLowerCase() -> e._1
    }
//    scoreMap.flatMap(e =>  e._2.map(s => s.toLowerCase() -> e._1)).toSeq.sorted.toMap
  }
}
