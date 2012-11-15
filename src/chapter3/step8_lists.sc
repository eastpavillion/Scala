package chapter3

object step8_lists {
//	In functional programming, one philosophy is that every method should not have side effect
//	This means all the methods should should only compute and return a value,
//	and all the parameters go in and out of a method should be type checked.
//	In other words, making objects immutable.
//  Array elements are mutable although array itself is immutable
//	Scala has provided another data type, Lists.

//	Create a list with 3 integers
//	The type is List[Int]
val oneTwoThree = List(1,2,3)                     //> oneTwoThree  : List[Int] = List(1, 2, 3)

//	Create a list with 3 String, the type is List[String]
val niceWeather = List("Sunny","Warm","Fresh Air")//> niceWeather  : List[java.lang.String] = List(Sunny, Warm, Fresh Air)

//	::: is used to concatenation for lists
val oneTwo = List(1,2)                            //> oneTwo  : List[Int] = List(1, 2)
val threeFour = List ( 3,4)                       //> threeFour  : List[Int] = List(3, 4)
val fiveSix = List(5,6)                           //> fiveSix  : List[Int] = List(5, 6)
//	Concatenate the lists to format new lists
val oneTwoThreeFour= oneTwo ::: threeFour         //> oneTwoThreeFour  : List[Int] = List(1, 2, 3, 4)
val oneTwoThreeFourFiveSix = oneTwo ::: threeFour ::: fiveSix
                                                  //> oneTwoThreeFourFiveSix  : List[Int] = List(1, 2, 3, 4, 5, 6)


// Cons :: is used to insert a new element in a list
val oneOneTwo = 1 :: oneTwo                       //> oneOneTwo  : List[Int] = List(1, 1, 2)


//	Cons would be used to initialize new lists
//	In scala all operator are left operand, unless a column is inclued in name
//	Like Cons, it's right right operand
val ONETWOTHREE = 1 :: 2 :: 3 :: Nil              //> ONETWOTHREE  : List[Int] = List(1, 2, 3)
println(ONETWOTHREE)                              //> List(1, 2, 3)
//	The size of above List is 3, so Nil does not count
	println(ONETWOTHREE.size)                 //> 3

//  Although Append method is provided to Lists, it's seldom used
//	Because time to appned to a list grows linely with the size of the lists.
//	The reverse or ListBuffer plus toList.
//	Of course we could give an exmaple here

val fiveSixSeven = fiveSix :+ 7                   //> fiveSixSeven  : List[Int] = List(5, 6, 7)


// List has a rich library of methods, below is the example
// Define a String List
val thrill = "Will" :: "fill" :: "until" :: Nil   //> thrill  : List[java.lang.String] = List(Will, fill, until)


//print the element index 2
thrill(2)                                         //> res0: java.lang.String = until

//	Counts the numbers of strings that have length equlas to 4
thrill.count(s=>s.length == 4)                    //> res1: Int = 2

//	Return a list without the first 2 elements
thrill.drop(2)                                    //> res2: List[java.lang.String] = List(until)
//	Extends to return a list without the first 100 elements ( 100 is far beyond the size of list)
//	Empty list is return
thrill.drop(100)                                  //> res3: List[java.lang.String] = List()

//	dropRight returns the thrill list without its rightmost several alues
thrill.dropRight(2)                               //> res4: List[java.lang.String] = List(Will)
thrill.dropRight(10000)                           //> res5: List[java.lang.String] = List()

//	exists determines whether a certain value exits
thrill.exists(s=>s=="until")                      //> res6: Boolean = true
thrill.exists(s=>s=="after")                      //> res7: Boolean = false

// filter functions returns a lists of element
thrill.filter(s=>s.length ==4)                    //> res8: List[java.lang.String] = List(Will, fill)
thrill.filter(s=>s.length > 3)                    //> res9: List[java.lang.String] = List(Will, fill, until)
// Qustion: what is the difference between .length and .size
thrill.filter(s=>s.size == 4)                     //> res10: List[java.lang.String] = List(Will, fill)

// forall is a functional return boolean value
//	The criteria is whether every element meets a certain requirement
//	In this case, the criterial is element ends with a "l"
//	endsWith is a function provided by List.

thrill.forall(s=>s.endsWith("l"))                 //> res11: Boolean = true
//	Also you could change the critria of judging whether list elements size are equal to 4
thrill.forall(s=>s.size == 4)                     //> res12: Boolean = false

//	foreach method would execute on every element with what is defined
thrill.foreach(s=>print(s))                       //> Willfilluntil
//	It could also be written as below for simplicity
thrill.foreach(print)                             //> Willfilluntil

//	head method returns the first element of List
thrill.head                                       //> res13: java.lang.String = Will
//	last method returns the last element of List
thrill.last                                       //> res14: java.lang.String = until
//	tail method returns the list without its first element
thrill.tail                                       //> res15: List[java.lang.String] = List(fill, until)
//	init method returns the first 2 elements of the list
thrill.init                                       //> res16: List[java.lang.String] = List(Will, fill)

// So thrill.head and thril.tail makes a full List again!

println(thrill.head::thrill.tail)                 //> List(Will, fill, until)

//	isEmpty method return a boolean type, true if the List is empty
thrill.isEmpty                                    //> res17: Boolean = false

//	to determine how many elements there are in a list, length method is deployed here
thrill.length                                     //> res18: Int = 3

//	map method is used to do some tricks for elements in the list
thrill.map(s=>s+"y")                              //> res19: List[java.lang.String] = List(Willy, filly, untily)
thrill.map(s=>s+1)                                //> res20: List[java.lang.String] = List(Will1, fill1, until1)

// mkString is used to make a string with all elements in list
thrill.mkString(",")                              //> res21: String = Will,fill,until
thrill.mkString(" ")                              //> res22: String = Will fill until
// but empty parameter is not allowed. Why? The parenthesis is not necessary in this case
thrill.mkString                                   //> res23: String = Willfilluntil

//	remove methods would return a list, without the elements that meet the criteria
thrill.remove(s=>s.length==4)                     //> res24: List[java.lang.String] = List(until)
thrill.remove(s=>s.endsWith("l"))                 //> res25: List[java.lang.String] = List()

//	reverse method return a list in reverse order
thrill.reverse                                    //> res26: List[java.lang.String] = List(until, fill, Will)

//	Here we ends with the most exiciting function provided by List: sort
thrill.sort((s,t)=>s.charAt(0).toLower<t.charAt(0).toLower)
                                                  //> res27: List[java.lang.String] = List(fill, until, Will)
thrill.sort((s,t)=>s.charAt(0).toLower> t.charAt(0).toLower)
                                                  //> res28: List[java.lang.String] = List(Will, until, fill)



}