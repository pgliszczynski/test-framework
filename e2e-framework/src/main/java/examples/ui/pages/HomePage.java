package examples.ui.pages;

import examples.properties.TestConfig;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.springframework.stereotype.Component;

@Component
public class HomePage {

    @Step("Open home page")
    public void openPage() {
        Selenide.open(TestConfig.baseUrl);
    }
}
