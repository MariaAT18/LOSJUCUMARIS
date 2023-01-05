package automation.privateapis.crocodiles;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCrocodilePrivate {
    @Test
    public void getCrocodileStatusOk() {
        int statusCode= given().when().get("https://test-api.k6.io/public/crocodiles/1/").getStatusCode();
        System.out.println("The response status is "+statusCode);
        assertTrue(statusCode==200);
    }
}
