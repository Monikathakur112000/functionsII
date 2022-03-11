//creating primary constructor
internal class Add(a: Int, b: Int) { // internal visibility modifier
    init {
        val c = a+b
        println(c)
    }
}

//Secondary constructor
//by default public modifier
 class Class2 {
    constructor(a: Int, b: Int) : this(a, b, 45) { // calling one constructor from another
        val c = a + b
        println(c)
    }

    constructor(a: Int, b: Int, c: Int) {
        val d = a + b + c
        println(d)
    }
}
   // if private then it cannot be accessed
   open class Class3(a: Int, b: Int, c: Int, d: Int) {
        init {
            val e = a * b * c * d
            println(e)
        }
    }
class Class4(a: Int, b: Int) : Class3(a, b, 11, 21) {
    init {
        val f = a+b
        println(f)
    }
    }
//private modifier
private class PrivateClass{
    fun new() {
        /*private*/ val a = 12
        println(a)
        println("Private modifier cannot be accessed")
    }

}

//protected visibility modifier
open class A {
    // protected variable
    protected open val int = 10
}

// derived class
class B: A() {
    override val int = 33
    fun getValue(): Int {
        // accessed from the subclass
        return int
    }
}

fun main(){
    val a = B()
    println("The value of integer is: "+ a.getValue())
Add(5,6)
    println("Secondary constructor--")
    Class2(12,345)
    Class4(12,12)
    //Class2(45,64,34)
    val q = PrivateClass()
    q.new()
}

