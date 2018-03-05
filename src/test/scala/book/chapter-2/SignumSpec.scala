package book

import org.scalatest._

class SignumSpec extends FlatSpec with Matchers {
  "Signum spec" should "return 1 for positive number" in {
    Signum.getSign(20) shouldEqual 1
  }
}