package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository repo;

    public List<User> listAllUser() {
        return repo.findAll();
    }

    public Optional<User> save(User user) {
        return Optional.of(repo.save(user));
    }

    public void addUser(User user) {
        Optional<User> userOptional = repo
                .findUserByName(user.getName());
        if (userOptional.isPresent()) {
            throw new IllegalStateException("Name taken");
        }
        repo.save(user);
    }

    public User getId(Long id) {
        return repo.findById(id).get();
    }

    public void deleteById(Long id) {
        boolean exists = repo.existsById(id);
        if (!exists) {
            throw new IllegalStateException(
                    "User with id " + id + "does not exists");
        }
        repo.deleteById(id);
    }

    public void DeleteById(Long id) {
        boolean exists = repo.existsById(id);
        if (!exists) {
            throw new IllegalStateException(
                    "User with id " + id + "does not exists");
        }
        repo.deleteById(id);
    }

    public void findByName(String name) {
        Optional<User> userOptional = repo
                .findUserByName(name);
        if (userOptional.isPresent()) {
            throw new IllegalStateException("name already taken");
        }
        repo.findUserByName(name);
    }

    public Page<User> listPageAll() {
        Pageable pageable = PageRequest.of(0, 10);
        return repo.findAll(pageable);
    }

    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }

    public void Update(User user, Long id){
        Optional<User> studentOptional = repo.findById(id);
        if (!studentOptional.isPresent())
            throw new IllegalStateException("Name taken");
        user.setId(id);
        repo.save(user);
    }
}
