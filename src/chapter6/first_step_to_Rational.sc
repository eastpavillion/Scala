package chapter6

object first_step_to_Rational {
//	In scala, class could take in parameters , it's different from that in Java

	class Rational(n: Int, d: Int){
//		println("Created " + n + "/" + d)
//	Override toString function to give more valuable information

//	In chapter6.3, the precondition denominator cannot be 0 is brought up.
//	We use a Predef method require to do that
	require(d != 0 )

//	To normalize a rational number, the gcd functional is deployed.
	private val g = gcd(n.abs,d.abs)
//	To do add action, the parameter of object should be declared as field??

	val numer = n / g
	val denom = d / g

//	Auxiliary constructor shoud be the format of this
def this(n:Int) =  this(n,1)

//	Override the toString method to print out something more useful
override def toString = numer + "/" + denom

//	Define add method that would sum up two Rational numbers
//	Method name could be named as operator, which is more natural for rational numbers from mathmatic point of view
def + (that:Rational):Rational = new Rational(numer * that.denom + denom * that.numer , denom * that.denom)

//	Method overloading: It would be nice if class Rational could support arithmatic operation with integers
//	Thus, + method could be re-written to support such operation with integers
def + (i: Int):Rational = new Rational( numer + i * denom, denom)

//	Define a negative symbol
def unary_- (that:Rational):Rational = new Rational( -numer, denom)
//	Use the unary number to define -
def - (that:Rational):Rational = this - that


//	Define * method
def * (that:Rational):Rational = new Rational(numer * that.denom , denom * that.denom)
//	Override * with algorithm with integer
//	Compiler would pick up the appropriate method to use when executing the code
def * (i: Int): Rational = new Rational( numer * i , denom)

//	Define / method
def / (that:Rational) : Rational = new Rational( numer * that.denom, denom * that.numer)
def / (i: Int) : Rational = new Rational(numer, denom * i)

//	Define lessThan method to judge whether the first number is less than the second one
def LessThan(that:Rational) =
	numer * that.denom < denom * that.numer

//	Define max method to return the bigger of the two, taking advantage of the LessThan function
def Max(that:Rational) =
//	Here ths "this" is referring to the object itself
	if(LessThan(that)) that else this
	
// Allow integer multiple Rational number
implicit def intToRational(x: Int) = new Rational(x)

//	Define the private method gcd here , so as not to interrupt the normal code reading
//	The algorithm used is Eudlid algorithm, which could date back to 300BC.

	private def gcd(a: Int, b:Int) : Int ={
		if ( b == 0) b else gcd(b, a%b)}
}


	new Rational(1,2)                         //> java.lang.ArithmeticException: / by zero
                                                  //| 	at chapter6.first_step_to_Rational$Rational.<init>(chapter6.first_step_t
                                                  //| o_Rational.scala:18)
                                                  //| 	at chapter6.first_step_to_Rational$$anonfun$main$1.apply$mcV$sp(chapter6
                                                  //| .first_step_to_Rational.scala:71)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at chapter6.first_step_to_Rational$.main(chapter6.first_step_to_Rational
                                                  //| .scala:68)
                                                  //| 	at chapter6.first_step_to_Rational.main(chapter6.first_step_to_Rational.
                                                  //| scala)
	val x = new Rational(1,3)
	val y = new Rational(5,7)
	val z = x + y

	val a = new Rational(3)
	val b = new Rational(6,4)
	

//	2 * x
	x * y
	

//	One advantage of declaring fields in class is that the numerator and denominator could be assesed from outside
	x.numer
	y.denom
//	Comment out below because it only shows the functionality of require
//	val z = new Rational(5,0)

//	Test LessThan works
  x LessThan y

//	Test Max method works
	x Max y

//	To test the auxiliary constructor
	
	
}