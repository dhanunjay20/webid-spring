package com.tcon.webid.domain;
import lombok.Data;
@Data
public class UserRegistrationRequest {
    private String email;
    private String password;
    private String name;
    private String contact;
    private String city;
    private String country;
}
