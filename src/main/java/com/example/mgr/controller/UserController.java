package com.example.mgr.controller;

import com.example.mgr.entity.User;
import com.example.mgr.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public ResponseEntity helloUser(@RequestParam String code) {
        User user = userMapper.getUserByCode(code);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity saveUser(@RequestBody User user) {
        int result = userMapper.insert(user);
        return ResponseEntity.ok(result);
    }

}
