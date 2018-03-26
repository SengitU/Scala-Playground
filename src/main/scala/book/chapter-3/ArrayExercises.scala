package book

object ArrayExercises {
  def swapAdjacent(x: Array[Int]) : Array[Int] = {
    val arrLength = x.length

    if(arrLength == 1) return Array(x(arrLength - 1))
    if(arrLength == 2) return Array(x(arrLength - 1), x(0))
    if(arrLength > 2) {
      val swappedArrays: IndexedSeq[Array[Int]] = for(index <- x.indices if index % 2 == 0) yield swapAdjacent(x.slice(index, index + 2))
      val swappedArray = swappedArrays.reduceLeft(_ ++ _);

      return swappedArray
    }
    x
  }
}
