package scenarios

import requests.{ProductServicesRequest}
import io.gatling.core.Predef.scenario

object ProductServicesScenarios {

  val productServicesScenarios=scenario("Get product")
    .exec(ProductServicesRequest.productServices_getProducts)





}
