package com.jap.rest101.controller;

import com.jap.rest101.db.entity.User;
import com.jap.rest101.db.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<User>> listUser() {
        List<User> users = repository.findAll();
        return ResponseEntity.ok(users);
    }
}

