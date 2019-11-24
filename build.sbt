name := """play-test-sub"""
organization := "play-test-sub"

version := "1.0-SNAPSHOT"

lazy val sub = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies += guice

PlayKeys.devSettings += ("play.http.router", "sub.Routes")
