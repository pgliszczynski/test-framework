package examples.testdata.stage;

import examples.testdata.UserTestDataExample;
import examples.testdata.dto.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("stage")
public class UserTestDataExampleStage implements UserTestDataExample {

    @Override
    public User getRegularCustomer() {
        return User.builder()
                .email("test_data_STAGE@test.com")
                .password("PaSsWoRd_3")
                .build();
    }
}
