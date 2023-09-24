fun main() {
	val age =20
    val name ="Lyzza"
    val old= 20*365
    val border ="==%%"
    val timesToRepeat= 5
    
     
   
    print("Happy Birthday!${name}\n")
    print("\nI am ${age} years old ")
    print("\n${age} is the best age to learn Kotlin\n")
    print("${name} is already ${old} days old\n")
    
	//let's print a cake!
	println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
    
    printBorder(border, timesToRepeat)
    println("Happy Birthday!${name}")
    printBorder(border, timesToRepeat)
    
}

fun printBorder(border:String,timesToRepeat:Int){
    	
        repeat(timesToRepeat){
        	print(border)
    }
        println()
}
