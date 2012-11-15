package chapter2



object step5_loop_if {
// An exmaple function in step5
// Below methods takes parameter with type Array[String] to simulate a command line input
// When the index is smaller thant array size, the element in the array would be printed.
// Because println is used here, so after each element a new line is launched
	def example(args:Array[String]){
		var i = 0
		while ( i < args.length){
		
			println(args(i))
			i += 1
		}
	}                                         //> example: (args: Array[String])Unit

	
// Define an immutable variable lorraine here
	val lorraine = Array("Odeussea",",","scala is fun!")
                                                  //> lorraine  : Array[java.lang.String] = Array(Odeussea, ,, scala is fun!)
// Call example function, given parameter lorraine
	example(lorraine)                         //> Odeussea
                                                  //| ,
                                                  //| scala is fun!
                                                  
// Re-write the function to make arguments printed in the same line
                                                
	def example2(args:Array[String]){
	var i = 0
	while (i < args.length){
// The if sentence inserts a space into each element
// example2(wuwen) would be Scalaissimple if commenting out these 2 lines

		if ( i != 0)
			print(" ")
		print(args(i))
		i += 1
	}
// println() here is essential, otherwise there is no printout result
	println()
	}                                         //> example2: (args: Array[String])Unit

	example2(lorraine)                        //> Odeussea , scala is fun!

	val wuwen = Array("Scala","is","simple")  //> wuwen  : Array[java.lang.String] = Array(Scala, is, simple)
	
	example2(wuwen)                           //> Scala is simple
	
	
}