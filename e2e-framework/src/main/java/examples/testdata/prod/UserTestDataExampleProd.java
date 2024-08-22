package examples.testdata.prod;

import examples.testdata.UserTestDataExample;
import examples.testdata.dto.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class UserTestDataExampleProd implements UserTestDataExample {

    @Override
    public User getRegularCustomer() {
        return User.builder()
                .email("test_data_PROD@test.com")
                .password("PaSsWoRd_2")
                .build();
    }
}
