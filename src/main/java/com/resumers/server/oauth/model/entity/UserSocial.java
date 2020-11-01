package com.resumers.server.oauth.model.entity;

import com.resumers.server.oauth.enums.SocialType;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 */

@Entity
@Table(name = "user_social")
public class UserSocial extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_social_id")
    private Long userSocialId;

    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    private String socialToken;
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
