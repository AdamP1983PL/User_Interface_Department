package com.user_interface.dto.user;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    /* todo DO I NEED VALIDATION HERE????????????????*/

    private Long id;
    @Size(min = 3, max = 20)
    @NotEmpty(message = "First name should not be empty.")
    private String firstName;
    @Size(min = 3, max = 20)
    @NotEmpty(message = "Last name should not be empty.")
    private String lastName;
    @Size(min = 3, max = 30)
    @NotEmpty(message = "Username should not be empty.")
    private String username;
    @Size(min = 8, max = 20)
    @NotEmpty(message = "Password should not be empty.")
    private String password;
    @NotEmpty(message = "Select option.")
    private Role role;
}
