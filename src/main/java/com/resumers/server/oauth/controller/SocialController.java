package com.resumers.server.oauth.controller;

import com.resumers.server.oauth.service.SocialService;
import com.resumers.server.oauth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 */

@Validated
@RestController
@RequestMapping
@RequiredArgsConstructor
public class SocialController {
    private UserService userService;
    private SocialService socialService;
}
