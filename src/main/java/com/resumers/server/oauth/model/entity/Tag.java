package com.resumers.server.oauth.model.entity;

import com.resumers.server.oauth.enums.TagType;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 * Descrpition :
 */

@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private Long TagId;

    private String title;
    private TagType tagType;
    private String description;
}
