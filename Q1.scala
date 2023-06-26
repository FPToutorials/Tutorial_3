import scala.io.StdIn.readLine

object Q1{
    def main(args: Array[String]):Unit ={
        var str = readLine();
        var strLength = str.length()
        reverse(str, strLength)
    }

    def reverse(x:String, y:Int):Int = {
        if(y == 0){
            0
        }else{
            print(x(y-1))
            reverse(x, y-1)
        }
    }
}