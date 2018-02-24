package com.the.rain.authority.controller;


import com.the.rain.authority.moduls.security.SysUser;
import com.the.rain.authority.service.auth.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengfeiyue
 */
@Controller
public class LoginController {

    @Autowired
    private AuthService authService;

    @RequestMapping(value = "/test/login2")
    public String login(String username,String password) {
        System.err.println("zzzz");
        System.err.println(authService.login(username,password));
        return null;
    }
    @RequestMapping(value = "/home")
    public String home() {
        System.err.println("123");
        return "home";
    }

}
