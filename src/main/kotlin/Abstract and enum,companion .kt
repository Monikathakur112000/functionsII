//Abstract class
abstract class Abstract(private val name : String, private val age : Int) {
    abstract val department : String
    abstract fun absFunction(Salary : Int = 23545434)
    fun nonAbstract(){
        println(name)
        println(age)
        println(department)
    }
}
class Derived( name : String , age : Int): Abstract(name,age){
    override val department = "Android"
    override fun absFunction(Salary: Int) {
        println("Overridden Salary of the employee $Salary")
    }
}
//overriding the abstract function in different derived classes
class Derived1(name : String , age : Int) : Abstract(name,age) {
    override val department = "IOS"
    override fun absFunction(Salary: Int) {
        println("Overridden Salary of the employee $Salary")
    }
}

//Overriding a non-abstract open function by an abstract class
open class New {
    open fun function(){
        println("Function without the abstract")
    }
}
abstract class NewAbs: New(){
    abstract override fun function()
}
class Abs : NewAbs() {
    override fun function() {
      println("Overriding a non-abstract open function by an abstract class")
    }
}

//Creating enum class with the default value and function
enum class Day(val isWeekend : Boolean = false){

    Sunday(true),Monday,Tuesday,Wednesday,Thursday,Friday,Saturday(true);
    // companion object is used here
    companion object{
        fun today(obj: Day): Boolean {
            return obj.name.compareTo("SATURDAY") == 0 || obj.name.compareTo("SUNDAY") == 0
        }
    }
    }
//enum class as anonymous classes
enum class Seasons {
    Summer {
        override fun season(){
            println("Its summer")
        }
    },
    Winter {
    override fun season(){
        println("Its winter")
    }
},
    Rainy {
        override fun season(){
            println("Its rainy")
        }
    };
    abstract fun season()
}

fun main(){
    Seasons.Rainy.season()
    Seasons.Winter.season()
    Seasons.Summer.season()
    println()

    //when expression with the enum class
    when(Day.Tuesday){
        Day.Sunday->println("Today is sunday")
        Day.Monday->println("Today is monday")
        Day.Tuesday->println("Today is tuesday")
        Day.Wednesday->println("Today is wednesday")
        Day.Thursday->println("Today is thursday")
        Day.Friday->println("Today is friday")
        Day.Saturday->println("Today is saturday")
    }

    println()
    //enum class
    for ( day in Day.values()){
        println("${day.ordinal} = ${day.name}")
        println(day.isWeekend)
    }
    val today = Day.Monday
    println("Is today a weekend ${Day.today(today)}")
    println(Day.valueOf("Tuesday"))
    println()
    //Abstract class
    val obj = Derived("Monika", 21)
    obj.nonAbstract()
    obj.absFunction(323657000)
    println()
    val obj1 = Derived1("Anisha",21)
    obj1.nonAbstract()
    obj1.absFunction(453895000)
    println()
    val lt = New()
    lt.function()
    val d = Abs()
    d.function()
}