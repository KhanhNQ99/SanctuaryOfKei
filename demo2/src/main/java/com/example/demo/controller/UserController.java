package com.example.demo.controller;

import com.example.demo.exception.RequestException;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE','STUDENT')")
    public ResponseEntity<List<User>> listAll() {
        try {
            System.out.println(service.listPageAll());
            return ResponseEntity.ok().body(service.listAllUser());
        } catch (Exception e) {
            throw new RequestException("Oops cannot get all user with custom exception");
        }
    }

    @PostMapping("/users")
    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
//    @PreAuthorize("HasAuthority('student:write')")
    public ResponseEntity registerNewUser(@RequestBody User user) {
        try {
            System.out.println("Adding " + user);
            service.addUser(user);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get all students with custom exception");
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/users/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        try {
            System.out.println("ID " + id + ": ");
            return ResponseEntity.status(HttpStatus.OK).body(service.getId(id));
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get user with custom exception");
        }
    }

    @DeleteMapping("/users/{id}")

//    @PreAuthorize("HasAuthority('student:write')")

    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
    public ResponseEntity delete(@PathVariable Long id) {
        try {
            System.out.println("ID= " + id + " is deleted");
            service.deleteById(id);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot delete user with custom exception");
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/users/{id}")
//    @PreAuthorize("HasAuthority('student:write')")
    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
    public ResponseEntity<User> update(@RequestBody User user, @PathVariable Long id) {
        try {
            service.Update(user, id);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot update user with custom exception");
        }
        return ResponseEntity.noContent().build();
    }
}