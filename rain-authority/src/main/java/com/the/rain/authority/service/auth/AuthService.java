package com.the.rain.authority.service.auth;

import com.the.rain.authority.moduls.security.SysUser;

/**
 * @author zengfeiyue
 */
public interface AuthService {
    /**
     * 注册
     * @param userToAdd
     * @return
     */
    SysUser register(SysUser userToAdd);

    /**
     * login get token
     * @param username
     * @param password
     * @return token
     */
    String login(String username, String password);

    /**
     * 刷新token
     * @param oldToken
     * @return
     */
    String refresh(String oldToken);
}
