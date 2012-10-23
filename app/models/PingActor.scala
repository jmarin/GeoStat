package models

import akka.actor._
import akka.util.duration._

import play.api._
import play.api.libs.concurrent._

import org.geostat.agents._
import java.util.Calendar
import java.text.SimpleDateFormat


class PingActor extends Actor {

  def receive = {

    case PingMessage(true) => {
      println("Application is alive at " + Utils.getCurrentTime)
    }

    case PingMessage(false) => {
      println("Application is dead!!!")
    }

    case _ => {
      println("Message not recognized")

    }
  }
}
