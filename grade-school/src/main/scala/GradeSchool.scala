class School {
  type DB = Map[Int, Seq[String]]
  private var database: DB = Map[Int, Seq[String]]()

  def add(name: String, g: Int): Unit = {

    val students = db.getOrElse(g, Seq())

    database += (g -> (students :+ name))
  }

  def db: DB = database

  def grade(g: Int): Seq[String] = db.getOrElse(g, Seq())

  def sorted: DB = {
    db.map {
      case (key, value) => key -> value.sorted
    }.toSeq.sortBy(_._1).toMap
  }
}

