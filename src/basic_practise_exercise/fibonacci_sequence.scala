package basic_practise_exercise

object fibonacci_sequence extends App {

// Generate the nth number of fibonacci number by recursion WoW

  def fib_gen (n:Int) : Int = n match {
    case 0 | 1 => n
    case _ => fib_gen(n-1) + fib_gen(n-2)
  }
}