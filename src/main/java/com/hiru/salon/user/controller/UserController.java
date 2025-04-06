package com.hiru.salon.user.controller;

import com.hiru.salon.user.modal.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users")
    public User getUser() {
        User user = new User();
        user.setFullName("Hirumitha Kuladewa");
        user.setEmail("hirumithakuladewanew@gmail.com");
        user.setPhoneNumber("+94 72 550 8919");
        user.setRole("Customer");
        return user;
    }
}
