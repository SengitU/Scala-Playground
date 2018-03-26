package book

import org.scalatest.{FlatSpec, Matchers}

class ArrayExercisesSpec extends FlatSpec with Matchers {
  "Swap adjacent" should "[1] => [1]" in {
    ArrayExercises.swapAdjacent(Array(1)) shouldEqual Array(1)
  }

  "Swap adjacent" should "[1, 2] => [2, 1]" in {
    ArrayExercises.swapAdjacent(Array(1, 2)) shouldEqual Array(2, 1)
  }

  "Swap adjacent" should "[1, 2, 3] => [2, 1, 3]" in {
    ArrayExercises.swapAdjacent(Array(1, 2, 3)) shouldEqual Array(2, 1, 3)
  }

  "Swap adjacent" should "[1, 2, 3, 4] => [2, 1, 3, 4]" in {
    ArrayExercises.swapAdjacent(Array(1, 2, 3, 4)) shouldEqual Array(2, 1, 4, 3)
  }

  "Swap adjacent" should "[1, 2, 3, 4, 5] => [2, 1, 4, 3, 5]" in {
    ArrayExercises.swapAdjacent(Array(1, 2, 3, 4, 5)) shouldEqual Array(2, 1, 4, 3, 5)
  }

  "Swap adjacent" should "[1, 2, 3, 4, 5, 6, 7 , 8, 9, 10, 11] => [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 11]" in {
    ArrayExercises.swapAdjacent(Array(1, 2, 3, 4, 5, 6, 7 , 8, 9, 10, 11)) shouldEqual Array(2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 11)
  }
}
