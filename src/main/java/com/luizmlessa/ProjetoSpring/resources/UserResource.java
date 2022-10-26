package com.luizmlessa.ProjetoSpring.resources;

import com.luizmlessa.ProjetoSpring.Entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * It's a REST controller that maps all HTTP requests with the path "/users" to the findAll() method
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1, "Bebeto", "Bebetodentista@gmail.com", "9999999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
