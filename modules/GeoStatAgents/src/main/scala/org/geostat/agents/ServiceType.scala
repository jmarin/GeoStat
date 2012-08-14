package org.geostat.agents

sealed trait ServiceType { def name: String }
case class WMS extends ServiceType { val name = "WMS" }
case class WFS extends ServiceType { val name = "WFS" }
case class WCS extends ServiceType { val name = "WCS" }
case class WPS extends ServiceType { val name = "WPS" }

