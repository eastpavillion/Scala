package chapter3

object step9_tuple {
 // Like List, tuple is also an immutable type
 
 // We define a tuple with String and Integer.
 val ageTuple = ("John", 29)                      //> ageTuple  : (java.lang.String, Int) = (John,29)
 
 // The element could be visited by _.index ( index starts from 1)
 println(ageTuple._1)                             //> John
 println(ageTuple._2)                             //> 29
 
 //	Tuple could contain to 22 upmost
 val maxTuple = ("John", 29, "Lisa", 14, " Annica", 44, "Johanson", 28, "Christof",46,"Vivian",31,"Magnus",35,"Benny",57,"Nina",33,"Targia",30,"Andersson",36)
                                                  //> maxTuple  : (java.lang.String, Int, java.lang.String, Int, java.lang.String,
                                                  //|  Int, java.lang.String, Int, java.lang.String, Int, java.lang.String, Int, j
                                                  //| ava.lang.String, Int, java.lang.String, Int, java.lang.String, Int, java.lan
                                                  //| g.String, Int, java.lang.String, Int) = (John,29,Lisa,14," Annica",44,Johans
                                                  //| on,28,Christof,46,Vivian,31,Magnus,35,Benny,57,Nina,33,Targia,30,Andersson,3
                                                  //| 6)
 
 // Could tuple contain list also?
 val testList = 1::2::Nil                         //> testList  : List[Int] = List(1, 2)
 
 //	Yes, Tuple could support complex types
 val complexTuple = ("John", testList)            //> complexTuple  : (java.lang.String, List[Int]) = (John,List(1, 2))
 
 
 // Could tuple contain tuple itself?
 // The answer is yes. tuple is really a very accommodating type!
 val tupleTuple = (maxTuple, ageTuple)            //> tupleTuple  : ((java.lang.String, Int, java.lang.String, Int, java.lang.Stri
                                                  //| ng, Int, java.lang.String, Int, java.lang.String, Int, java.lang.String, Int
                                                  //| , java.lang.String, Int, java.lang.String, Int, java.lang.String, Int, java.
                                                  //| lang.String, Int, java.lang.String, Int), (java.lang.String, Int)) = ((John,
                                                  //| 29,Lisa,14," Annica",44,Johanson,28,Christof,46,Vivian,31,Magnus,35,Benny,57
                                                  //| ,Nina,33,Targia,30,Andersson,36),(John,29))
                                   
                                 
 
println(tupleTuple._1)                            //> (John,29,Lisa,14, Annica,44,Johanson,28,Christof,46,Vivian,31,Magnus,35,Benn
                                                  //| y,57,Nina,33,Targia,30,Andersson,36)
}