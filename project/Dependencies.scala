import sbt._

object Libraries {

  // Versions
  val akkaVersion = "2.2.0"
  val logbackVersion = "1.0.13"
  val sprayVersion = "1.2-20130719"
  val sprayJsonVersion = "1.2.5"
  val scalazVersion = "7.0.0"



  // Libraries
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % akkaVersion
  val logbackClassic = "ch.qos.logback" % "logback-classic" % logbackVersion
  val sprayCan = "io.spray" % "spray-can" % sprayVersion
  val sprayRouting = "io.spray" % "spray-routing" % sprayVersion
  val sprayJson = "io.spray" %% "spray-json" % sprayJsonVersion
  val pickling = "org.scala-lang" %% "scala-pickling" % "0.8.0-SNAPSHOT"
  val slick = "com.typesafe.slick" %% "slick" % "1.0.1"
  val h2 = "com.h2database" % "h2" % "1.3.166"
  val specs2 =  "org.specs2" %%  "specs2" % "1.14" % "test"
  val newman =       "com.stackmob" %% "newman" % "0.23.0-SNAPSHOT"
  val scalazCore = "org.scalaz" %% "scalaz-core" % scalazVersion
  val scalazEffect = "org.scalaz" %% "scalaz-effect" % scalazVersion
  val scalazConcurrent = "org.scalaz" %% "scalaz-concurrent" % scalazVersion
  val sprayClient =       "io.spray" % "spray-client" % sprayVersion
  val scalatest = "org.scalatest" %% "scalatest" % "1.9.1" % "test"
  val scalacheck = "org.scalacheck" %% "scalacheck" % "1.10.1" % "test"

}

object Dependencies {

  import Libraries._

  val deps = List(
    akkaActor,
    akkaSlf4j,
    logbackClassic,
    sprayCan,
    sprayRouting,
    sprayJson,
    pickling,
    slick,
    h2
  )
}
