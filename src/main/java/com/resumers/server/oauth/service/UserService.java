package com.resumers.server.oauth.service;

import com.common.Utils;
import com.resumers.server.oauth.model.dto.UserDto;
import com.resumers.server.oauth.model.entity.User;
import com.resumers.server.oauth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDto> findAll() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void create(UserDto userDto) {
        if (Utils.isNotEmpty(userDto)) {
            validation(userDto.getEmail(), userDto.getNickname());
            User user = new User(userDto);
            userRepository.save(user);
        }
    }

    // TODO : CustomException 만들어서 log error 라인 수정
    private void validation(String email, String nickname) {
        if (Utils.isEmpty(email) || Utils.isEmpty(nickname)) {
            log.error("BAD REQUEST EXCEPTION");
        }
        userRepository.findAllByEmailOrNickname(email, nickname)
                .ifPresent(user -> log.error("DUPLICATION ERROR"));
    }
}
