package com.resumers.server.resume.model.entity;

import com.resumers.server.resume.enums.ResumeType;

import javax.persistence.*;

@Entity
@Table(name = "resume")
public class Resume {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resume_id")
    private Long id;

    private String title;

    @Enumerated(EnumType.STRING)
    private ResumeType type;




}
