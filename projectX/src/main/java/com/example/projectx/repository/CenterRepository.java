package com.example.projectx.repository;

import com.example.projectx.model.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CenterRepository extends JpaRepository<Center, Long> {

    @Query("SELECT e FROM Center e WHERE e.id = ?1")
    Optional<Center> findCenterById(Long id);

    @Query("SELECT e FROM Center e WHERE e.name =?1")
    List<Center> findCenterByName(String name);

    @Query("SELECT COUNT(e) FROM Fresher e WHERE e.idcenter =?1")
    long countFresherByIdCenter(int i);

    @Query("SELECT COUNT(e) FROM Fresher e WHERE e.name = ?1")
    Long countFresherByName(String name);
}

