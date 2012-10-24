package models

import java.text.SimpleDateFormat
import java.util.Calendar

object Utils {

  def getCurrentTime(): String = {
    val dateFormat = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy")
    dateFormat.format(Calendar.getInstance().getTime())
  }

}
