name := "activator-play-slick"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.2",
  "com.typesafe.play" %% "play-slick" % "0.7.0-M1"
)

fork in Test := false

lazy val root = (project in file(".")).enablePlugins(PlayScala)