package ar.gmf.domain

interface FruitsRepo {
    fun findAll():List<Fruit>
    fun findById(id:String):Fruit?
    fun save(fruit:Fruit):Fruit
}