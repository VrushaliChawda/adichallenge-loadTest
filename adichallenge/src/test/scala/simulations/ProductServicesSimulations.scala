package simulations

import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import config.Config.users
import scenarios.ProductServicesScenarios

class productServiceSimulations extends Simulation{

  private val productServiceSimulator= ProductServicesScenarios.productServicesScenarios
    .inject(constantUsersPerSec(1000).during(60))

  setUp(productServiceSimulator)

}
