import java.lang.Exception
import java.lang.NumberFormatException

// null means that the variable doesn't refer to an object, but it still exist

class Wolf{
    fun eat() {
        println("Wolf is eating")
    }
    var hunger = 10
}

fun getAlpha(): Wolf?{
    return Wolf()
}

fun main(){
    var x = null
    var w: Wolf? = Wolf() //? means it can hold references to Wolf objects AND null
    //w = null
    // array with nullable types

    var myArray: Array<String?>
    myArray = arrayOf("Hi", "Hello", null)
    println(myArray[2])
    w?.eat()
    // if (w !=null) w.eat() else println("It is null")
    // ?. is the safe call operator. It lets you safely access a nullable type's functions and properties

    // safe calls can be chained together

    // use safe calls to assign values
    var q = w?.hunger

    // possible to assign values to safe calls
    w?.hunger = 6
    println("${w?.hunger}") //result = 6

    // use keyword let with safe calls
    w?.let{
        println(it.hunger)
    }

    // ?.let allows you to run code for a value that's not null
    // you can refer to an object using keyword it

    // let with array items
    var array = arrayOf("Hi","Hello", null)
    for (x in array){
        x?.let{
            println(it) // null not added in line
        }
    }

    getAlpha()?.let {
        it.eat()
    }

    // Elvis operator has entered the building ?:
    //w.?hunger ?: -1
    // if value on the left side is not null, Elvis returns it.
    // if value on the left is null, Elvis returns the value of the right side.

    var eL = null
    var eL2 = eL ?: 2
    // it does the same thing as the code
    var eL3 = if (eL != null) eL else 5
    println(eL2)
    println(eL3)

    //non-null assertion operator !!
    // !! throwing NullPointerException if the value is null and assign the value is not
    var testTest = eL3!!
    // var testTest = eL!! will not comply
    // this gives you an opportunity to test your code

    //testException("whops") // throws NumberFormatException

    myFunction("whoops")
    myFunction("Second")


}

// catch exceptions - try and catch

fun testException (str: String){
    var x = str.toInt()
    println(x)
}

fun myFunction (str: String){
    try{
        val x = str.toInt()
        println(x)
    } catch (y: NumberFormatException){
        y.printStackTrace() //if you are struggle to find an exception
        println("Bummer")
    }
    val result = try { str.toInt()} catch (e: Exception) { null }


    println("myFunction has ended")
}

// finally keyword
// if you have important code that you want to run regardless of an exception
// finally block will run no matter what
/*fun bakeCake(){
    try{
    turnOvenOn()
    x.bake()
    } catch (e: BakingException){
    println("Baking experiment failed")
    } finally {
    turnOvenOff()
    }
 */
// if try or catch has a return statement, finally will still run

//NullPointerException - when you try to perform operations on a null value
//ClassCastException - when you try to cast an object to an incorrect type
//IllegalArgumentException - for illegal argument
//IllegalStateException - use this if some object has state that's invalid

// as? lets you perform a safe explicit cast. If the cast fails, it returns null.

// try and throw are expressions, they can have return values




