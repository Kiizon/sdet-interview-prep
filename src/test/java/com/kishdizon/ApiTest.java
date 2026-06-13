package com.kishdizon;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    @BeforeEach
    void url() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    void testGet() {
        given()
                .when()
                    .get("/posts/1")
                .then()
                    .statusCode(200)
                    .body("id", equalTo(1))
                    .body("userId", equalTo(1));
    }

    @Test
    void testGetAllPosts() {
        given()
                .when()
                    .get("/posts")
                .then()
                    .statusCode(200)
                    .body("size()",equalTo(100));
    }

    @Test
    void testCreatePost() {
        String requestBody = """ 
                {
                    "title": "Kish's Post",
                    "body": "Hello World",
                    "userId": 1
                }
                """;

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                    .when()
                        .post("/posts")
                    .then()
                        .statusCode(201)
                        .body("userId", equalTo(1));
    }

    @Test
    void testPut() {
        String requestBody = """ 
                {
                    "title": "Kish's Updated Post",
                    "body": "Hello World",
                    "userId": 1
                }
                """;

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                    .when()
                        .put("/posts/1")
                    .then()
                        .statusCode(200)
                        .body("userId", equalTo(1));

    }

    @Test
    void testDelete() {
        given()
                .when()
                    .delete("/posts/1")
                .then()
                    .statusCode(200);
    }
}
