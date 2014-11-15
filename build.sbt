sbtPlugin := true

organization := "com.ticketfly"

name := "sbt-thrift"

version := "0.8-SNAPSHOT"

credentials += Credentials(Path.userHome / ".artifactory" / ".credentials" )

publishTo := {
  if ( version.value.trim.endsWith("SNAPSHOT") )
    Some("tfly-snaps" at "http://build.ticketfly.com/artifactory/libs-snapshot-local")
  else
    Some("tfly-release" at "http://build.ticketfly.com/artifactory/libs-release-local")
}

