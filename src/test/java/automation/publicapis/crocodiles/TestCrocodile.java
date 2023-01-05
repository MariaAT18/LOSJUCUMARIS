package automation.publicapis.crocodiles;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCrocodile {
    @Test
    public void getCrocodileStatusOk() {
        int statusCode= given().when().get("https://test-api.k6.io/public/crocodiles/3/").getStatusCode();
        System.out.println("The response status is "+statusCode);
        assertTrue(statusCode==200);
    }
}
