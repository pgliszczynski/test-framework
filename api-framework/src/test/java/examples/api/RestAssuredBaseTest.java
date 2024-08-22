package examples.api;

import examples.AbstractTest;
import examples.api.steps.TestSteps;
import examples.testdata.TestDataExample;
import org.springframework.beans.factory.annotation.Autowired;

public class RestAssuredBaseTest extends AbstractTest {

    @Autowired
    protected TestDataExample testData;
    @Autowired
    protected TestSteps testSteps;
}
