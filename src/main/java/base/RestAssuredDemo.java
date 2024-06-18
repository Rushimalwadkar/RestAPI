package base;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class RestAssuredDemo {
	public static void main(String[] args) {
		Reqres reqres = new Reqres();
		reqres.listOfUser();
		reqres.postDetailsOfUser();
		reqres.listOfUser();
	}
}
