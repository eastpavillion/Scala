package chapter7

object grep extends App {
  val filesHere = (new java.io.File("/Users/lorrainemei/Prog_Scala/src/chapter6")).listFiles

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String) =
    for (
      file <- filesHere if file.getName.endsWith(".sc");
      line <- fileLines(file) if line.trim.matches(pattern)
    ) println(file + ": " + line.trim)

  //Debugging line since there is no result after running the program
  println(filesHere mkString "\n")

  grep(".*gcd.*")
}
