//try and catch block
fun exception(a : Int, b : Int) : Any {
    return try {
        a / b
    } catch (e: Exception) {
        println(e)
        println("Not feasible")
    }
}
fun main() {

    val obj2 =exception(11,0)
    println(obj2)
    val obj1 = exception(12,11)
    println(obj1)
    // nested try block
    // try, catch and finally block execution
    val array = arrayOf(1, 2, 3, 4, 5, 6)
    try {
        val int = array[7]
        println(int)
        for( i in array.indices)
        try {
            val n = (0..4).random()
            println(array[i+1]/n)

        } catch (e: ArithmeticException) {
            println(e)
        }

    }
    catch (e : Exception){
        println(e)
        println("Handling the exception")
    }
    finally {
        println("Executes without the catch block and always executes")
    }

    println()
    test(12,0)
    println("executes after the validation")
    println()
}
//Explicit exception by throw
fun test( a: Int, b : Int): Any{
    return if (b == 0)
        throw ArithmeticException("Should not be equal to 0")
    else
        println(a / b)
}