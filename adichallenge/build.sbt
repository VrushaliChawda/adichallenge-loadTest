import Dependencies._

enablePlugins(GatlingPlugin)

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "com.adidas",
      scalaVersion := "2.13.6",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "adichallenge-loadtest",
    libraryDependencies ++= gatling
  )
