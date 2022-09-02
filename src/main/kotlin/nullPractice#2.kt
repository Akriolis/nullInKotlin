class Cat (var name: String? = null){
    fun meow () {
        println ("Meow!")
    }
}

fun main(){
    var myCats = arrayOf(Cat("Misty"), Cat (null), Cat("Socks"))
    for (x in myCats){
        print("${x?.name}: ")
        x?.meow()
    }

}