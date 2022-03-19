fun main(){
    //checking whether present in range or not
    val i = 4
    if(i in 7..20)
        println("Present in the range between 7 and 20")
    else
        println("Not present in the range")
    println()
    //predefined function in the range
    //using step for gap between the range
    val a = 1..10 step 2
    println(a.sum())
    println(a.maxOrNull())
    println(a.average())
    println(a.minOrNull())
    println()
    //reversing the range by reversed function
    for(item in a.reversed())
    {
        println(item)
    }
    println()
    //using step and printing the first, last and step of the range
    println((1..20 step 2).first)
    // print last value of the range
    println((11..20 step 4).last)
    // print the step used in the range
    println((11..20 step 5).step)
    println()
    //traversing the range
    (1..8).forEach(::println)

}
