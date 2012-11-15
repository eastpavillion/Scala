package chapter3

object learn_functional_style {
//	scala is a programming language that combines functional and imperative style
//	var is a very taletell signal for imperative style of coding

def imperativeSytle(args:Array[String])={
	var i = 0
	while ( i < args.length)
	{
		println(args(i))
		
//	increasement of 1 is very important! Otherwise the while cannot be stopped!
		
	i += 1
	}
}                                                 //> imperativeSytle: (args: Array[String])Unit

imperativeSytle(Array("one","two","three"))       //> one
                                                  //| two
                                                  //| three


//	To evolve to functional style, the code could be written as below
def transToFunc1(args:Array[String])={
	for (args <- args)
		println(args)
}                                                 //> transToFunc1: (args: Array[String])Unit
transToFunc1(Array("one","two","three"))          //> one
                                                  //| two
                                                  //| three
                                                  
//	And also this
//	foreach is a methods provided by args

def transToFunc2(args:Array[String])={
	args.foreach(println)
}                                                 //> transToFunc2: (args: Array[String])Unit

// Below is very functional style, using mkString so as to avoid side effect of println
def funcStyle(args:Array[String])= args.mkString("\n")
                                                  //> funcStyle: (args: Array[String])String

val res = Array("one","two","three")              //> res  : Array[java.lang.String] = Array(one, two, three)

println(funcStyle(res))                           //> one
                                                  //| two
                                                  //| three
                                                  
// The typical functional style is good for assertion
//	Assertion would return quitely if it's true, but throws an error for warning when false.
//	So it's very convenient for verify the code
val res1 = funcStyle(Array("what","is","functional"))
                                                  //> res1  : String = what
                                                  //| is
                                                  //| functional
assert (res1 == "what\nis\nfunctional")


}