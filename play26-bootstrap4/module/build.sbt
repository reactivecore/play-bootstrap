name := """play-bootstrap"""

version := "1.4-P26-B4-0"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.12.4", "2.11.12")

resolvers ++= Seq(
  "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  filters % "provided",
  "net.reactivecore" %% "play-bootstrap-core" % "1.4-P26-0",
  specs2 % Test
)

lazy val root = (project in file(".")).enablePlugins(PlayScala).disablePlugins(PlayFilters)



scalariformSettings

//*******************************
// Maven settings
//*******************************

organization := "net.reactivecore"

description := "This is a collection of input helpers and field constructors for Play Framework to render Bootstrap HTML code."

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/reactivecore/play-bootstrap</url>
    <licenses>
      <license>
        <name>Apache License, Version 2.0</name>
        <url>https://www.apache.org/licenses/LICENSE-2.0.html</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:@github.com:reactivecore/play-bootstrap.git</connection>
      <url>git@github.com:reactivecore/play-bootstrap.git</url>
    </scm>
    <developers>
      <developer>
        <id>nob13</id>
        <name>Norbert Schultz</name>
        <url>https://www.reactivecore.de</url>
      </developer>
    </developers>
)
