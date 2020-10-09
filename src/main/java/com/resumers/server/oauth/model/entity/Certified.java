package com.resumers.server.oauth.model.entity;

import com.resumers.server.oauth.enums.CertifiedStatus;
import com.resumers.server.oauth.enums.CertifiedType;

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

    private String email;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private CertifiedStatus certifiedStatus;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User user;
}
