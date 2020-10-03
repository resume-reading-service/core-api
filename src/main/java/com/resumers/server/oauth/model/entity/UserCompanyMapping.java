package com.resumers.server.oauth.model.entity;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 * Descrpition :
 */

@Table
@Entity
public class UserCompanyMapping extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_company_mapping_id")
    private Long userCompanyMappingId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
