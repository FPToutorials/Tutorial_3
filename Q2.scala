object Q2{ 
    def main(args: Array[String]): Unit = {
        var lst: List[String] = List("Apples", "Dog", "CowBoy", "Kavisha", "Nelu");
        //Here I input a List called lst.
        stringList(lst)
    }

    def stringList(lst:List[String]) = {
        var new_lst: List[String] = List();
        
        var i = 0;
        for(i <- 0 until lst.length){
            if((lst.apply(i)).length() >= 5 ){
                new_lst = new_lst :+ lst.apply(i);
            }
        }
        println(new_lst)
    }
}

//:+ is the appending operator
//:: is the prepending operator
