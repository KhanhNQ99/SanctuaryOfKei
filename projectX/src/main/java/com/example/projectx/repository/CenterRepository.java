package com.example.projectx.repository;

import com.example.projectx.model.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CenterRepository extends JpaRepository<Center, Long> {

    @Query("SELECT e FROM Center e WHERE e.idcenter = ?1")
    Optional<Center> findCenterByIdcenter(Long id);

    @Query("SELECT e FROM Center e WHERE e.centername =?1")
    List<Center> findCenterByName(String name);

    @Query("SELECT COUNT(e) FROM Fresher e WHERE e.idcenter =?1")
    long countFresherByIdCenter(int i);

    @Query("select DISTINCT b.idcenter, a.centername, a.freshercount from Center as a, Fresher as b where a.idcenter = b.idcenter")
    List<Center> thongketheocenter();

    @Query("select DISTINCT b.idcenter, a.centername, a.freshercount from Center a, Fresher b where a.idcenter = b.idcenter ")
    List<Center> thongkefresher();
}



