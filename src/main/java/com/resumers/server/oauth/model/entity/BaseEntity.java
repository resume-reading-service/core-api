package com.resumers.server.oauth.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 */

@MappedSuperclass
@NoArgsConstructor
public class BaseEntity {

    @PrePersist
    public void prePersist() {
        this.deletedAt = null;
        this.createdAt = this.createdAt == null ? LocalDateTime.now() : this.createdAt;
        this.updatedAt = LocalDateTime.now();
        // TODO : updated_user_id, created_user_id
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
        // TODO : updated_user_id
    }

    @JsonIgnore
    @Column(name = "create_at", updatable = false)
    private LocalDateTime createdAt;

    @JsonIgnore
    @Column(name = "create_user_id", updatable = false)
    private LocalDateTime createdUserId;

    @JsonIgnore
    private LocalDateTime updatedAt;

    @JsonIgnore
    private LocalDateTime updatedUserId;

    @JsonIgnore
    private LocalDateTime deletedAt;

    public void deleteData() {
        this.deletedAt = LocalDateTime.now();
    }
}
