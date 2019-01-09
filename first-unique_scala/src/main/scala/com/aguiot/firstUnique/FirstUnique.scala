package com.aguiot.firstUnique

object FirstUnique {
  def firstUnique(str: String): Option[Char] = {
    str.indices.find(isUnique(_, str)) match {
      case Some(i) => Some(str(i))
      case None => None
    }
  }

  def isUnique(pos: Int, str: String): Boolean = {
    for {
      i <- 0 until str.length
      if i != pos
    } {
      if (str(i) == str(pos)) return false
    }
    true
  }
}
