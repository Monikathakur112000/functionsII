//using interface for default values and method
interface Trial {

    val c: Int // Implementing interface properties
    get() = 23
    val g : Int
    val e : String
    get() = "Interface"

    fun test(a: Int, b: Int = 2) // default value and method
    fun test2() {
        println("It will call default value")
    }
}
interface Trial2 : Trial{ // Inheritance in the interface
    fun mul()
    fun div()
}
class Interface : Trial2,Trial { // Multiple interface

    override val c: Int = 23
    override val g: Int = 12
    override fun div() {
        println(c/g)
    }
    override fun mul() {
        println(c*g)
    }
    override val e: String = "Interface is overridden"
    override fun test(a: Int, b: Int) {
        println(a+b)
    }
    override fun test2(){
        super<Trial2>.test2()
        println("Overridden")
    }
}
fun main(){

    println("Interface for default value and methods")
    val d = Interface()
    println(d.c)
    println(d.e)
    println("Multiplication of c and g = ")
    d.mul()
    println("Division of c and g = ")
    d.div()
    d.test(12,44)
    d.test(12)
    d.test2()
    println()
    //data classes
    //toString Function
    data class Data( val name :String, val Age :Int){
        lateinit var department : String
    }
    val o1 = Data("Monika",21)
   // println(o1.toString())
    val o4 = Data("Monika",21)
    val o2= o1.copy(name ="Astha")
    val o3 = o2.copy()
    o4.department= "Android"
    o2.department= "IOS"
    o3.department= "WEB"
    println("$o4 ${o4.department}")
    println("$o2 ${o2.department}")
    println("$o3 ${o3.department}")
    //hashCode and equals functions of the data class
    println()
    println("hashCode() and equals() functions")
    val hash1 = o2.hashCode()
    val hash2 = o3.hashCode()
    val hash3 = o4.hashCode()
    println(hash1)
    println(hash2)
    println(hash3)
    println(hash1 == hash2)
    println(hash2 == hash3)
    println(hash3 == hash1)
   println()
    val q = Seal.Subclass1()
    q.sub()
    val w = Seal.Subclass2
    w.sub()
    val p1 = Seal1.Fruit1()
    display(p1)
    val p2 = Seal1.Fruit2()
    display(p2)
}

//sealed class
sealed class Seal{
    open class Subclass1 : Seal(){
        fun sub(){
            println("Sealed class subclass 1")
        }
    }

    object Subclass2 : Seal() {
        fun sub() {
            println("Sealed class subclass 2")
        }
    }
}
//sealed classes with a when clause
sealed class Seal1
    (val x : String) {
    class Fruit1 : Seal1("Grapes")
    class Fruit2 : Seal1("Kiwi")
}
fun display( fruit : Seal1){
    when(fruit)
    {
        is Seal1.Fruit1-> println(fruit.x)
        is Seal1.Fruit2-> println(fruit.x)
    }
}


