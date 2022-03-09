//Lambda function
//Returning a value from lambda expression
val lambda3 = fun(x : Int)// anonymous function
 {
    return if(x%2==0 && x<0)
        print("Even and negative \n")
    else if (x%2==0 && x>0)
    print("Even and positive \n")
    else if (x%2!=0 && x>0)
        print("odd and positive \n")
    else
        print("odd and negative \n")
}
//Higher order function with no return type
val lambda4 ={println("Higher order function")}
fun higherfunc(lambda4: () -> Unit)
{
    lambda4()
}



//anonymous function
val anonymous = fun(g : Int , h : Int ) : Int=g+h
val anonymous2 = fun(j : Int , k : Int) : Int{
    return j*k
}
//Higher order function with return type
/*val lambda = {a: Int , b :Int ->a*b} *//*; b.toString()*//* // converting integer to string//
 fun higherfunc(m : (Int,Int)-> Int){
     println(m(3,4))
 }*/
val mul : (Int, Int) -> Int = { a, b-> a*b}
val lambda2 :String.(Int)->String ={this + it}
//passing function as a parameter  in the higher order function
/*
fun add(r: Int, s: Int) : Int{
    return r+s
}
fun higherfunc(addfun:(Int,Int)->Int)
{
    println(addfun(4,5))
}
*/
//Returning a function from higher order function
fun add(r: Int, s: Int) : Int{
    return r+s
}
fun higherfunc():((Int,Int)->Int){
    return ::add
}


fun main(){
    //println(lambda(2,3))
    println(mul(5,6))
    println(lambda2("alpha", 12))
    println(lambda3(11))
    println(anonymous(4,5))
    println(anonymous2(7,8))
    higherfunc(lambda4)
    //higherfunc(lambda)
    //higherfunc(::add)
    val p = higherfunc()
    println(p(4,8))

    //Inlined function
    inlinedFunc({ println("Expression 1")
    return },
    {println("Expression 2") })
}
inline fun inlinedFunc( q :()->Unit, w :()->Unit) {
    q()
    w()
}