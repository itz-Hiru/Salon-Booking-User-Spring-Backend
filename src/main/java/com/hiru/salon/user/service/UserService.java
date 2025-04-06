package com.hiru.salon.user.service;

import com.hiru.salon.user.modal.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id) throws Exception;
    List<User> getAllUsers();
    void deleteUserById(Long id) throws Exception;
    User updateUser(Long id, User user) throws Exception;
}
