package com.resumers.server.oauth.model.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

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

    private String name;
    private String description;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private Set<CompanyTag> companyTags =  new LinkedHashSet<>();
}
