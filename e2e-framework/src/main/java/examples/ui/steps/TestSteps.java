package examples.ui.steps;

import examples.ui.pages.HomePage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class TestSteps {

    private final HomePage homePage;
}
