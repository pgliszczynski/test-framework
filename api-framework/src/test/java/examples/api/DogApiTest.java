package examples.api;

import examples.api.dto.ImageDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class DogApiTest extends RestAssuredBaseTest {

    @Test
    public void verifyRandomDogImageFetch() {
        ImageDTO imageDTO = testSteps.getDogApiClient().getRandomImage();

        Assertions.assertEquals("success", imageDTO.getStatus());
        log.info("Test module works");
    }
}
