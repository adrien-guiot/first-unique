package com.aguiot.firstUnique

object Main extends App {
  if (args.length == 0)
    println("I need at least one argument")
  args.foreach(str => FirstUnique.firstUnique(str) match {
    case Some(c) =>
      println(s"first unique character in ${str} : ${c}")
    case None =>
      println(s"first unique character in ${str} : none")
  })

}
