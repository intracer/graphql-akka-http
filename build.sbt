name := "graphql-akka-http"

version := "1.0"

description := "GraphQL server with akka-http and sangria"

scalaVersion := "2.12.2"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies ++= Seq(
  "org.sangria-graphql" %% "sangria" % "4.1.1",
  "org.sangria-graphql" %% "sangria-spray-json" % "1.0.3",
  "com.typesafe.akka" %% "akka-http" % "10.0.7",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.7",

  "com.typesafe.slick" %% "slick" % "3.2.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0",
  "com.h2database" % "h2" % "1.4.193",

  "org.scalatest" %% "scalatest" % "3.0.9" % Test
)

Revolver.settings
