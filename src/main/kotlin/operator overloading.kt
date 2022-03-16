//Operator overloading
class Overloading(var a : String){
//For Increment
    operator fun inc(): Overloading{
        val b = Overloading(this.a)
        b.a = b.a + 'a'
        return b

    }
    // For decrement
    operator fun dec()  : Overloading{
        val b = Overloading(this.a)
        b.a = b.a.substring(0,b.a.length-1)
        return b
    }
    //plus operator
    operator fun plus(b: Int) {
        a = "Name is $a and data is $b"
    }
    //Unary operator
    operator fun unaryMinus() {
        a = a.reversed()
    }
    override fun toString(): String {
        return a
    }
}
fun main(){
    println("Overloading the operator")
    var b = Overloading("Operator")
    println(b++)
    println(++b)
    println(b--)
    println(--b)
    b+9
    println(b)
    -b
    println(b.a)

}