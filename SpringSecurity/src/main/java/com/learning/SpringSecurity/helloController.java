package com.learning.SpringSecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/")
    public String say(HttpServletRequest request) {
        return "halloooooo " + request.getSession().getId() + "!";
    }
}
