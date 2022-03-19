//Regular expression
fun main() {
    val pattern = Regex("a$")
    println(pattern.containsMatchIn("abc"))
    println(pattern.containsMatchIn("daca"))
    println(pattern.containsMatchIn("aa Reg"))
    println()
    //find function in regular expression
    val pattern1 = Regex("se")
    val value1: MatchResult? = pattern1.find("sigsegv", 2)
    println(value1?.value)
    //findAll function
    val pattern2 = Regex("sh.rt")
    val value2 : Sequence<MatchResult> = pattern2.findAll("shortsightednesshirt",0)
  value2.forEach {
      MatchResult->println(MatchResult.value)
  }
    println()
    //matches function whether input string matches or not
    val pattern3 = Regex("a([p]+)le")
    println(pattern3.matches("apple"))
    println(pattern3.matches("appppppppple"))
    println(pattern3.matches("apples"))
    println(pattern3.matches("applicable"))
    println()
    //Replace and replace first function in the regular expression
    println(pattern3.replace("appledbnmfapple" ,"abode"))
    println(pattern3.replaceFirst("applejack-apple" ,"abode"))
    println()
    //matchEntire function
    val pattern4 = Regex("applicable?")
    println(pattern4.matchEntire("applicable")?.value)
    println(pattern4.matchEntire("apple")?.value)
    println(pattern4.matchEntire("")?.value)
    println()
    //split function
   val pattern6 = Regex("\\s+")
    val ans : List<String> = pattern6.split("This is a sentence")
    ans.forEach { word -> println(word) }

}