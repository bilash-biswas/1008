import java.util.Scanner
fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var num1 = read.nextInt()
    var num2 = read.nextInt()
    var num3 = read.nextFloat()
    println("NUMBER = " + num1)
    println("SALARY = U$ %.2f".format(num2 * num3))
}
