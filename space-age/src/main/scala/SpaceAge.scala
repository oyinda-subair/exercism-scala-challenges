object SpaceAge {
  private val SecondsInEarthYear = 31557600  // (365.25 * (24/1.0)) * 3600

  def onEarth(age: Double): Double = age/SecondsInEarthYear

  def onVenus(age: Double): Double = ageOn("Venus", age)

  def onMercury(age: Double): Double = ageOn("Mercury", age)

  def onMars(age: Double): Double = ageOn("Mars", age)

  def onJupiter(age: Double): Double = ageOn("Jupiter", age)

  def onSaturn(age: Double): Double = ageOn("Saturn", age)

  def onUranus(age: Double): Double = ageOn("Uranus", age)

  def onNeptune(age: Double): Double = ageOn("Neptune", age)

  private def planetEarthPeriod(planet: String): Double = {
    planet match {
      case "Mercury" => 0.2408467
      case "Venus" => 0.61519726
      case "Mars" => 1.8808158
      case "Jupiter" => 11.862615
      case "Saturn" => 29.447498
      case "Uranus" => 84.016846
      case "Neptune" => 164.79132
      case _ => 1.0
    }
  }

  private def ageOn(planet: String, seconds: Double) =
    onEarth(seconds) / planetEarthPeriod(planet)
}
