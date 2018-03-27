package kata

import org.scalatest.{FlatSpec, Matchers}

class FrogSpec extends FlatSpec with Matchers {
  "crossedIndex" should "1, [1] => 1" in {
    Frog.crossedIndex(1, Array(1)) should equal(1)
  }

  "crossedIndex" should "2, [1, 1, 1, 2] => 4" in {
    Frog.crossedIndex(2, Array(1, 1, 1, 2)) should equal(4)
  }

  "crossedIndex" should "2, [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1] => -1" in {
    Frog.crossedIndex(2, Array(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)) should equal(-1)
  }
}
