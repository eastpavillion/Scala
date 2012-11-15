package chapter3

object step10_set_and_map {
// Scala has provided mutable and immutable versions for Set and Map
//	Here we illustrate the difference of mutable Set and immutable Set first.


//	Define a var jetSet , whose type is immutable Set
var jetSet = Set("Boeing","Airbus")               //> jetSet  : scala.collection.immutable.Set[java.lang.String] = Set(Boeing, Air
                                                  //| bus)
//	Immutable set would create and return a new Set with the element added
jetSet += "Lear"
//	Print the new Set
println(jetSet)                                   //> Set(Boeing, Airbus, Lear)
//	Print if the new Set contain a certain vaue, bool type would be returned.
println(jetSet.contains("Cassena"))               //> false

//	To prove that set is disordered, no matter mutable or immutable,
//	I create below testSet
var testSet = Set(3,2,1,5,7)                      //> testSet  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 7, 3)



//	Mutable Set is ilustrated here
//	The package for mutable Set must be imported, so as to use Set directly instead of scala.collection.mutable.Set
	import scala.collection.mutable.Set

//	Because movieSet is a mutable Set type, so itself could be set as val
val movieSet = Set("TBBT","Crank")                //> movieSet  : scala.collection.mutable.Set[java.lang.String] = Set(Crank, TBBT
                                                  //| )
movieSet += "Anna Karenina"                       //> res0: chapter3.step10_set_and_map.movieSet.type = Set(Anna Karenina, Crank, 
                                                  //| TBBT)
println(movieSet)                                 //> Set(Anna Karenina, Crank, TBBT)

//	In above case, it seems that mutable Set would do some asend sort by itself.
//	Make a new  case to testify it
val numberSet = Set(3,2,1,5,7)                    //> numberSet  : scala.collection.mutable.Set[Int] = Set(2, 1, 3, 7, 5)

numberSet += 4                                    //> res1: chapter3.step10_set_and_map.numberSet.type = Set(2, 1, 4, 3, 7, 5)


//	Of course, immutable set could be written explicitly for certain purpose
import scala.collection.immutable.HashSet
//	Define an immutable hash set with two string elements.
var hashSet = HashSet("Cat","Dog")                //> hashSet  : scala.collection.immutable.HashSet[java.lang.String] = Set(Cat, 
                                                  //| Dog)
//	Print out hash set with a dog
hashSet += "Chine"
//	Question: Why Chine is the first element of the hash Set now
//	Well set is not ordered
println(hashSet)                                  //> Set(Chine, Cat, Dog)

//	Question:Why Bull is the last
println(hashSet + "Bull")                         //> Set(Chine, Cat, Dog, Bull)





}