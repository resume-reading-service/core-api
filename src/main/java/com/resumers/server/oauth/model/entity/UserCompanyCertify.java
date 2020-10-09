package com.resumers.server.oauth.model.entity;

import com.resumers.server.oauth.enums.UserCompanyCertifyStatus;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 * Descrpition :
 */
@Entity
@Table(name = "user_company_certify")
public class UserCompanyCertify extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_company_certify_id")
    private Long userCompantCertifyId;

    private Long companyId;

    @Enumerated(EnumType.STRING)
    private UserCompanyCertifyStatus userCompanyCertifyStatus;

    @OneToOne
    @JoinColumn(name = "certify_id")
    private Certify certify;
}
