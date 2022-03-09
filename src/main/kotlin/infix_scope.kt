//infix function
import kotlin.random.*
class Math{
   infix fun square( e: Int) : Int{
        return e*e
    }
}

// apply - initialise or configure an object

//apply,with,let,also
class First {
    var name : String =""
    var age : Int = 0
}
// run scope function class
class Company {
    lateinit var name : String
    //lateinit var objective : String
}
//main
fun main(){
    val person = First().apply{
        name ="MONIKA"
        age=21
    }
//with -operate on a non-null object
    val ageafter = with(person) {
        println(name)
        println(age)
        age+7
    }
    println(ageafter)
//also, for additional object  configuration or operation
    val numbersList = mutableListOf(1,2,3)
    numbersList.also {
        println("The list elements before adding new one: $it")
        it.add(4)
        println("The list elements after adding new one: $it")
    }
    //let -to avoid null pointer exception-return lambda value
    // refer to context object by it
  val data : String? = null
    //val data1=
    data?.let{
        println(it.reversed())
        it.length
    }
   // println(data1)
// run function combination of let and with , operate on nullable object
/*    val data2 : First? = null
    val data3 = data2?.run{
        println(name)
        println(age)
    }
println(data3)*/
val company :Company?=null
    // body only executes if
    // company is non-null
    company?.run {
        print(name)
    }
 /*   print("Company Name : ")
    // re-initialize company
    company = Company().apply {
        name = "Anjali"
        objective = "A computer science portal f"
    }
    // body executes as
    // 'company' is non-null*/
    company?.run {
        print(name)
    }

    val f= Math()
    val res = f square 3
    println(res)
    var a= 123
    var b=23
    val c=44
    val d = (a>b)and(a>c)
    println(d)
    println(a shl b) //standard infix notation
    println(++a)
    println(--b)

    //take-if and take unless
    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 }
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println("even: $evenOrNull, odd: $oddOrNull")
}
/*
data class Person(var name: String, var age: Int = 0, var city: String = "")

fun main() {
    val Lily = Person("Lily").apply {
        age = 32
        city = "London"
    }
    println(Lily)
}
*/






