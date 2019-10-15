package ar.gmf.infra

import ar.gmf.domain.Fruit
import ar.gmf.domain.FruitsRepo
import javax.enterprise.context.ApplicationScoped
import kotlin.random.Random
import kotlin.random.nextInt

@ApplicationScoped
class FruitsRepoInMemory : FruitsRepo {
    private val fruits: MutableMap<String, Fruit> = mutableMapOf()
    override fun findAll(): List<Fruit> = fruits.values.toList()
    override fun findById(id: String) = fruits[id]
    override fun save(fruit: Fruit): Fruit {
        if (fruit.id == null) {
            fruit.id = Random.nextInt(99999..9999999).toString()
        }
        fruits[fruit.id.toString()] = fruit
        return fruit
    }
}