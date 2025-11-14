package com.tcon.webid.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "users")
public class User {
    @Id private String id;
    private String email;
    private String password;
    private String name;
    private String contact;
    private String role; // "USER", "CATERER", "ADMIN"
    private String city;
    private String country;
}
