package ar.gmf.domain

class FruitActions(private val fruitsRepo:FruitsRepo) {
    fun findAll():List<Fruit> = fruitsRepo.findAll()
    fun findById(id:String):Fruit? = fruitsRepo.findById(id)
    fun save(fruit:Fruit):Fruit = fruitsRepo.save(fruit)
}