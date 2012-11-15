package chapter2

// Here I give some simple illustration for using IDE
// In Martin's book "Programming in Scala", all examples are illustrated by REPL,
// but due to communcation purpose, all the cases would be executed in scala IDE.
// There is difference between command line and line.
// **********************************************
// * How to write cli style code in scala IDE   *
// **********************************************
// Step 1: New Scala Project
// Step 2: New Package
// Step 3: New worksheet.
//  Then in the object <name> {}, you could use it as command line, as illustrated below.


object step1{
// Compiler would do type inteference by the expression given,
// below expression " 1 + 2" would return a result with type Integer.
// the res(i) would increase according to expressions.
	1 + 2                                     //> res0: Int(3) = 3
// Compiler considers it's a double adds a integer, so the result is double
	1. + 2                                    //> res1: Double(3.0) = 3.0
// (1). + (2), .+ would be considers as calling a function + with input value 2  to 1, so the return type is still integer
  (1).+ (2)                                       //> res2: Int(3) = 3
  
// 3 * 4 would return integer
	3 * 4                                     //> res3: Int(12) = 12

// (3).* (4) would return integer, as .* is consider passing value 4 to .* function
  (3). * (4)                                      //> res4: Int(12) = 12
// (3.) * (4) would return type double
  (3.) * (4)                                      //> res5: Double(12.0) = 12.0


// Divison is also supported.
// If both dividend and divisor are integer, the quotient would be integer.
// For instance, the result of 3/4 would 0
	3/ 4                                      //> res6: Int(0) = 0
// If either dividend or divisor is double, the quotient would be double
  (3.)/ 4                                         //> res7: Double(0.75) = 0.75
// Any other types are supported in scala?
// Like float
  15F/2                                           //> res8: Float(7.5) = 7.5
// Like in hex format
  0xA + 0x3                                       //> res9: Int(13) = 13
// In "Programming scala Chapter 5, we could more types are supported
// Although I don't time to implement them one by one here, I list them below
// Byte, Short, Int, Long, Char, String, Float, Double, Boolean
}