package com.resumers.server.oauth.model.entity;

import com.resumers.oauth.enums.UserStatusType;
import org.springframework.core.annotation.Order;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 * Descrpition :
 */

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    private String email;
    private String password;
    private String nickname;

    @OneToOne(mappedBy = "user")
    private File file;

    @Column(length = 1000)
    private String description;
    private UserStatusType status;
    private Long level;

    @OrderBy("userCompanyMappingId asc")
    @OneToMany(mappedBy = "user")
    private Set<UserCompanyMapping> userCompanyMappings = new LinkedHashSet<>();
}
