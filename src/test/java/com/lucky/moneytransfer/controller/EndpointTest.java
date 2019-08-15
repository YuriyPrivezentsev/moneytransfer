package com.lucky.moneytransfer.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class EndpointTest {

    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/transfer/balance/Yuriy")
          .then()
             .statusCode(200)
             .body(is("Hello Yuriy"));
    }

}