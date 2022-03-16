//Generic class
class Generic<T>(value :T){
    var a = value
    init{
        println(a)
    }
}


// star projection in array
fun printArray(array: Array<*>) {
    array.forEach { print(it) }
}

fun copying(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    // copying (from) array to (to) array
    for (i in from.indices)
        to[i] = from[i]
    // printing elements of array in which copied
    for (i in to.indices) {
        println(to[i])
    }
}
fun main() {
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any :Array<Any> = Array(3) { "" }
    copying(ints, any)
    Generic("Monika") //different data type can  be used
    Generic(21)
    //Covariance
    //val x: Generic<Any> = Generic<Int>()        // Error: Type mismatch
    // val z: Generic<out String> = Generic<Any>() // Error since Any is a supertype of String
    //Star projection
    val obj = arrayOf("Star"," Projection ",88)
    printArray(obj)
}