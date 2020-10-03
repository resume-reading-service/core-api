package com.resumers.server.oauth.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 * Descrpition :
 */

@Entity
@Table(name = "file")
@NoArgsConstructor
@AllArgsConstructor
public class File extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fileId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
