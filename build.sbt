ThisBuild / organization := "play-test"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.1"

name := """sub"""
organization := "play-test-sub"

version := "1.0-SNAPSHOT"

lazy val sub = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies += guice

libraryDependencies += javaJdbc

libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.17"

libraryDependencies ++= Seq(
  javaJpa,
  "org.hibernate" % "hibernate-core" % "5.4.2.Final"
)




//PlayKeys.devSettings += ("play.http.router", "sub.Routes")
