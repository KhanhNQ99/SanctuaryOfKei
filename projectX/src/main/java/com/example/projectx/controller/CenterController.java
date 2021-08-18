package com.example.projectx.controller;

import com.example.projectx.exception.RequestException;
import com.example.projectx.model.Center;
import com.example.projectx.service.CenterService;
import com.example.projectx.service.FresherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/center")
@RestController
public class CenterController {

    @Autowired
    private CenterService cservice;

    @Autowired
    private FresherService fservice;

    @GetMapping
    public ResponseEntity<List<Center>> listAll() {
        try {
            System.out.println(cservice.listAllCenter());
            return ResponseEntity.ok().body(cservice.listAllCenter());
        } catch (Exception e) {
            throw new RequestException("Oops cannot get all Center with custom exception");
        }
    }

    @GetMapping("/count")
    public ResponseEntity countFresher() {
        try {
            System.out.println("User count: " + cservice.countCenter());
            return ResponseEntity.ok().body(cservice.countCenter());
        } catch (Exception e) {
            throw new RequestException("Oops cannot get all user with custom exception");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Center> getFresherrById(@PathVariable Long id) {
        try {
            System.out.println("ID " + id + ": ");
            return ResponseEntity.status(HttpStatus.OK).body(cservice.getId(id));
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get user with custom exception");
        }
    }

    @GetMapping("/findbyname/{name}")
    public ResponseEntity getFresherByName(@PathVariable String name) {
        try {
            System.out.println("ID " + name + ": ");
            cservice.findFresherByName(name);
            return ResponseEntity.status(HttpStatus.OK).body(cservice.findFresherByName(name));
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get user with custom exception");
        }
    }

    @PostMapping
    public ResponseEntity registerNewCenter(@RequestBody Center center) {
        try {
            System.out.println("Adding " + center);
            cservice.addCenter(center);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get all students with custom exception");
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        try {
            System.out.println("ID= " + id + " is deleted");
            cservice.deleteById(id);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot delete user with custom exception");
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Center> update(@RequestBody Center center, @PathVariable long id) {
        try {
            cservice.Update(center, id);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot update user with custom exception");
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/countfresher/{idcenter}")
    public ResponseEntity getFresherByIdCenter(@PathVariable int idcenter) {
        try {
            long a = cservice.countFresherByIdCenter(idcenter);
            Center center = cservice.getId((long) idcenter);
            center.setFreshercount((int) a);
            cservice.centerRepository.save(center);
            return ResponseEntity.status(HttpStatus.OK).body(cservice.countFresherByIdCenter(idcenter));
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get user with custom exception");
        }
    }
}
