package com.foo

import akka.actor._
import spray.routing.HttpServiceActor
import scala.concurrent.duration._
import akka.io.IO
import spray.can.Http
import akka.actor.OneForOneStrategy

object Bla extends App {
  val system = ActorSystem("bla-system")
  val interface = system.settings.config getString "http.interface"
  val port = system.settings.config getInt "http.port"
  val timeout = Duration(system.settings.config getMilliseconds "http.timeout", MILLISECONDS)

  IO(Http)(system) ! Http.Bind(system.actorOf(Props(new BlaService), "bla-service"), interface, port)

/*
  readLine(f"Press ENTER to exit ...%n")
  system.shutdown()
*/
}

class BlaService extends HttpServiceActor with ActorLogging {

  override def receive: Receive =
    runRoute(statics)

  def statics =
    path("")(getFromResource("www/index.html")) ~ getFromResourceDirectory("www")

  override def supervisorStrategy =
    OneForOneStrategy() { case _ => SupervisorStrategy.Stop }
}
