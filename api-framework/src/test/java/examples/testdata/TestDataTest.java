package examples.testdata;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TestDataTest extends TestDataBaseTest {

    @Test
    public void testDataDemoTest() {
        log.info("Test data works");
        checkTestData();
    }
}
