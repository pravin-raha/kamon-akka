package com.example

import akka.actor.{Actor, ActorSystem, Props}
import kamon.Kamon

/**
  * Created by synerzip on 9/8/17.
  */
object AutomaticTraceContextPropagationWithFutures extends App {
  Kamon.start()

  val system = ActorSystem("test")

  val pinger = system.actorOf(Props(new Actor {
    def receive: Actor.Receive = {
      case "pong" ⇒ sender ! "ping"
    }
  }), "pinger")

  val ponger = system.actorOf(Props(new Actor {
    def receive: Actor.Receive = {
      case "ping" ⇒ sender ! "pong"
    }
  }), "ponger")

  pinger.tell("pong", ponger)

}

class DumbActor extends Actor {
  def receive = {
    case "hello" => {
      println("world")
      sender ! "world"
    }
    case other =>
  }
}

