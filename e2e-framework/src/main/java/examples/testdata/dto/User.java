package examples.testdata.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
public class User {

    private Integer id;
    private String email;
    @EqualsAndHashCode.Exclude
    private String password;
    private String login;
    private String middleName;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
