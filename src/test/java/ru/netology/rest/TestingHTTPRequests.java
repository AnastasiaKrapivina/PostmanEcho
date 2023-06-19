package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class TestingHTTPRequests {

    @Test
    void testingPOSTRequestsName() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("name")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("name"))

        ;
    }
    @Test
    void testingPOSTRequestsId() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Id")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Id"))

        ;
    }
    @Test
    void testingPOSTRequestsNumber() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("number")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("number"))

        ;
    }

}
