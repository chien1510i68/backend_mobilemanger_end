package com.example.mobilemanager.Request.UserRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserRequest {

    @NotNull(message = "Id không được để trống")
    private Long userID;

    @NotNull(message =  "phone number is not null")
    @Pattern(regexp="\\d{10}", message="Phone number must be 10 digits")
    private String phoneNumber;

    @NotNull(message = "Address is not null")
    private String addr;

    @NotNull(message = "Password is not null")
    @Size(min=6, max=20, message="Password must be between 6 and 20 characters")
    private String password;


    @NotNull(message = "user name is not null")
    private String userName;

    private Integer roleId;
}
