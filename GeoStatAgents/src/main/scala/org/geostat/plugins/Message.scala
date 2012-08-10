package org.geostat.plugins {

  import org.joda.time.DateTime

  sealed abstract case class Message

  case class OWSMessage(serviceType: String, url: String, queryParams: Map[String, String], date: DateTime, responseTime: Long,
    isGeospatial: Boolean, hasFailed: Boolean) extends Message {
  }

}
