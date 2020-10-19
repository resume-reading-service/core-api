package com.resumers.server.oauth.repository;

import com.resumers.server.oauth.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 */
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
    Optional<User> findAllByEmailOrNickname(String email, String nickname);
}
