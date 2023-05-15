object Leap {
  def leapYear(year: Int): Boolean = {
    (isDivisibleByFour(year) && !(isDivisibleByHundred(year) && !isDivisibleByFourHundred(year)))
  }

  def isDivisibleByFour(year: Int): Boolean = year % 4 == 0

  def isDivisibleByHundred(year: Int): Boolean = year % 100 == 0

  def isDivisibleByFourHundred(year: Int): Boolean = year % 400 == 0
}
