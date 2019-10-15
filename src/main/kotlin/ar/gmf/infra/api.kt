package ar.gmf.infra

import ar.gmf.domain.Fruit
import ar.gmf.domain.FruitActions
import ar.gmf.domain.FruitsRepo
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/api/fruits")
class FruitsApi(private val fruitActions: FruitActions) {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun findAll() = fruitActions.findAll()

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun findById(@PathParam("id") id:String) = fruitActions.findById(id)

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun save(fruit:Fruit) = fruitActions.save(fruit)
}