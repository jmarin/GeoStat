import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "GeoStat"
    val appVersion      = "0.1-SNAPSHOT"


    val geoStatAgents = Project("geoStatAgents", file("modules/GeoStatAgents"))

    val appDependencies = Seq(
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    ).dependsOn(geoStatAgents)

}
