package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication  {
//    @Autowired
//    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("__________Reset and init data________________");
////        userRepository.deleteAll();
//        userRepository.save(new User("mv 2000", "mot", 100));
//        userRepository.save(new User("mv 2001", "hai", 101));
//        userRepository.save(new User("mv 2002", "ba", 102));
//        userRepository.save(new User("mv 2003", "bon", 103));
//        System.out.println("__________Demo find all order by name desc________________");
//        List<User> users = userRepository.findAllOrderByNameDesc();
//        users.forEach(user -> System.out.println(user));
//
//        System.out.println("__________Demo find find by name like 'th'________________");
//        List<User> listUser = userRepository.findByNameLike("%mv%");
//        listUser.forEach(user -> System.out.println(user));
//
//        System.out.println("--------------------------");
//        List<User> userByNameAndAuthor = userRepository.findByNameAndAuthor("mv 2000", "mot");
//        userByNameAndAuthor.forEach(user -> System.out.println(user));
//        System.out.println("=========================");
//        List<User> userByName = userRepository.findByName("mv 2000");
//        userByName.forEach(user -> System.out.println(user));
//        System.out.println("==========================");
//        List<User> userByPrice = userRepository.findUserByPrice(103);
//        userByPrice.forEach(user -> System.out.println(user));
//
//    }

}
