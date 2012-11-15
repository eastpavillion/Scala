package chapter2

object Step3_functions {
// Define a function. Function name is max,which receives two integer parameters, and return an type Integer.
// The function of function is to return the bigger value of two inputs integers.
	def max(x:Int, y:Int): Int = {
	if(x > y) x
	else y}                                   //> max: (x: Int, y: Int)Int
	
// Call max function to find the bigger one in (3,5)
	max(3,5)                                  //> res0: Int = 5
	
// Call max function to find the bigger one in (3.0, 5.0)
// Input type check failed
// Scala is simple and strict!
//	max(3.0,5)


	max(4,4)                                  //> res1: Int = 4
	
	
// Actually the return type of the function is not necessary,
// because compiler would be type inferece automatically.
// Re-write max function as below
	def max2(x:Int, y:Int) = if(x > y) x else y
                                                  //> max2: (x: Int, y: Int)Int
// The function return is correctly caluclated by compiler


// What is the function does not take in any parameters?
// Define a function greeting without any parameters
// Its return type is Unit, which means it has side effects
	def greeting() = println("Hello, goodbye!")
                                                  //> greeting: ()Unit
	
	
	
}