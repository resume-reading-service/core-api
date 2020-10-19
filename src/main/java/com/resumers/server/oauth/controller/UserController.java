package com.resumers.server.oauth.controller;

import com.resumers.server.oauth.model.dto.UserDto;
import com.resumers.server.oauth.model.entity.User;
import com.resumers.server.oauth.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sehajyang
 * DateTime : 2020/10/19
 * Descrpition :
 */

@Slf4j
@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    // TODO : Response 객체 작성
    @GetMapping
    public List<UserDto> findAll(UserDto.SearchQuery userDto){
        return userService.findAll();
    }

    @PostMapping
    public void save(UserDto.InsertUser user) {
        userService.create(user);
    }
}
