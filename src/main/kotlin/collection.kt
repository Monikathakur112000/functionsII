fun main() {

    val immutableList = listOf(10,20,12,0,4,5,61) // Immutable list(ordered)

    // ascending and descending order of the list
    val asc = immutableList.sorted()
    println(asc)
    val dec = immutableList.sortedDescending()
    println(dec)

    // contains and contains all function
// to check element in the  list
    val k = immutableList.contains(20)
    if(k)
        println("20 is present")
    else
        println("not present")
    val d = immutableList.containsAll(listOf(12 ,-23))
    if (d)
        println("Both are present")
    else
        println("Not present")

    //directly getting first and last  element
    println(immutableList.first())
    println(immutableList.last())
    val r = immutableList[2]
    println(r)
    val index1 = immutableList.lastIndex
    println("The last index of the list is $index1")
    val index = immutableList.indexOf(20)
    println("The index is $index")

    for( i in immutableList)
        println("$i , ")
    for( i in immutableList.indices)
        println( "$immutableList")
    immutableList.forEachIndexed { i, j -> println("immutableList[$i] = $j") }

    // method 4
    val it: ListIterator<Int> =  immutableList.listIterator()
    while (it.hasNext()) {
        val z = it.next()
        print("$z ")
    }
println("\n")
//set of
    val immutable1 = setOf(1,2,3,56,74,21) // set (unordered)
    println("The index of the element is " + immutable1.indexOf(56))
    println("The index is "+ immutable1.lastIndexOf(2))
    println("The element is "+ immutable1.elementAt(2))
    println("The element is "+ immutable1.first())
            println("The element is "+ immutable1.last())
 // basic functions
    println(immutable1.sum())
    println(immutable1.count())
    println(immutable1.average())
    println(immutable1.minOrNull())
    println(immutable1.maxOrNull())

    //contains and contains all
// to check element in the  list
    val w = immutable1.contains(20)
    if(w)
        println("20 is present")
    else
        println("not present")
    val e = immutable1.containsAll(setOf(12 ,-23))
    if (e)
        println("Both are present")
    else
        println("Not present")
    val num = 5
    println("The set contains the element $num or not?  "  +immutable1.contains(num))
    println("\n")
     // isEmpty() function
    //creating an empty set of strings
    val seta = setOf<String>()
    //creating an empty set of integers
    val setb =setOf<Int>()
    //checking if set is empty or not
    println("seta.isEmpty() is $seta.isEmpty()")
    // Since Empty sets are equal
    //checking if two sets are equal or not
    println("seta == setb is ${seta == setb}")
    println(seta)

    for( i in immutable1)
        println(i)

    val immutable2 = mapOf(1 to "Muskaan") // map - unique key( hold single value)

    for( key in immutable2.keys)
        println(immutable2[key])


    // Mutable list either add or remove element
    val mutableList = mutableListOf("Astha", "Rashika" ,"Anisha")
    mutableList[1] =  "Anjali"
    mutableList.add("Rashika")
    for ( a in mutableList) {
        println(a)
    }

    println("\n")

    //mutable set  ( can add or remove element)
    val mutableSet = mutableSetOf(1,2,3,4,5,6)
    mutableSet.add(7)
    // adding element to the list
    mutableSet+=listOf(99,8)
    println(mutableSet)
    for ( b in mutableSet) //traversing by for loop
        println(b)
    //getting index of the specific element
    println("Element at the index is " +mutableSet.elementAt(3))
    println("The index of the element is " +mutableSet.lastIndexOf(4))
    println("The index of element 3 is " +mutableSet.indexOf(3))
    println("Element at the  first index is " +mutableSet.first())
    println("Element at the last index is " +mutableSet.last())
    //contains and contains all functions
    val p = mutableSet.contains(20)
    if(p)
        println("20 is present")
    else
        println("not present")
    val y = mutableSet.containsAll(setOf(12 ,-23,"DIGIT"))
    if (y)
        println("Both are present")
    else
        println("Not present")


    println("\n")

    //mutable map
    val map = mutableMapOf(1 to "Jainesh", 2  to "Astha" , 3 to "Muskaan")
    map[1] = "Parika"
    map[4] = "Ishan"
    for ( m in map.values)
        println(m)

println("\n")

    // Array list
    val arrayList = ArrayList<String>()
    arrayList.add("Array")
    arrayList.add("List")
    arrayList.add("Example")
    // Removing an element in the arraylist
    arrayList.remove("Example")
    val arrayList1 =  ArrayList<String>()
    arrayList1.addAll(arrayList) //adding all the elements
     for( c in arrayList1)
         println(c)
    println("Element at index 1 = " + arrayList1[1]) // return element at specified position
    // set for replacing element at specified position
    arrayList1[1] = "List1"
    for (i in arrayList1)
        println(i)
    // For getting index of the element
    println("Index  of element  = " + arrayList.indexOf("List2"))
    arrayList.clear()
    println("Size = " +arrayList.size)


}