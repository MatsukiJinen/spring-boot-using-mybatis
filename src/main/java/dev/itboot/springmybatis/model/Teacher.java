package dev.itboot.springmybatis.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Teacher {
    private Long id;

    @NotBlank
    @Size(max = 60)
    private String userName;

    @NotBlank
    @Email
    @Size(max = 254)
    private String email;
}
