package com.resumers.server.oauth.model.entity;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 */

@Table(name = "company")
@Entity
public class Company extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long companyId;
}
