package com.example.projectx.service;

import com.example.projectx.model.Center;
import com.example.projectx.repository.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class CenterService {

    @Autowired
    public CenterRepository centerRepository;

    public List<Center> listAllCenter() {
        return centerRepository.findAll();
    }

    public Optional countCenter() {
        return Optional.of(centerRepository.count());
    }

    public void addCenter(Center center) {
        Optional<Center> centerOptional = centerRepository
                .findCenterByIdcenter(center.getId());
        if (centerOptional.isPresent()) {
            throw new IllegalStateException("Id taken");
        }
        centerRepository.save(center);
    }

    public Optional findFresherByName(String name) {
        List<Center> centerOptional = centerRepository
                .findCenterByName(name);
        centerRepository.findCenterByName(name);
        if (centerOptional.isEmpty()) {
            throw new IllegalStateException("No fresher name like this ");
        }
        return Optional.of(centerRepository.findCenterByName(name));
    }

    public void deleteById(Long id) {
        boolean exists = centerRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException(
                    "Fresher with id " + id + "does not exists");
        }
        centerRepository.deleteById(id);
    }

    public void Update(Center center, Long idcenter) {
        Optional<Center> centerOptional = centerRepository.findById(idcenter);
        if (!centerOptional.isPresent())
            throw new IllegalStateException("Name taken");
        center.setId(idcenter);
        centerRepository.save(center);
    }

    public Center getId(Long id) {
        return centerRepository.findById(id).get();
    }

    public long countFresherByIdCenter(int idcenter) {
        return centerRepository.countFresherByIdCenter(idcenter);
    }

}
