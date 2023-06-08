lazy val root = project
  .in(file("."))
  .settings(
    name := "xef-in-action",
    description := "Example project with xef.ai library",
    version := "0.0.1",
    scalaVersion := "3.3.0",
    scalacOptions ++= Seq("-deprecation"),
    libraryDependencies += "com.xebia" %% "xef-scala-cats" % "0.0.2-alpha.4"
  )
