name := "kamon-akka"

version := "1.0"

scalaVersion := "2.11.11"

resolvers += Resolver.bintrayRepo("kamon-io", "releases")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.2",
  "com.typesafe.akka" %% "akka-slf4j" % "2.5.2",
  "io.kamon" %% "kamon-core" % "0.6.7",
  "io.kamon" %% "kamon-akka-2.5" % "0.6.7",
  "io.kamon" %% "kamon-log-reporter" % "0.6.8",
  "io.kamon" %% "kamon-statsd" % "0.6.7",
  "io.kamon" %% "kamon-system-metrics" % "0.6.7",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
