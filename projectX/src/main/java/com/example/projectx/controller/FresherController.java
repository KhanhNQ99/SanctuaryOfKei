package com.example.projectx.controller;

import com.example.projectx.exception.RequestException;
import com.example.projectx.model.Fresher;
import com.example.projectx.service.FresherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/fresher")
@RestController
public class FresherController {

    @Autowired
    private FresherService fservice;

    @GetMapping
//    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE','STUDENT')")
    public ResponseEntity<List<Fresher>> listAll() {
        try {
            System.out.println(fservice.listAllFresher());
            return ResponseEntity.ok().body(fservice.listAllFresher());
        } catch (Exception e) {
            throw new RequestException("Oops cannot get all user with custom exception");
        }
    }

    @GetMapping("/count")
//    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE','STUDENT')")
    public ResponseEntity countFresher() {
        try {
            System.out.println("User count: " + fservice.countFresher());
            return ResponseEntity.ok().body(fservice.countFresher());
        } catch (Exception e) {
            throw new RequestException("Oops cannot get all user with custom exception");
        }
    }

    @GetMapping("/{id}")
//    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
    public ResponseEntity<Fresher> getFresherrById(@PathVariable Long id) {
        try {
            System.out.println("ID " + id + ": ");
            return ResponseEntity.status(HttpStatus.OK).body(fservice.getId(id));
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get user with custom exception");
        }
    }

    @GetMapping("/findbyname/{name}")
//    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
    public ResponseEntity getFresherByName(@PathVariable String name) {
        try {
            System.out.println("ID " + name + ": ");
            fservice.findFresherByName(name);
            return ResponseEntity.status(HttpStatus.OK).body(fservice.findFresherByName(name));
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get user with custom exception");
        }
    }

    @GetMapping("/findbylang/{lang}")
//    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
    public ResponseEntity getFresherByLang(@PathVariable String lang) {
        try {
            System.out.println("Lang: " + lang + ": ");
            fservice.findFresherByLang(lang);
            return ResponseEntity.status(HttpStatus.OK).body(fservice.findFresherByLang(lang));
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get user with custom exception");
        }
    }

    @GetMapping("/findbyemail/{email}")
//    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
    public ResponseEntity getFresherByEmail(@PathVariable String email) {
        try {
            System.out.println("Email: " + email + ": ");
            fservice.findFresherByEmail(email);
            return ResponseEntity.status(HttpStatus.OK).body(fservice.findFresherByEmail(email));
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get user with custom exception");
        }
    }

    @PostMapping
//    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
//    @PreAuthorize("HasAuthority('student:write')")
    public ResponseEntity registerNewFresher(@RequestBody Fresher fresher) {
        try {
            System.out.println("Adding " + fresher);
            fservice.addFresher(fresher);
            if(fresher.getScore1() != 0 && fresher.getScore2() != 0 && fresher.getScore3() != 0) {
                fresher.getAverage();
//                service.sumAverage();
            }
            fservice.fresherRepository.save(fresher);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get all students with custom exception");
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("HasAuthority('student:write')")
//    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
    public ResponseEntity delete(@PathVariable Long id) {
        try {
            System.out.println("ID= " + id + " is deleted");
            fservice.deleteById(id);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot delete user with custom exception");
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/{id}")
//    @PreAuthorize("HasAuthority('student:write')")
//    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
    public ResponseEntity<Fresher> update(@RequestBody Fresher fresher, @PathVariable Long id) {
        try {
            fservice.Update(fresher, id);
            if(fresher.getScore1() != 0 && fresher.getScore2() != 0 && fresher.getScore3() != 0) {
                fresher.getAverage();
//                service.sumAverage();
            }
            fservice.fresherRepository.save(fresher);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot update user with custom exception");
        }
        return ResponseEntity.noContent().build();
    }
}
