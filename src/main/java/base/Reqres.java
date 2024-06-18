package base;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class Reqres {
	public void listOfUser() {
		/*
		 * End point :https://reqres.in/api/users?page=2 type of method : Get Header
		 * :Null Body : Null
		 */
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.log().all();
	}

	public void singleUser() {
		/*
		 * End point :https://reqres.in/api/users/2 
		 * type of method : Get 
		 * Header :Null
		 *  Body : Null
		 */
		given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.log().all();
	}
	public void postDetailsOfUser() {
		/*
		 * End point :https:https://reqres.in/api/users 
		 * type of method : Get 
		 * Header :Null
		 *  Body : Null
		 */
		given().contentType(ContentType.JSON).
		body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}"
		)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.log().all();	
	}
}
