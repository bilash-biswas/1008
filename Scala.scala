object Main {
  def main(args:Array[String]){
    var a = scala.io.StdIn.readInt()
    var b = scala.io.StdIn.readInt()
    var c = scala.io.StdIn.readDouble()

    println("NUMBER = " + a)
    println("SALARY = U$ %.2f".format(b * c))
  }
}
