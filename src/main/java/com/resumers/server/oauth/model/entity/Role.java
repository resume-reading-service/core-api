package com.resumers.server.oauth.model.entity;

import com.resumers.server.oauth.enums.RoleType;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 * Descrpition :
 */

@Entity
@Table(name="role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Long roleId;

    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private RoleType roleType;

    @Column(name = "description")
    private String description;
}
