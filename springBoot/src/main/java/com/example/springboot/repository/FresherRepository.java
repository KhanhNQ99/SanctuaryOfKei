package com.example.springboot.repository;

import com.example.springboot.model.Center;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FresherRepository extends JpaRepository<Center, Long> {
}
