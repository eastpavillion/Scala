package chapter3

object step6_arrays {
//	Here we introduce a concept called parameterization
//	In scala an object or a class instance could be initialized by new
//	When an object is intialized, you could parameterize it with type and values

//	In below example, a big integer "big" is initialized, with type BigInteger and value 123456
  val big = new java.math.BigInteger("12345")     //> big  : java.math.BigInteger = 12345

//	Below an array with 3 strings is initialzied and parameterized.
	val greetings = new Array[String](3)      //> greetings  : Array[String] = Array(null, null, null)
//	3 lines of codes initialize each element in the string array respectively
//  When a variable of val is defined, the variable itself cannot be reassignment.
//	But the object it refers could potentially still be changed.
//	greetings = new Array[String](4) would throww error.
	greetings(0) = "Hello"
	greetings(1) = ", "
	greetings(2) = "Odeussea!\n"

// Print out greetings string
// For every element, print it out
	for ( i <- 0 to 2)
		print(greetings(i))               //> Hello, Odeussea!

//	Reassign greetings element 2 with an new value
//	See the output result?
	greetings(2) = "Lorraine!\n"

//
	for (i <- 0 to 2)
		print(greetings(i))               //> Hello, Lorraine!

// Reassign values to val would cause an error "Reassignment to val"
//	greetings = new Array[String](2)

// A more concise and more commonly used way to create and initialize arrays
// The stopping sign \n in last element is important, otherwise print(numNumber(i)) wouldn't print anything to screen

val numNames = Array("I","gonna","Scala","too\n") //> numNames  : Array[java.lang.String] = Array(I, gonna, Scala, "too
                                                  //| ")
	for ( i <- 0 to 3)
// " " is inserted to make the print pretty
		print(" " + numNames(i))          //>  I gonna Scala too

// How to print the array without a space before the first element?
//	An justment sentence is added here

}