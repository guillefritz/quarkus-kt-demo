package ar.gmf.infra

import ar.gmf.domain.FruitActions
import ar.gmf.domain.FruitsRepo
import javax.enterprise.context.Dependent
import javax.enterprise.inject.Produces

@Dependent
class Config {

    @Produces
    fun fruitActions(fruitsRepo: FruitsRepo) = FruitActions(fruitsRepo)

}

