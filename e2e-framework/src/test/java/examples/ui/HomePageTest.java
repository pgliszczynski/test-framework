package examples.ui;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class HomePageTest extends SelenideBaseTest {

    @Test
    public void testOpenHomePage() {
        testSteps.getHomePage().openPage();
        log.info("Test module works");
    }
}
