package kata

import org.scalatest.{FlatSpec, Matchers}

class FrogSpec extends FlatSpec with Matchers {
  "crossedIndex" should "1, [1] => 1" in {
    Frog.crossedIndex(1, Array(1)) should equal(1)
  }
}
