import play.api._
import play.api.libs.concurrent._
import play.api.libs.concurrent.Akka._
import play.api.Play.current
import akka.actor.Actor
import akka.actor.Props
import models.PingActor
import org.geostat.agents._
import akka.util.duration._

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    Logger.info("GeoStat starting")
    val pingActor = Akka.system.actorOf(Props[PingActor], name = "pingActor")

    val aliveMessage = PingMessage(true)

    val deadMessage = PingMessage(false)

    system.scheduler.schedule(0 milliseconds, 60000 milliseconds, pingActor, aliveMessage)
  }

  override def onStop(app: Application) {
   // pingActor ! deadMessage
    Logger.info("GeoStat stopping")
  }

}
