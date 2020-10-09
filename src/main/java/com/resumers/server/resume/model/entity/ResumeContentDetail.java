package com.resumers.server.resume.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "resume_content_detail")
public class ResumeContentDetail {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resume_content_detail_id")
    private Long id;



}
