import sbt._
import Keys._

object GeoStatBuild extends Build {
  
  lazy val root = Project(id="GeoStat", 
			base = file(".")) aggregate(geoStatWeb,geoStatPlugins)

  lazy val geoStatWeb = Project(id="geoStatWeb", 
			base = file("GeoStatWeb"))

  lazy val geoStatPlugins = Project(id="geoStatAgents", 
			base = file("GeoStatAgents"))


}
