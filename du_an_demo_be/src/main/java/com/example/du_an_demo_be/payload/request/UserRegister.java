package com.example.du_an_demo_be.payload.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserRegister {

    @NotBlank(message = "Username is not empty")
    @Size(min = 1,max = 20,message = "Username length from 1 to 20")
    private String username;

    @NotBlank(message = "Fullname is not empty")
    @Size(min = 1,max = 50,message = "Fullname length from 1 to 50")
    private String fullname;

    @NotBlank(message = "Password is not empty")
    @Size(min = 1,max = 50,message = "Password length from 1 to 50")
    private String password;

}
