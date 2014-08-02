import sbt._
import Keys._

object Dalvik extends Build {
  lazy val dx = Project("dx", file("dx/"), settings = dSettings)

  lazy val dSettings= Defaults.defaultSettings ++ Seq(
    name         := "DalvikExchange",
    unmanagedSourceDirectories in Compile <+= baseDirectory / "src"
  )
}
