package examples.testdata;

import examples.AbstractTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.assertj.core.api.Assertions;

public class TestDataBaseTest extends AbstractTest {

    @Autowired
    protected TestDataExample td;

    protected void checkTestData() {
        Assertions.assertThat(td.getUser().getRegularCustomer().getEmail())
                .as("Email is not as expected.")
                .isEqualTo("test_data_DEV@test.com");
    }
}
