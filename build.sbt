import Dependencies.*

lazy val root = project
  .in(file("."))
  .settings(
    name := "xef-ai-in-action",
    scalaVersion := Versions.ScalaVersion,
    scalacOptions ++= Seq("-deprecation"),
    libraryDependencies ++= Seq(
      Libraries.XefCore,
      Libraries.XefCats,
      Libraries.CatsEffect
    )
  )
