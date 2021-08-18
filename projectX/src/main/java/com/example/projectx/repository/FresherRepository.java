package com.example.projectx.repository;

import com.example.projectx.model.Fresher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FresherRepository extends JpaRepository<Fresher, Long> {

    @Query("SELECT e FROM Fresher e WHERE e.id = ?1")
    Optional<Fresher> findFresherById(Long id);

    @Query("SELECT e FROM Fresher e WHERE e.name =?1")
    List<Fresher> findFresherByName(String name);

    @Query("SELECT e FROM Fresher e WHERE e.lang = ?1")
    List<Fresher> findFresherByLang(String lang);

    @Query("SELECT e FROM Fresher e WHERE e.email = ?1")
    List<Fresher> findFresherByEmail(String email);

    @Query("SELECT e FROM Fresher e WHERE e.idcenter = ?1")
    List<Fresher> findFresherByIdcenter(int id);

    @Query("SELECT e FROM Fresher e WHERE e.name =?1")
    Fresher findByName(String name);

    @Query("select count(v) as cnt, v.average from Fresher v group by v.average ")
    public List<?> findStatistic();

}
