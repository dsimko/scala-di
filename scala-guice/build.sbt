name := "scala-guice"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq (
	"com.google.inject" % "guice" % "3.0",
	"org.scalatest" %% "scalatest" % "1.8" % "test"
)