package com.tcon.webid.domain;
import com.tcon.webid.entity.User;
import lombok.Data;
@Data
public class UserResponse {
    private String id;
    private String email;
    private String name;
    private String contact;
    private String role;
    private String city;
    private String country;
    public static UserResponse fromEntity(User user) {
        UserResponse resp = new UserResponse();
        resp.setId(user.getId());
        resp.setEmail(user.getEmail());
        resp.setName(user.getName());
        resp.setContact(user.getContact());
        resp.setRole(user.getRole());
        resp.setCity(user.getCity());
        resp.setCountry(user.getCountry());
        return resp;
    }
}
