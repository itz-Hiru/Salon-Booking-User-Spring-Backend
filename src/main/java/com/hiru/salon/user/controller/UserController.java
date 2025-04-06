package com.hiru.salon.user.controller;

import com.hiru.salon.user.modal.User;
import com.hiru.salon.user.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody @Valid User user) {
        return userRepository.save(user);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") Long id) throws Exception {
        Optional<User> otp = userRepository.findById(id);
        if (otp.isPresent()) {
            return otp.get();
        }
        throw new Exception("User not found");
    }

    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody User user,
                           @PathVariable Long id) throws Exception {
        Optional<User> otp = userRepository.findById(id);
        if (otp.isEmpty()) {
            throw new Exception("User not found with id: " + id);
        }
        User existingUser = otp.get();
        existingUser.setFullName(user.getFullName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhoneNumber(user.getPhoneNumber());
        existingUser.setRole(user.getRole());

        return userRepository.save(existingUser);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable Long id) throws Exception {
        Optional<User> otp = userRepository.findById(id);
        if (otp.isEmpty()) {
            throw new Exception("User not found with id: " + id);
        }
        userRepository.deleteById(otp.get().getId());
        return "User deleted successfully";
    }
}
