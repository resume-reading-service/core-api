package com.resumers.server.oauth.model.dto;

import com.resumers.server.oauth.model.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 */

@Getter
@NoArgsConstructor
public class UserDto {
    private Long userId;
    private String email;
    private String nickname;
    private String description;

    public UserDto(User user) {
        this.userId = user.getUserId();
        this.email = user.getEmail();
        this.nickname = user.getNickname();
        this.description = user.getDescription();
    }

    @Getter
    public class SearchQuery extends UserDto{
        public SearchQuery(){
            super();
        }
    }

    @Getter
    @NoArgsConstructor
    public class InsertUser extends UserDto {
    }
}
