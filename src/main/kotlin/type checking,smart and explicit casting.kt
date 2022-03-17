fun main(){
    val name = "Monika"
    val age = 21
    val salary =56456.77
    //type checking using when
    val employee:List<Any> = listOf(name,age,salary)
    for (emp in employee) {
        when (emp) {
            is String->println(emp)
            is Int->println(emp)
            is Double->println(emp)
            else->println("Not an attribute")
        }
    }
    //Smart casting
    val var2  = "Monika Thakur"
    val var1 : String? = null
    if( var1 !is String )
    {
        println("It is not string ")}
    else{
        println(var2.length)}
}
