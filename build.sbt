name := """play-scala-seed"""
organization := "Unousdfasdfjkunifasdfdjjuno-WebApp"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "Unousdfasdfjkunifasdfdjjuno-WebApp.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "Unousdfasdfjkunifasdfdjjuno-WebApp.binders._"
