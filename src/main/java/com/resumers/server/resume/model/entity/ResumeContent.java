package com.resumers.server.resume.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "resume_content")
public class ResumeContent {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resume_content_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resume_id")
    private Resume resume;

    //TODO : point 추가

}
