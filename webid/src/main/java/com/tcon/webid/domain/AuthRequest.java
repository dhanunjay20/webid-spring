package com.tcon.webid.domain;
import lombok.Data;
@Data
public class AuthRequest {
    private String email;
    private String password;
}
