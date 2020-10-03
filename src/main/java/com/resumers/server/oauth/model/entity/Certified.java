package com.resumers.server.oauth.model.entity;

import com.resumers.oauth.enums.CertifiedType;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 */

@Entity
@Table(name = "certified")
public class Certified extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="certified_id")
    private Long certifiedId;

    @Enumerated(EnumType.STRING)
    private CertifiedType certifiedType;
}
