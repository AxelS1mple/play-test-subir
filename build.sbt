name := """play-test"""
organization := "com.example"
version := "1.0-SNAPSHOT"

scalaVersion := "2.13.16"

// Asegúrate de habilitar el plugin de Play
lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies += guice

javacOptions ++= Seq("-source", "17", "-target", "17")

Compile / compile / javacOptions ++= Seq("-source", "17", "-target", "17")

mainClass in Compile := Some("play.core.server.ProdServerStart")