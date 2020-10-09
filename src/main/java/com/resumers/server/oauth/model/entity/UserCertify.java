package com.resumers.server.oauth.model.entity;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 * Descrpition :
 */
@Entity
@Table(name = "user_certify")
public class UserCertify extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userCertifyId;

    private Long companyId;
}
