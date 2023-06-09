import sbt.*

object Dependencies {

  object Versions {
    val ScalaVersion = "3.3.0"

    val XefVersion = "0.0.2-alpha.7"
    val CatsVersion = "3.6-0142603"
  }

  object Libraries {
    import Versions.*

    val XefCore = "com.xebia" %% "xef-scala" % XefVersion
    val XefCats = "com.xebia" %% "xef-scala-cats" % XefVersion
    val CatsEffect = "org.typelevel" %% "cats-effect" % CatsVersion
  }

}
