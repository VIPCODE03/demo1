package com.example.demo1.controller;

import com.example.demo1.dto.ApiResponse;
import com.example.demo1.entity.User;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users") // Chuẩn đặt tên có version
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ApiResponse<User> createUser(@RequestBody User user) {
        User result = userService.createUser(user);

        return ApiResponse.<User>builder()
                .code(200)
                .message("User created successfully")
                .result(result)
                .build();
    }

    @GetMapping
    public ApiResponse<List<User>> getUsers() {
        List<User> result = userService.getUsers();

        return ApiResponse.<List<User>>builder()
                .code(200)
                .result(result)
                .build();
    }
}