name := "activator-play-slick"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.2" // or "2.10.4"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0",
  "com.typesafe.play" %% "play-slick" % "0.8.0"
)

fork in Test := false

lazy val root = (project in file(".")).enablePlugins(PlayScala)