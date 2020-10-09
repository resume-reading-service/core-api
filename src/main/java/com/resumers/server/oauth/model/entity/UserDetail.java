package com.resumers.server.oauth.model.entity;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 */

@Entity
@Table(name="user_detail")
public class UserDetail extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_detail_id")
    private Long userDetailId;

    private String githubUrl;
    private String blog;
    private String linkedIn;
}
