package org.geostat.agents

import org.joda.time.DateTime

abstract class Message

case class PingMessage(isAlive: Boolean) extends Message

sealed trait Status {def name:String}

case object WAITING extends Status {val name = "WAITING"}
case object RUNNING extends Status {val name = "RUNNING"}
case object CANCELLING extends Status {val name = "CANCELLING"}
case object FAILED extends Status {val name = "FAILED"}
case object FINISHED extends Status {val name = "FINISHED"}
case object CANCELLED extends Status {val name = "CANCELLED"}
case object INTERRUPTED extends Status {val name = "INTERRUPTED"}

sealed trait Category {def name:String}

case object OWS extends Category {val name = "OWS"}
case object REST extends Category {val name = "REST"}
case object OTHER extends Category {val name = "OTHER"}

case class RequestData(id:Long, status:Status, category:Category, path:String, queryString:String, httpMethod:String, startTime:DateTime, endTime:DateTime, totalTime:Long, remoteAddress:String, remoteHost:String, internalHost:String, remoteUser:String, remoteUserAgent:String, remoteCountry:String, remoteCity:String, remoteLatitude:Double, remoteLongitude:Double, service:String, operation:String, owsOperation:String, subOperation:String, responseContentType:String, errorMessage:String)



