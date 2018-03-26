package book

object MapExercises {
  def lteqgt(numbers: Array[Int], breakPoint: Int) = {
    val lesserSum = numbers filter { _ < breakPoint } reduceLeft { _ + _ }
    val biggerSum = numbers filter { _ > breakPoint } reduceLeft { _ + _ }

    (lesserSum, biggerSum, breakPoint)
  }


  def minMax(numbers: Array[Int]) = {
    val sortedNumbers = numbers.sorted
    (sortedNumbers(0), sortedNumbers(sortedNumbers.length - 1))
  }

}