package com.resumers.server.oauth.model.entity;

import com.fasterxml.jackson.databind.ser.Serializers;

import javax.persistence.*;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 */

// FIXME : 상속관계로 수정 필요
@Entity
@Table(name = "user_resume_view")
public class UserResumeView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_resume_view_id")
    private Long userResumeViewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // FIXME : resume 엔티티 작성시 주석해제 필요
//    @ManyToOne
//    @JoinColumn(name = "resume_id")
//    private Resume resume;
}
