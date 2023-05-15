object Bob {
  def response(statement: String): String = {
    statement.trim match {
      case s if yelledQuestion(s) => "Calm down, I know what I'm doing!"
      case s if isQuestion(s) => "Sure."
      case s if isUpperLetter(s) => "Whoa, chill out!"
      case s if noWord(s) => "Fine. Be that way!"
      case _ => "Whatever."
    }
  }

  private def isUpperLetter(statement: String): Boolean = {
    val removeCharacters = statement.replaceAll("[-+.%^*@#$(:!\\s[0-9]?',]", "")

    if (removeCharacters.isEmpty) return false

    removeCharacters.map(e => e.isUpper).forall(_ == true)
  }
  private def isQuestion(statement: String): Boolean = (!isUpperLetter(statement)) && hasQuestionMark(statement)

  private def yelledQuestion(statement: String): Boolean = isUpperLetter(statement) && hasQuestionMark(statement)

  private def noWord(statement: String): Boolean = statement.isEmpty

  private def hasQuestionMark(statement: String): Boolean = statement.takeRight(1) == "?"
}
