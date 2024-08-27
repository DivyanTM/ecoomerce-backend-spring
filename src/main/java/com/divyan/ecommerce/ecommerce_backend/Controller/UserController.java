package com.divyan.ecommerce.ecommerce_backend.Controller;

import com.divyan.ecommerce.ecommerce_backend.Entity.User;
import com.divyan.ecommerce.ecommerce_backend.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/adduser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/getuser/{username}")
    public User getUser(@PathVariable("username") String username){
        Optional<User> user=userRepository.findByusername(username);
        return user.orElse(null);
    }
}
