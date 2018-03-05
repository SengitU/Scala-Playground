package book

object Countdown {
  def count(number: Int) : String = {
    var value = "";
    for(currentValue <- 1 to number) {
      value = value + currentValue.toString
    }
    value
    }
}