package chapter6

object while1 {
 	def greet() {println("hi")}               //> greet: ()Unit
 	def greet1() = println("hi")              //> greet1: ()Unit
//	() represents unit value
//	We could confirm this by below equation
//	Because greet method returns units type as definition, the return value of the equation is true
 	greet() == ()                             //> hi
                                                  //| res0: Boolean = true
 	
}