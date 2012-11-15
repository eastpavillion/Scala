package chapter4



class ChecksumAccumulator{
//	To increase robustness of code, the variable defined in class should not be visited by member methods
//	So the field in class is defined as private
//	Different from Java, everything in Scala is taken Public by default.
//	Private variable could be visited the member methods in this class. 
	private var sum = 0
	
//	Below define memeber methods of the class
//	Note: Parameters used by class methods are val, so reader need not to conjecture their values.
//	One method is below: Define a method with explict return type.

//	def add(b:Byte): Unit = { sum += b}
//	To be more concise, the method could be written without implicit return type.
//	Note: methods with curly braces {} but without = would be considered as Unit return type.
	def add(b:Byte) {sum += b}

	
/*
 * The checksum example here did one thing: calculate the negative value of sum's lowest 8 bits.
 */
	def checksum():Int = ~(sum & 0xFF) +1
}


import scala.collection.mutable.Map

object ChecksumAccumulator{
	private val cache = Map[String,Int] ()

	def calculate(s:String): Int ={
		if(cache.contains(s))
			cache(s)
		else{
			val acc = new ChecksumAccumulator
			for(c <- s)
				acc.add(c.toByte)
			val cs = acc.checksum()
			cache += (s -> cs)
			cs
		}
	}

  
}
