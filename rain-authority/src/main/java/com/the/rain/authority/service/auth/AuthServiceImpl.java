package com.the.rain.authority.service.auth;

import com.the.rain.authority.core.jwt.JwtTokenAuthentication;
import com.the.rain.authority.core.security.UrlUserService;
import com.the.rain.authority.core.utils.MD5Util;
import com.the.rain.authority.moduls.security.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zengfeiyue
 */
@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UrlUserService urlUserService;

    @Override
    public SysUser register(SysUser userToAdd) {
        return null;
    }

    @Override
    public String login(String username, String password) {
        try {
            UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(username, MD5Util.encode(password));
            final Authentication authentication = authenticationManager.authenticate(upToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            final String token = JwtTokenAuthentication.getToken(authentication.getName(), (List<GrantedAuthority>) authentication.getAuthorities());
            return token;
        }catch (Exception e){
            return e.getMessage();
        }


    }

    @Override
    public String refresh(String oldToken) {
        return null;
    }
}
