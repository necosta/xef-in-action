lazy val root = project
  .in(file("."))
  .settings(
    name := "xef-ai-in-action",
    scalaVersion := "3.3.0",
    scalacOptions ++= Seq("-deprecation"),
    libraryDependencies += "com.xebia" %% "xef-scala" % "0.0.2-alpha.4"
  )
