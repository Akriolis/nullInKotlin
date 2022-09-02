class Duck (val height: Int? = null){
    fun quack(){
        println("Quack! Quack!")
    }
}

class MyDucks (var myDucks: Array<Duck?>){
    fun quack(){
        for (each in myDucks){
            each ?. let {
                it.quack()
            }
        }
    }

    fun totalDuckHeight(): Int{
        var h: Int = 0
        for (x in myDucks){ // x = 1 x = x + 1 x += 1
            h += x?.height ?: 0
        }
        return h
    }

}

fun main(){
    var myArray = MyDucks(arrayOf(Duck(1), Duck(2), Duck(3), null, Duck (null), Duck(5)))
    myArray.quack()
    println(myArray.totalDuckHeight())
}