package com.challenge.demo.service;

import com.challenge.demo.entity.User;
import com.challenge.demo.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserRepository repository;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    public boolean isUserEnabled(User user) {
        boolean isUserEnabled = false;
        List<User> usuarios = repository.findByUsernameAndIsEnabledTrue(user.getEmail());
        if (!usuarios.isEmpty()) {
            User usuario = usuarios.get(0);
            if (passwordEncoder.matches(user.getPassword(), usuario.getPassword()))
                isUserEnabled = true;
        }
        
        return isUserEnabled;
    }
    
    public void crearUsuario(User usuario) throws Exception {
        List<User> usuarios = repository.findByUsernameAndIsEnabledTrue(usuario.getEmail());
        if(!usuarios.isEmpty()){
            throw new Exception("El mail ya está registrado!");
        } else {
        
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        repository.save(usuario);
        }
    
    }
    
}
