package com.resumers.server.oauth.controller;

import com.resumers.server.oauth.model.dto.ApiResponse;
import com.resumers.server.oauth.model.dto.UserDto;
import com.resumers.server.oauth.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by sehajyang
 * DateTime : 2020/10/19
 */

@Slf4j
@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public ApiResponse<List<UserDto>> findAll(UserDto.SearchQuery userDto){
        return new ApiResponse<>(userService.findAll());
    }

    @PostMapping
    public void save(UserDto.InsertUser user) {
        userService.create(user);
    }
}
