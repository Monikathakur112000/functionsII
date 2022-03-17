
import java.util.Scanner

    fun main(){
        //checking null reference
        var  a : String? = "Null safety"
        println(a?.reversed())
        println(a?.uppercase())
        if(a!=null)
            println(a.length)
        else
            println("Null string")
         a= null
        println(a)
        println("Null string")

        //Multiple catch
        val s = Scanner(System.`in` )
        try{
            val n = Integer.parseInt(s.nextLine())
            if (512 % n==0)
                println("$n is a factor of 512")
        }
        catch (e: ArithmeticException) {
            println(e)
        }
        catch (e: NumberFormatException) {
            println(e)
        }
        finally{
            println("Finally block always executes")
        }
        //let, run  and also method
        val variable1 : List<String?> = listOf("Monika","Thakur",null)
        var variable2 = listOf<String?>()
        for ( item in variable1) {
            item?.let { variable2 = variable2.plus(it) }
            item?.run { variable2 = variable2.plus(this) }
            item?.also { it -> println(it) }
        }
        //elvis operator
        var variab : String? = "Elvis operator"
        println(variab!!.length)
        variab = null
        println(variab?.length ?: "Unknown")


    }