fun main() {
    //hashSet(mutable)
    val a = hashSetOf(1, 2, 3, 4)
    println(a)
    //adding element in the collection
    a.add(66)
    val b = setOf(656, 54, 23)
    a.addAll(b) //adding all element at once
    a.remove(656) //removing the element from the hashset
    println(a)
    for (i in a) // traversing by for loop
        println(i)
    //finding element at specific index
    println(a.elementAt(4))
    println(a.indexOf(4))
    println(a.lastIndexOf(4))
    //contains and contains all function
    val c = 44
    println(a.contains(c))
    println(a.containsAll(setOf(34, 434, 3432, 33, 2)))
    //isempty function
    val d = hashSetOf<Int>()
    val e = hashSetOf<String>()
    println(d.isEmpty())
    println(d == e)
    println("\n")

    //immutable map
    val f = mapOf(1 to "one", 2 to "two", 3 to "three", 1 to "four")
    val g = mapOf<Int, String>() //empty map
    println(f)
    println(f.keys)
    println(f.values)
    println(f.size)
    println(f.count())
    //empty map
    println(g.keys)
    println(g.entries) //entries of map
    println(g.values)
    //get values of the map
    println(f[2])
    println(f.getValue(1))
    println(f.getOrDefault(3, 0.toString()))
    val h = f.getOrElse(2) { 0 }
    println(h)
    // map containing key value or not
    val i = 2
    if (f.containsKey(i))
        println("Present $i")
    else
        println("Not present")
    val j = "five"
    if (f.containsValue(j))
        println("Value is present")
    else
        println("Not Present ")

    //hashmap function
    val hashMap: HashMap<String, Int> = HashMap()
    hashMap["One"] = 1
    hashMap["Two"] = 2
    hashMap["Three"] = 3
    hashMap["Four"] = 4
    hashMap.replace("Two" , 999)
    println("\n" + "hashMap.size : " + hashMap.size )
    for (key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }

}
