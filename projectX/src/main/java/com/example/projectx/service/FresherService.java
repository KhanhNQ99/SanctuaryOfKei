package com.example.projectx.service;

import com.example.projectx.model.Fresher;
import com.example.projectx.repository.FresherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class FresherService implements UserDetailsService {

    @Autowired
    public FresherRepository fresherRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

    public List<Fresher> listAllFresher() {
        return fresherRepository.findAll();
    }

    public Optional countFresher() {
        return Optional.of(fresherRepository.count());
    }

    public void addFresher(Fresher fresher) {
        Optional<Fresher> fresherOptional = fresherRepository
                .findFresherById(fresher.getId());
        if (fresherOptional.isPresent()) {
            throw new IllegalStateException("Id taken");
        }
        fresherRepository.save(fresher);
    }

    public Optional findFresherByIdcenter(int idcenter) {
        List<Fresher> fresherOptional = fresherRepository
                .findFresherByIdcenter(idcenter);
        if (fresherOptional.isEmpty()) {
            throw new IllegalStateException("No fresher name like this ");
        }
        return Optional.of(fresherRepository.findFresherByIdcenter(idcenter));
    }

    public Optional findFresherByName(String name) {
        List<Fresher> fresherOptional = fresherRepository
                .findFresherByName(name);
        fresherRepository.findFresherByName(name);
        if (fresherOptional.isEmpty()) {
            throw new IllegalStateException("No fresher name like this ");
        }
        return Optional.of(fresherRepository.findFresherByName(name));
    }

    public Optional findFresherByLang(String lang) {
        List<Fresher> fresherOptional = fresherRepository
                .findFresherByLang(lang);
        fresherRepository.findFresherByLang(lang);
        if (fresherOptional.isEmpty()) {
            throw new IllegalStateException("No fresher lang like this ");
        }
        return Optional.of(fresherRepository.findFresherByLang(lang));
    }

    public Optional findFresherByEmail(String email) {
        List<Fresher> fresherOptional = fresherRepository
                .findFresherByEmail(email);
        fresherRepository.findFresherByEmail(email);
        if (fresherOptional.isEmpty()) {
            throw new IllegalStateException("No fresher email like this ");
        }
        return Optional.of(fresherRepository.findFresherByEmail(email));
    }

    public void deleteById(Long id) {
        boolean exists = fresherRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException(
                    "Fresher with id " + id + "does not exists");
        }
        fresherRepository.deleteById(id);
    }

    public void Update(Fresher fresher, Long id){
        Optional<Fresher> fresherOptional = fresherRepository.findById(id);
        if (!fresherOptional.isPresent())
            throw new IllegalStateException("Name taken");
        fresher.setId(id);
        fresherRepository.save(fresher);
    }

    public Fresher getId(Long id) {
        return fresherRepository.findById(id).get();
    }

    public List<?> findStatistic() {
        return fresherRepository.findStatistic();
    }


}
