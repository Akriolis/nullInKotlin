import java.lang.Exception

class BadException: Exception()

fun myFunction2 (test: String){
    try{
        print("t")
        riskyCode(test)
    } catch (e: BadException){
        print("a")

    } finally {
        print("w")

    }
    print("s")
}

fun riskyCode (test: String){
    print("h")
    if (test == "Yes"){
        throw BadException()
    }
    print("r")
    print("o")
}

fun main(){
    myFunction2("No")

}