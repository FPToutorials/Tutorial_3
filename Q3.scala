import scala.io.StdIn.readInt
object Q3{
    def main(args: Array[String]): Unit ={
        var num1 = readInt();
        var num2 = readInt();
        printf("%.2f", avg(num1, num2));
    }

    def avg(x:Int, y:Int): Double = {
        return (x+y)/2.0;
    }
}