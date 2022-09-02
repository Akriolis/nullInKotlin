// Few practice lines of code on the topic "Data structure fundamentals"

fun main(){
    var x = arrayOf(1,2,3)
    var y = arrayOf("Biba","Buba","Bibip")
    var v = arrayOf(1,2,3)
    var myArray = arrayOf(x,y,v)

    println("${myArray[1].component2()}")

    var myList = mutableListOf(1,2,3)
    myList.add(0,4)
    var plainInt: Int = 5
    myList.add(4,plainInt)
    myList[4] = 4
    println(myList)
    myList.remove(2)
    myList.removeAt(2)
    println(myList)

    var u = myList.get(1)
    var u2 = myList[1]
    if (u == u2){
        println("Equal")
    } else{
        println("Not equal")
    }

    myList.set(1,10) // equal to mylist[1] = 10
    println(myList)
    val f = myList.toIntArray()

    val x1 = 1
    val y1 = 2
    val z1 = 3
    val myMap = mapOf("first" to x1, "second" to y1, "third" to z1)
    println(myMap.containsKey("first"))
    println(myMap.containsKey("dsasa"))
    println(myMap.containsValue(1))
    println(myMap.containsValue(10))

    var testMyMap = myMap.getValue("first")
    println(testMyMap)
    println(myMap.keys)
}