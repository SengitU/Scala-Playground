package book

import org.scalatest._

class SignumSpec extends FlatSpec with Matchers {
  "Signum spec" should "return 1 for positive number" in {
    Signum.getSign(20) shouldEqual 1
  }

  "Signum spec" should "return -1 for negative number" in {
    Signum.getSign(-20) shouldEqual -1
  }

  "Signum spec" should "return 0 for 0" in {
    Signum.getSign(0) shouldEqual 0
  }
}