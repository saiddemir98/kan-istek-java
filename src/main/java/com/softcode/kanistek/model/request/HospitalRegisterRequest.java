package com.softcode.kanistek.model.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class HospitalRegisterRequest {
    @NotNull @NotBlank @NotEmpty
    private String name;
    @Email
    private String email;
    @Length(min = 8)
    private String password;
    @NotNull @NotBlank @NotEmpty
    private String telephone;
}
