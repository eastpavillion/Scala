package chapter2

object step4_scala_scripts {

// IDE doesn't support calling *.scala script from console.
// Leave this step as this.
  println("Hello, Odeussea from a script!")       //> Hello, Odeussea from a script!
 
 
 // After some practice on Step5, I find it possible to implement function to take in tha argument:)
 // The input arguments are defined as Array here, to simulate commnd line input
 
 def script(args:Array[String]){
 	println("Hello " + args(0) + "!")
 }                                                //> script: (args: Array[String])Unit

// Define a variable that is an array with only one element
val args = Array("Odeussea")                      //> args  : Array[java.lang.String] = Array(Odeussea)
// Try to call script function to println the out
	script(args)                              //> Hello Odeussea!

// Define an array has multiple elements
val wuwen = Array("uncle","wuwen")                //> wuwen  : Array[java.lang.String] = Array(uncle, wuwen)
// Only first argumens is used
script(wuwen)                                     //> Hello uncle!

}