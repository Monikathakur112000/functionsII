open class Inheritance(Name : String , Department : String , Salary : Int) {
   // inheritance by primary constructor
    init {
        print(Name) ;  print("\t")
        print(Department) ;  print("\t")
        print(Salary)  ;  print("\t")
    }
}
class Inherit ( Name : String , Age : Int ,Department : String , Salary :Int)  : Inheritance(Name,Department,Salary){
 init{
     println(Age)
 }
}

class Derive1(Name : String , Department : String , Salary : Int):Inheritance(Name,Department,Salary){
    fun ios(){
        println(" - IOS department")
    }
}
class Derive2(Name : String , Department : String , Salary : Int):Inheritance(Name,Department,Salary){
    fun android(){
        println(" - Android department")
    }
}
//calling base class member function and  properties using super keyword
open class Inherit2 {
    var color = "Tiffany Blue"
    fun display(Name : String){
        println(Name)
    }
    }
class Second: Inherit2() {
    fun displayColor(){
        println(super.color)
        super.display("Grey")
        println()
    }

    }

//overriding member function and property
open class Example{
    open val name = "Sana"
    open fun test(){
        println(name)
        println("Overriding member function 1")
    }
}
class Example1 : Example() {
    override val name = " Kyra"
    override fun test(){
        println(name)
        println(" Overriding member function 2")
        println("")
    }
}

fun main(){
    println("Overriding member function and property ")
    val v = Example1()
    v.test()
    println("")
    val l = Second()
    l.displayColor()

    Inherit("Sana",22,"IOS",320000)
    val a = Derive1("Astha","IOS", 300000)
    a.ios()
    val b = Derive2("Tishri","Android", 400000)
    b.android()
}