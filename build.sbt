name := "eg_slick_repo_with_join"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies ++= {
  val akkaV = "2.5.17"
  val akkaHttpV = "10.1.3"
  val slickV = "3.2.3"
  val spec2 = "4.3.5"
  Seq(
    "com.typesafe.akka"   %%  "akka-http"    % akkaHttpV,
    "com.typesafe.akka"   %%  "akka-http-core"    % akkaHttpV,
    "com.typesafe.akka"   %%  "akka-http-testkit" % akkaHttpV,
    "com.typesafe.akka"	  %%  "akka-http-spray-json"	% akkaHttpV,
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.byteslounge" %% "slick-repo" % "1.4.3",
    "com.github.swagger-akka-http" %% "swagger-akka-http" % "0.11.0",
    "ch.megard" %% "akka-http-cors" % "0.2.1",
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % spec2 % "test",
    "org.specs2"          %%  "specs2-mock"   % spec2  ,
    "org.scalatest" %% "scalatest" % "3.0.5" % "test" ,
    "junit" % "junit" % "4.11" % "test",
    "com.typesafe.slick" %% "slick" % slickV,
    "com.typesafe.slick" %% "slick-hikaricp" % slickV,
    "com.typesafe" % "config" % "1.2.1",
    "com.h2database" % "h2" % "1.3.175",
    "org.postgresql" % "postgresql" % "42.1.4",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0",
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "org.slf4j" % "slf4j-nop" % "1.6.4"
  )
}
