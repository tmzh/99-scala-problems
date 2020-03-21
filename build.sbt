import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.github.tmzh"
ThisBuild / organizationName := "Tamizh"

lazy val root = (project in file("."))
  .settings(
    name := "99-scala-problems",
    libraryDependencies += scalaTest % Test
  )
