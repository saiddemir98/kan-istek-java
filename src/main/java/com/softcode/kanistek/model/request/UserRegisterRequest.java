package com.softcode.kanistek.model.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Valid
public class UserRegisterRequest {
    @NotNull
    @NotBlank
    @NotEmpty
    private String name;
    @NotEmpty @NotNull @NotBlank
    private String surname;
    @Email
    private String email;
    @Length(min = 8)
    private String password;
    @NotNull @NotBlank @NotEmpty
    private String telephone;

}
