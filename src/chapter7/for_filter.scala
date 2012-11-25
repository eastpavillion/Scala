package chapter7


object for_filter extends App{
	val filesHere = (new java.io.File(".")).listFiles
                                                  //> filesHere  : Array[java.io.File] = Array(./eclipse, ./eclipse.ini)
	
	for ( file <- filesHere if file.getName.endsWith(".scala")) println(file)
}