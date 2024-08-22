package examples.testdata.dev;

import examples.testdata.UserTestDataExample;
import examples.testdata.dto.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({ "dev", "default" })
public class UserTestDataExampleDev implements UserTestDataExample {

    @Override
    public User getRegularCustomer() {
        return User.builder()
                .email("test_data_DEV@test.com")
                .password("PaSsWoRd_1")
                .build();
    }
}
