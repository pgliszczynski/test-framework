package examples.testdata;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class TestDataExample {

    private final UserTestDataExample user;
}
