package com.resumers.server.oauth.repository;

import com.resumers.server.oauth.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
