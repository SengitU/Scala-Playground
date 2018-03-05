package book

import org.scalatest._

class CountdownSpec extends FlatSpec with Matchers {
  "Countdown spec" should "print numbers until 1" in {
    Countdown.count(1) shouldEqual "1"
  }
  "Countdown spec" should "print numbers until 2" in {
    Countdown.count(2) shouldEqual "12"
  }
  "Countdown spec" should "print numbers until 3" in {
    Countdown.count(3) shouldEqual "123"
  }
  "Countdown spec" should "print numbers until 4" in {
    Countdown.count(4) shouldEqual "1234"
  }
}