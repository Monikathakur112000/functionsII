import kotlin.math.PI
open class Circle(val radius : Double) {
    fun area(): Double {
        return PI * radius * radius
    }
}
    class AreaSquare : Circle(2.3)


fun main(){
    fun Circle.operate() : Double{
        return radius * radius
    }
  /*  fun AreaSquare.operate() : Double {
        return radius * radius
    }*/
    fun display(a : Circle){
        println(a.operate())
    }
    display(AreaSquare())

    fun Circle.perimeter(): Double{
        return 2 *PI*radius
    }
    val obj = Circle(3.4)
    println(obj.area())
    println(obj.perimeter())
    // Extension function defined for Int type
    fun Int.abs() : Int{
        return if(this < 0) -this else this
    }

    println((-9).abs())
    println(4.abs())
}
