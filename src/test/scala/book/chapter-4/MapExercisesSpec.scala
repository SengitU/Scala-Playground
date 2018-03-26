package book

import org.scalatest.{FlatSpec, Matchers}

class MapExercisesSpec extends FlatSpec with Matchers {
  "minmax" should "[1, 2, 3, 4, 5] => (1, 2)" in {
    MapExercises.minMax(Array(1, 2, 3, 4, 5)) should equal (1, 5)
  }

  "lteqgt" should "[1, 2,3 ,4, 5], 3 => (3, 9, 3)" in {
    MapExercises.lteqgt(Array(1, 2,3 ,4, 5), 3) should equal (3, 9, 3)
  }

}
