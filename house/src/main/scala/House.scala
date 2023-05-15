object House {
  def recite(verse: Int, to: Int): String = {
    val lyric = getLyrics(verse, to)
    s"""$lyric
       |
       |""".stripMargin
  }

  def getLyrics(verse: Int, to: Int): String = {
    (verse to to).map{ v => s"${getFullAllLyrics(v)}"}.mkString("\n")
  }

  def getFullAllLyrics(verse: Int): String = {
    if(verse > 2) {
      val lyrics = verseTypeV2(verse)
      val lastLines = (verse - 1 to 2 by -1).map{ v => verseTypeV2(v).last}.mkString(" ")
      (lyrics :+ lastLines).mkString(" ")
    } else {
      verseTypeV2(verse).mkString(" ")
    }
  }

  def verseTypeV2(verse: Int): List[String] =
    verse match {
      case 1 => VerseLines.verseOne
      case 2 => VerseLines.verseTwo
      case 3 => VerseLines.verseThree
      case 4 => VerseLines.verseFour
      case 5 => VerseLines.verseFive
      case 6 => VerseLines.verseSix
      case 7 => VerseLines.verseSeven
      case 8 => VerseLines.verseEight
      case 9 => VerseLines.verseNine
      case 10 => VerseLines.verseTen
      case 11 => VerseLines.verseEleven
      case 12 => VerseLines.verseTwelve
    }

  /**
   * The first two lines of each verse is unique to the verse
   * The other lines of the verse are the last lines
   * of the verses before it in descending order to verse 2
   */
  object VerseLines {
    val verseOne = List("This is the house that Jack built.")
    val verseTwo = List("This is the malt", "that lay in the house that Jack built.")
    val verseThree =  List("This is the rat", "that ate the malt")
    val verseFour = List("This is the cat", "that killed the rat")
    val verseFive = List("This is the dog", "that worried the cat")
    val verseSix = List("This is the cow with the crumpled horn", "that tossed the dog")
    val verseSeven = List("This is the maiden all forlorn", "that milked the cow with the crumpled horn")
    val verseEight = List("This is the man all tattered and torn", "that kissed the maiden all forlorn")
    val verseNine = List("This is the priest all shaven and shorn", "that married the man all tattered and torn")
    val verseTen = List("This is the rooster that crowed in the morn", "that woke the priest all shaven and shorn")
    val verseEleven = List("This is the farmer sowing his corn", "that kept the rooster that crowed in the morn")
    val verseTwelve = List("This is the horse and the hound and the horn", "that belonged to the farmer sowing his corn")
  }
}