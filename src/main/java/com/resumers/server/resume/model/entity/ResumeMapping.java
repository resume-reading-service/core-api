package com.resumers.server.resume.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "resume_mapping")
public class ResumeMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resume_mapping_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resume_id")
    private Resume resume;

}
