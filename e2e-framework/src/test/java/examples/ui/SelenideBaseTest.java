package examples.ui;

import com.codeborne.selenide.logevents.SelenideLogger;
import examples.AbstractTest;
import examples.testdata.TestDataExample;
import examples.ui.steps.TestSteps;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class SelenideBaseTest extends AbstractTest {

    @Autowired
    protected TestDataExample testData;
    @Autowired
    protected TestSteps testSteps;

    @BeforeAll
    public static void configurationSetUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void browserTearDown() {
        closeWebDriver();
    }
}
