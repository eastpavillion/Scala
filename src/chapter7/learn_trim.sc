package chapter7

object learn_trim {
  val file = List("     what ever", "----   how   ")
                                                  //> file  : List[java.lang.String] = List("     what ever", "----   how   ")
  for ( line <- file)
//  	println(line.trim)
  	if (line.trim.matches("what ever"))
  		println(line)                     //>      what ever
  	
                                                  
                                                  
}