package chapter7

object for_practice {
//	Below is the basic expression of use for to print 100 to 104 with step 0.5
//	val step = 0.5
//	val test_array = ( 0 to ((104-100)/step).toInt) map (x=> 100 + x*step)

//	Below is the method to print out numbers in a given range, with given step length
  	def cal( begin:Int, end:Int, step:Double) = ( 0 to (( end - begin)/step).toInt) map ( x => begin + x * step)
                                                  //> cal: (begin: Int, end: Int, step: Double)scala.collection.immutable.IndexedS
                                                  //| eq[Double]
  	
    cal( 1, 4 ,0.5)                               //> res0: scala.collection.immutable.IndexedSeq[Double] = Vector(1.0, 1.5, 2.0, 
                                                  //| 2.5, 3.0, 3.5, 4.0)
                                                  
//	One more step: The step might be minus, what we could do
	val step = -0.5                           //> step  : Double = -0.5
	val test = ( 0 to (4/(step.abs)).toInt) map ( x => 104 + x * step)
                                                  //> test  : scala.collection.immutable.IndexedSeq[Double] = Vector(104.0, 103.5,
                                                  //|  103.0, 102.5, 102.0, 101.5, 101.0, 100.5, 100.0)
	
def cal2( start: Int, end: Int, step:Double) = {
require (step != 0)
if ( step > 0) ( 0 to (( end - start)/step).toInt) map ( x => start + x * step)
else ( 0 to ((start-end)/(step.abs)).toInt) map ( x => start + x * step)
}                                                 //> cal2: (start: Int, end: Int, step: Double)scala.collection.immutable.Indexed
                                                  //| Seq[Double]

  cal2(100,104, -0.5)                             //> res1: scala.collection.immutable.IndexedSeq[Double] = Vector()
  cal2(100,104,0.3)                               //> res2: scala.collection.immutable.IndexedSeq[Double] = Vector(100.0, 100.3, 1
                                                  //| 00.6, 100.9, 101.2, 101.5, 101.8, 102.1, 102.4, 102.7, 103.0, 103.3, 103.6, 
                                                  //| 103.9)
//	cal2(3,5,0)
	cal2(104,100,-0.5)                        //> res3: scala.collection.immutable.IndexedSeq[Double] = Vector(104.0, 103.5, 1
                                                  //| 03.0, 102.5, 102.0, 101.5, 101.0, 100.5, 100.0)
}