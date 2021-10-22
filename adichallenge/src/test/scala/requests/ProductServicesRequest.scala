package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import config.Config.{app_url}

object ProductServicesRequest {

  val productServices_getProducts =exec(http("Get Products")
    .get(app_url)
    .check(status is 200))
    .pause(5)

}
