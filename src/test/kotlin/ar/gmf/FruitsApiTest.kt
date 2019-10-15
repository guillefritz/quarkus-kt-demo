package ar.gmf

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
open class FruitsApiTest {

    @Test
    fun testFruitsApi() {
        given()
          .`when`().get("/api/fruits")
          .then()
             .statusCode(200)
             .body(`is`("[]"))
    }

}