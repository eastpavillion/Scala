package design_pattern

object abstract_factory extends App {
  
  val maze = MazeGame.createMaze(MazeFactory())
  
  println(maze.toString)
  
  object Direction extends Enumeration {
    type Direction = Value
    val North, South, East, West = Value
  }
  
  case class Maze {
    var rooms = List[Room]()
    def addRoom(r: Room) = {
      rooms  = r :: rooms 
    }
    override def toString() = {
      rooms.mkString("")
    }
  }
  trait Side
  
  case class Wall extends Side
  
  import Direction._
  
  case class Room(val num: Int, val doorSide: Direction) {
    
    override def toString: String = {
      doorSide match {
        case North => "U"
        case East => "("
        case West => ")"
        case South => "n"
      }
    } 
  }
  case class Door(val r1: Room, val r2: Room) extends Side

  case class MazeFactory {
    def makeMaze(): Maze = Maze()
    def makeWall(): Wall = Wall()
    def makeRoom(n: Int, doorSide: Direction): Room = Room(n, doorSide)
    def makeDoor(r1: Room, r2: Room): Door = Door(r1, r2)
  }
  
//  object EnhencedMazeFactory extends MazeFactory {
//    // ...
//  }
  object MazeGame {
    def createMaze(factory: MazeFactory): Maze = {
      val aMaze = factory.makeMaze
      val r1 = factory.makeRoom(1, West)
      val r2 = factory.makeRoom(2, East)
      val aDoor = factory.makeDoor(r1, r2)
      aMaze.addRoom(r1)
      aMaze.addRoom(r2)
      
      
      
      aMaze
    }
  }
}