object RomanNumerals {

  def converter(numeral : String): Int = {
    numeral match {
      case "I" => 1
      case "X" => 10
    }
  }
}
