package chapter2

object variables{
// There are two types of varialbes, val and vars.
// Val is more frequently used in scala. Once it's initialized, it cannot be reassinged.

// Give val msg a value
val msg = "Hello, Odeussea!"                      //> msg  : java.lang.String = Hello, Odeussea!
//Print out the val msg
println(msg)                                      //> Hello, Odeussea!

// Reassign it would cause error "Reassing to val!"
//msg = "Hello, Lorraine!"

// var could be reassigned through it's lifetime.
// Give var msg2 a value
var msg2 = "Hello, Odeussea!"                     //> msg2  : java.lang.String = Hello, Odeussea!
// Print out the var msg
println(msg2)                                     //> Hello, Odeussea!
// Reassign the var msg2
msg2 = "Hello, Lorraine!"
// Print the reassigned msg2
println(msg2)                                     //> Hello, Lorraine!

// The return value of variable could be explictly written when defined
val msg3:String = "Hello, Uncle Mario!"           //> msg3  : String = Hello, Uncle Mario!
println(msg3)                                     //> Hello, Uncle Mario!

// The return value type could be written in a full format
val msg4:java.lang.String = "Hello, Justin!"      //> msg4  : java.lang.String = Hello, Justin!
println(msg4)                                     //> Hello, Justin!

}

// This object illustrates different ways to define variables
// Question: Why sentences in below objects are not executed?

object explict{
// The return value of variable could be explictly written when defined
var msg3:String = "Hello, Uncle Mario!"
println(msg3)

}