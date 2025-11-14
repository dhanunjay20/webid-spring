package com.tcon.webid.domain;
import lombok.Data;
@Data
public class UserUpdateRequest {
    private String name;
    private String contact;
    private String city;
    private String country;
}
