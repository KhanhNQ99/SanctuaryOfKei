package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User> {

    @Query("SELECT e FROM User e ORDER BY e.name DESC")
    List<User> findAllOrderByNameDesc();

    @Query(value = "SELECT e.* FROM user e ORDER BY e.name DESC", nativeQuery = true)
    List<User> findAllOrderByNameDescNative();

    @Query(value = "SELECT e FROM User e WHERE e.id = ?1", nativeQuery = true)
    List<User> findUserById(Long id);

    @Query("SELECT e FROM User e WHERE e.name = ?1")
    List<User> findByName(String name);

    @Query("SELECT e FROM User e WHERE e.name = :name AND e.author = :author")
    List<User> findByNameAndAuthor(@Param("name") String name, @Param("author") String author);

    @Query("SELECT e FROM User e WHERE e.name like ?1")
    List<User> findByNameLike(String name);

    @Query("SELECT e FROM User e WHERE e.price = ?1")
    List<User> findUserByPrice(int price);

    @Query("SELECT e FROM User e WHERE e.name = ?1")
    Optional<User> findUserByName(String name);


}





