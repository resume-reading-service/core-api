package com.resumers.server.oauth.model.entity;

import com.resumers.server.oauth.enums.UserCompanyCertifyStatus;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 * Descrpition :
 */
@Entity
@Table(name = "user_company")
public class UserCompany extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_company_id")
    private Long userCompanyId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @Enumerated(EnumType.STRING)
    private UserCompanyCertifyStatus userCompanyCertifyStatus;

    @OneToOne
    @JoinColumn(name = "certify_id")
    private Certify certify;
}
