package org.geostat.plugins

import org.joda.time.DateTime

sealed abstract case class Message

case class PingMessage (isAlive:Boolean)

case class OWSMessage(requestId: Long, serviceType: ServiceType, version: String, operation: String, suboperation: String, resources: String, path: String, queryString: String, httpMethod: String, startTime: DateTime, endTime: DateTime, totalTime: Long, remoteAddress: String, remoteHost: String, host: String, user: String, responseStatus: String, responseContentType: String, failed: Boolean) extends Message {
}

