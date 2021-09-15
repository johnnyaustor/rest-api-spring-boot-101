package com.jap.rest101.controller;

import com.jap.rest101.db.entity.User;
import com.jap.rest101.db.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository repository;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        repository.save(user);
        return ResponseEntity.ok(user);
    }
}

