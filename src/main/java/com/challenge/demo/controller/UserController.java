package com.challenge.demo.controller;

import com.challenge.demo.entity.User;
import com.challenge.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    public UserService service;
    
    @PostMapping("/auth/login")
    @ResponseBody
    public boolean login(@RequestBody User user) {
        return service.isUserEnabled(user);
    }
    
    @PostMapping("/auth /register")
    public void register(@RequestBody User usuario) throws Exception {
        service.crearUsuario(usuario);
    }
}
