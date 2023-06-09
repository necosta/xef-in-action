import cats.effect.{IO, IOApp}
import com.xebia.functional.xef.scala.kotlin.CoroutineToIO
import com.xebia.functional.xef.scala.auto.*
import io.circe.Decoder

private final case class Colors(colors: List[String]) derives SerialDescriptor, Decoder

object Cats extends IOApp.Simple {
  val run: IO[Unit] = for {
    _ <- IO.println("Running...")
    res <- CoroutineToIO[IO].runCancelable[Colors] { (_, cont) =>
      ai {
        prompt[Colors]("A selection of 3 beautiful color names that go well together")
      }
    }
    _ <- IO.println(res.colors.mkString(", "))
    _ <- IO.println("Done")
  } yield ()
}
