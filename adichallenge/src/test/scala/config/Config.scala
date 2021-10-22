package config

object Config {

  val app_url = "http://localhost:3001/product"

  val users = Integer.getInteger("users", 500).toInt
  val rampUp = Integer.getInteger("rampup", 10).toInt

}