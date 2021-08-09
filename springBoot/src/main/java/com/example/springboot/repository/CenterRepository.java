package com.example.springboot.repository;

import com.example.springboot.model.Fresher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CenterRepository extends JpaRepository<Fresher, Long > {
}
