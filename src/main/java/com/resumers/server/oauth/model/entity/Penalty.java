package com.resumers.server.oauth.model.entity;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 */

@Entity
@Table(name="penalty")
public class Penalty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long penaltyId;

    @Column(length = 100)
    private String title;

    @Column(length = 2000)
    private String description;
}
