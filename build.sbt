name := "spark-sample"

version := "0.1"

scalaVersion := "2.11.12"

resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % "2.4.4")
