import kotlin.properties.Delegates

//lazy Delegation
val var1 : String by lazy {
    "LAZY delegation property"
}
//storing properties in the map
class User(map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}


//Observable delegation property
class Del {
    var name: String by Delegates.observable("<no name>")
    {
             _, old, new ->
        println("$old -> $new")
    }
}
interface Delegation {
    val new : String
    fun function1()
    fun function2()
}
class Delegation1(val a : String):Delegation{

    override val new = "Delegation implementation a = $a"
    override fun function1() {
        println(a)
    }
    override fun function2() {
        println(a)
    }
}
class Delegation2 (d : Delegation): Delegation by d {
    override val new = "New overridden delegation implementation"
    override fun function1() {
        println("Delegation method")
    }
}
    fun main() {
        val obj = Delegation1("Object oriented")
        Delegation2(obj).function1()
        Delegation2(obj).function2()
        val derived = Delegation2(obj)

        derived.function1()
        println(derived.new)
        println(var1)
        val user = Del()
        user.name = "first"
        user.name = "second"

        val user1 = User(mapOf(
            "name" to "Monika",
            "age"  to 21 ))
        println(user1.name)
        println(user1.age)
        //vetoable property
        var max: Int by Delegates.vetoable(0)// Defining variable max with
        // vetoable default value as 0
        {

                _, oldValue, newValue ->
            newValue > oldValue
        }

        println(max)

// assigning new value to max variable
        max = 10
        println(max)
// assigning new value to max variable, but it
// does not satisfy max condition
        max = 5
        println(max)
    }


