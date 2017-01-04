name := "sbt-example"
organization := "org.scalamacros"
version := "2.0.0"

crossScalaVersions in ThisBuild := Seq("2.11.8", "2.12.1")
scalaVersion in ThisBuild := crossScalaVersions.value.head

run := (run in Compile in core).evaluated

lazy val macros = project settings (
 libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
)

lazy val core = project dependsOn macros
