import java.util.*

//creating class and objects
class OuterClass{
    var w  : String= ""
    var name: String = "Monika"
   private set
    var age: Int = 0
    fun insert(a: String, c: String , b: Int) {
        w = a
        name = c
        age = b
        // department = c
        println(name)
        println(b)
        println(a)
    }
// creating inner class for accessing the element of the outer class
    inner class InnerClass{
        fun innerFunction () : String{
            return name

        }

    }
   // internal var department: String = ""
//created nested class that is class in another class
    class Nested{ // nested class
        var n = "Nested class"
       fun nestInsert(e: String): String {
           return n.plus(e)

       }
    }
}
//  constructor
class Registration constructor( email: String, pwd: String) {
// getter and setter property
    var emailId: String = email
        // Custom Getter
        get() {
            return field.lowercase(Locale.getDefault())
        }
    var password: String = pwd
        // Custom Setter
        set(value){
            field = if(value.length > 6) value else throw IllegalArgumentException("Passwords is too small")
        }
}

fun main(){
    val obj = OuterClass()
    obj.w =   "Setter and Getter"
    println(obj.w)
    // accessing the member function
    obj.insert("Outer class","Ankita",21)
    println("Class : " + obj.w)
    println("Name of the employee : " + obj.name) // accessing the property of the class
    obj.insert("New object","Kriti",22)
    println(obj.w)
    println("Age of the employee : " + obj.age)
    // calling nested class function
    println(OuterClass.Nested().n) // accessing nested member
     // calling nested member function
    println(OuterClass.Nested().nestInsert(" call successful"))
    //Inner class
    val inner1 = OuterClass().InnerClass()
    println("Outer class Name accessed by the inner class = "+ inner1.innerFunction())

   // println("Department of the employee : " + obj.department)

 val obj2 = Registration("abcd@gmail.com","ds7866768767")
    println(obj2.emailId)
    obj2.emailId = "example.gmail.com"
    println(obj2.emailId)
    println(obj2.password)
    //obj2.password = "abc"

}


