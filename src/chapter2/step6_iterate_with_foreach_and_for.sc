package chapter2

object step6_iterate_with_foreach_and_for {
// Rewrite functions in step5 in a functional style
// In function body foreach is used, and gives each args to printout

	def fun1(args:Array[String]){
		args.foreach(args => println(args))
		}                                 //> fun1: (args: Array[String])Unit
		
	val odeussea = Array("Play","with","scala")
                                                  //> odeussea  : Array[java.lang.String] = Array(Play, with, scala)
	
	fun1(odeussea)                            //> Play
                                                  //| with
                                                  //| scala
// In fun2 , a new operator "<-" is inroduced
// <- means "for args in args"
// The whatever here is val, not var. If it's a var, you must write it explicitly as "var args"

	def fun2(whatever:Array[String]){
	 for (whatever <- whatever)
	 	println(whatever)
	}                                         //> fun2: (whatever: Array[String])Unit
	
	fun2(odeussea)                            //> Play
                                                  //| with
                                                  //| scala
// func3 is a shorthanded of scala for fun1, which would be explained in Chapter8.6
// It's called a partially applied function
	def fun3(args:Array[String]){
	args.foreach(println)}                    //> fun3: (args: Array[String])Unit
	
	fun3(odeussea)                            //> Play
                                                  //| with
                                                  //| scala
}