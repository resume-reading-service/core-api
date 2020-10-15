package com.resumers.server.oauth.model.entity;

import com.resumers.server.oauth.enums.UserStatusType;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 */

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    private String email;
    private String password;
    private String nickname;

    @OneToOne(mappedBy = "user")
    private File file;

    @Column(length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    private UserStatusType status;
    private Long level;

    @OrderBy("userCompanyId asc")
    @OneToMany(mappedBy = "user")
    private Set<UserCompany> userCompanies = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<UserResumeLike> userResumeLikes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<UserResumeView> userResumeViews = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private Set<UserSocial> userSocials = new LinkedHashSet<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private UserDetail userDetail;

    @OneToMany(mappedBy = "user")
    private Set<UserTag> userTags = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<UserCategory> userCategories = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<UserPenalty> userPenalties = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns =  @JoinColumn(name ="user_id"), inverseJoinColumns= @JoinColumn(name="role_id"))
    private Set<Role> roles = new LinkedHashSet<>();

}
