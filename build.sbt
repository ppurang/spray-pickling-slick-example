organization := "com.foo"

name := "bla"

version := "1.0.0"

scalaVersion := "2.10.2"

resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "spray nightlies repo" at "http://nightlies.spray.io"

resolvers += Resolver.sonatypeRepo("snapshots")

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

libraryDependencies ++= Dependencies.deps

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-language:_",
  "-feature",
  "-encoding", "UTF-8"
)

atmosSettings

seq(Revolver.settings: _*)

logBuffered := false

