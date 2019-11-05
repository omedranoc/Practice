val inmutable
var mutable
+ Expression oriented programing: every expression that you write returns a value.
+ match: it is like a switch statement
+ Any is like an object in java
+ Options container with 2 options
    + some()
    + none()
+ nil: represents an empty list or anything of zero length.
+ unit: Type of method that does not return a value of any sort
+ Actor model design goals:
    + reduce scope for concurrency programming bugs
    + loosely coupled
    + Separation of concerns between business logic and failure recovery
    +
+ Akka: multitheading framework used for non blocking operations, send message such as telefone and anybody can answer it
    + an actor: a concurrent  object that receives and messages and have the  following behaviour:
        + sending messages
        + changing its state
        + changing its behavior
        + creating more actors
    + actor vs completableFuture
        + completableFutures: is about flow of functions
    + Props provide configuration options for an actor including constructor   
    + Supervision hierarchy: leave the actor to crash and use a hig level strategy to recover such as restart, try again
+ Testing: Scalatest/Spec2/ScalaCheck