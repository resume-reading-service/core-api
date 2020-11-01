package com.resumers.server.oauth.model.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 * Descrpition :
 */

@Entity
@Table(name = "user_penalty")
public class UserPenalty extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_penalty_id")
    private Long userPenaltyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="penalty_id")
    private Penalty penalty;

    @Column(length = 2000)
    private String description;

    private LocalDateTime startAt;
    private LocalDateTime endAt;
}
