import sbt._

object Dependencies {

    object Spark {
        val org     = "org.apache.spark"
        val version = "$sparkVersion$"
        val core    = org %% "spark-core" % version
        val sql     = org %% "spark-sql" % version
        val hive    = org %% "spark-hive" % version
    }  

    lazy val delta = "io.delta" %% "delta-spark" % "$deltaLakeVersion$"

    lazy val log4j = "log4j" % "log4j" % "1.2.17"

    lazy val scalaTest = "org.scalatest"   %% "scalatest"          % "3.2.11"

}