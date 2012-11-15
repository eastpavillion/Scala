package chapter3

object read_from_file extends App{
	import scala.io.Source
	
//	def countchars(file:String){
//		if	( file.length > 0)
//		{
			for ( line <- Source.fromFile("/Users/lorrainemei/Scala/Scala/src/chapter3/countchars1.scala").getLines()) 
			println(line.length + " " +line)
//			}
			
//		else 
//			Console.err.println("Enter the filename")
//	}
	
	
//	countchars("countchars1.scala")
	
	
}