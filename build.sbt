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

//PlayKeys.devSettings += ("play.http.router", "sub.Routes")
