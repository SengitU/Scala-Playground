package kata

// Detailed Kata Explanation https://github.com/pinarkaymaz6/FrogRiverOne

object Frog {
  def crossedIndex(distance: Int, leaves: Array[Int]): Int = {
    var temp = -1
    for(number <- 1 to distance) {
      val indexOfNumber = leaves.indexOf(number)
      if(indexOfNumber == -1) return -1
      if(indexOfNumber > temp) temp = indexOfNumber + 1
    }
    temp
  }
}
