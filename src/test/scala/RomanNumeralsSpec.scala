import org.scalatest._

class RomanNumeralsSpec extends WordSpec with MustMatchers {

  "converter" must {

    "return '1' when given the letter I" in {
      RomanNumerals.converter("I") mustEqual 1
    }

    "Return '10' when given the letter X" in {
      RomanNumerals.converter("X") mustEqual 10
    }

  }

}
