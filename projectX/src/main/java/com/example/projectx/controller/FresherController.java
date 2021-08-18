package com.example.projectx.controller;

import com.example.projectx.exception.RequestException;
import com.example.projectx.model.Fresher;
import com.example.projectx.service.FresherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

//import org.springframework.security.access.prepost.PreAuthorize;

@Transactional
@RestController
@RequestMapping("/fresher")
public class FresherController {

    @Autowired
    private FresherService fservice;

    @GetMapping
    public ResponseEntity<List<Fresher>> listAll() {
        try {
            System.out.println(fservice.listAllFresher());
            return ResponseEntity.ok().body(fservice.listAllFresher());
        } catch (Exception e) {
            throw new RequestException("Oops cannot get all user with custom exception");
        }
    }

    @GetMapping("/count")
    public ResponseEntity countFresher() {
        try {
            System.out.println("User count: " + fservice.countFresher());
            return ResponseEntity.ok().body(fservice.countFresher());
        } catch (Exception e) {
            throw new RequestException("Oops cannot get all user with custom exception");
        }
    }

    @GetMapping("/findstatistic")
    public ResponseEntity findstatistic() {
        try {
            return ResponseEntity.ok().body(fservice.findStatistic());
        } catch (Exception e) {
            throw new RequestException("Oops oh no");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fresher> getFresherById(@PathVariable Long id) {
        try {
            System.out.println("ID " + id + ": ");
            return ResponseEntity.status(HttpStatus.OK).body(fservice.getId(id));
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get fresher with id input");
        }
    }

    @GetMapping("/findbyidcenter/{idcenter}")
    public ResponseEntity GetFresherByIdcenter(@PathVariable int idcenter) {
        try{
            System.out.println("ID: " + idcenter + ": ");
            System.out.println(fservice.findFresherByIdcenter(idcenter));
            return ResponseEntity.status(HttpStatus.OK).body(fservice.findFresherByIdcenter(idcenter));
        }catch (Exception ex) {
            throw new RequestException("Oops cannot get fresher with idcenter input");
        }
    }

    @GetMapping("/findbyname/{name}")
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
    public ResponseEntity registerNewFresher(@RequestBody Fresher fresher) {
        try {
            System.out.println("Adding " + fresher);
            if(fresher.getScore1() != 0 && fresher.getScore2() != 0 && fresher.getScore3() != 0) {
                fresher.setAverage((float)(fresher.getScore1() + fresher.getScore2() + fresher.getScore3())/3);
            }
            fservice.addFresher(fresher);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot get all students with custom exception");
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/{id}")
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
    public ResponseEntity<Fresher> update(@RequestBody Fresher fresher, @PathVariable Long id) {
        try {
            if(fresher.getScore1() != 0 && fresher.getScore2() != 0 && fresher.getScore3() != 0) {
                fresher.setAverage((float)(fresher.getScore1() + fresher.getScore2() + fresher.getScore3())/3);
            }
            fservice.Update(fresher, id);
        } catch (Exception ex) {
            throw new RequestException("Oops cannot update user with custom exception");
        }
        return ResponseEntity.noContent().build();
    }
}
