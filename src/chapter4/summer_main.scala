package chapter4

// Import CheckAccumulator.calculate so that we could use calculate fucntion very neatly
import ChecksumAccumulator.calculate

object summer_main {
  def main(args: Array[String]){
    for (arg <- args )
      println(arg + ": " + calculate(arg))
  }

}
