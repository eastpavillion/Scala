package chapter3

object step10_mutable_map {
//	Import the mutable map package
import scala.collection.mutable.Map

//	Define an empty val , type is Map, with element[Int,String]
val treasureMap = Map[Int,String]()               //> treasureMap  : scala.collection.mutable.Map[Int,String] = Map()


//	Below codes initialize the elements
treasureMap += (1 -> "Go to island")              //> res0: chapter3.step10_mutable_map.treasureMap.type = Map(1 -> Go to island)
                                                  //| 
treasureMap += (2 -> "Find big X on ground.")     //> res1: chapter3.step10_mutable_map.treasureMap.type = Map(1 -> Go to island, 
                                                  //| 2 -> Find big X on ground.)
treasureMap += (3 -> "Dig")                       //> res2: chapter3.step10_mutable_map.treasureMap.type = Map(3 -> Dig, 1 -> Go t
                                                  //| o island, 2 -> Find big X on ground.)

//	Print the whole treasure map
println(treasureMap)                              //> Map(3 -> Dig, 1 -> Go to island, 2 -> Find big X on ground.)
//	Print the 2nd element of treasure map
println(treasureMap(2))                           //> Find big X on ground.

}