package io.mrvictor42.userservice.service;

import io.mrvictor42.userservice.domain.Role;
import io.mrvictor42.userservice.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
