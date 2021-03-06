name := """bitly-for-inbox"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "com.google.code.gson" % "gson" % "2.3",
  "com.rosaloves" % "bitlyj" % "2.0.0",
  "com.google.http-client" % "google-http-client" % "1.19.0",
  "com.google.http-client" % "google-http-client-jackson" % "1.19.0"
  )
