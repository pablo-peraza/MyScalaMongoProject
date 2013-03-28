name := "hello"

version := "1.0"

scalaVersion := "2.9.2"

organization := "com.ciriscr.myscalamongoproject"

libraryDependencies ++= Seq(
  "org.mongodb" %% "casbah" % "2.5.1",
  "com.novus" %% "salat" % "1.9.1"
)
