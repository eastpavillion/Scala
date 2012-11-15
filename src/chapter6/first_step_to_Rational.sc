package chapter6

object first_step_to_Rational {
//	In scala, class could take in parameters , it's different from that in Java

	class Rational(n: Int, d: Int){
//		println("Created " + n + "/" + d)
//	Override toString function to give more valuable information

//	In chapter6.3, the precondition denominator cannot be 0 is brought up.
//	We use a Predef method require to do that
	require(d != 0 )

//	To do add action, the parameter of object should be declared as field??

	val numer = n
	val denom = d

override def toString = numer + "/" + denom

//	Define add method that would sum up two Rational numbers
def add(that:Rational):Rational = new Rational(numer * that.denom + denom * that.numer , denom * that.denom)

//	Define lessThan method to judge whether the first number is less than the second one
def LessThan(that:Rational) =
	numer * that.denom < denom * that.numer

//	Define max method to return the bigger of the two, taking advantage of the LessThan function
def Max(that:Rational) =
//	Here ths "this" is referring to the object itself
	if(LessThan(that)) that else this

}

		
	new Rational(1,2)                         //> res0: chapter6.first_step_to_Rational.Rational = 1/2
	val x = new Rational(1,3)                 //> x  : chapter6.first_step_to_Rational.Rational = 1/3
	val y = new Rational(5,7)                 //> y  : chapter6.first_step_to_Rational.Rational = 5/7
	val z = x add y                           //> z  : chapter6.first_step_to_Rational.Rational = 22/21
	x.add(y)                                  //> res1: chapter6.first_step_to_Rational.Rational = 22/21

//	One advantage of declaring fields in class is that the numerator and denominator could be assesed from outside
	x.numer                                   //> res2: Int = 1
	y.denom                                   //> res3: Int = 7
//	Comment out below because it only shows the functionality of require
//	val z = new Rational(5,0)
  
  x LessThan y                                    //> res4: Boolean = true
	
	x Max y                                   //> res5: chapter6.first_step_to_Rational.Rational = 5/7
}