package examples.api.steps;

import examples.api.clients.DogApiClient;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class TestSteps {

    private final DogApiClient dogApiClient;
}
