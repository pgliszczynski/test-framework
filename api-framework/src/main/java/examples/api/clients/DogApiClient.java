package examples.api.clients;

import examples.properties.TestConfig;
import examples.api.dto.ImageDTO;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class DogApiClient extends BaseClient {

    private static final String BASE_URL = TestConfig.baseUrl;
    private static final String GET_RANDOM_IMAGE = "/api/breeds/image/random";

    @Step("Get random image")
    public ImageDTO getRandomImage() {
        return RestAssured.when()
                .get(BASE_URL + GET_RANDOM_IMAGE)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(ImageDTO.class);
    }
}
