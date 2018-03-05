package book

object Signum {
  def getSign(x: Int) = if(x == 0) 0 else if(x > 1) 1 else -1
}