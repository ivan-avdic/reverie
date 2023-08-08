package com.sailingpappi.reverie.repository;

import com.sailingpappi.reverie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAll();

    User findByUserId(String id);
    User findByUsername(String username);

    User findByEmail(String email);

    List<User> findByFirstName(String firstName);

    List<User> findByLastName(String firstName);
}
