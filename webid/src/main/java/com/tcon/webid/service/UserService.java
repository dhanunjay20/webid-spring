package com.tcon.webid.service;
import com.tcon.webid.domain.*;
import java.util.List;
public interface UserService {
    UserResponse registerUser(UserRegistrationRequest request);
    List<UserResponse> getAllUsers();
    UserResponse getUserById(String id);
    UserResponse updateUser(String id, UserUpdateRequest request);
    void deleteUser(String id);
}
