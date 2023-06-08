
import com.xebia.functional.xef.scala.auto.*
import io.circe.Decoder

private final case class ASCIIArt(art: String) derives SerialDescriptor, Decoder
@main def runAsciiArt(): Unit = {
  lazy val asciiArt =  ai {
    prompt[ASCIIArt]("ASCII art of a sleeping cat")
  }
  println(asciiArt.art.getOrElse(ex => ASCIIArt("¯\\_(ツ)_/¯" + "\n" + ex.getMessage).art))
}
