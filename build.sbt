name := "dynamic-reports-sample"

version := "0.01"

scalaVersion := "2.11.8"

libraryDependencies += "net.sourceforge.dynamicreports" % "dynamicreports-core" % "4.1.1"

unmanagedJars in Runtime += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/rt.jar"))

