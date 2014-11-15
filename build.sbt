sbtPlugin := true

organization := "com.ticketfly"

name := "sbt-thrift"

version := "0.8.1"

credentials += Credentials(Path.userHome / ".artifactory" / ".credentials" )

publishTo := Some("tfly-scala" at "http://build.ticketfly.com/artifactory/libs-scala-release-local")

