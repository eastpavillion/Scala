package chapter4

import ChecksumAccumulator.calculate

object summer extends App {
	for (season <- List("fall", "winter", "spring"))
            println(season +": "+ calculate(season))
}