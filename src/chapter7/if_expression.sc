package chapter6

object if_expression {
	val filename =
		if (!args.isEmpty) args(0)
		else "defautl.txt"                //> filename  : <error> = defautl.txt
}