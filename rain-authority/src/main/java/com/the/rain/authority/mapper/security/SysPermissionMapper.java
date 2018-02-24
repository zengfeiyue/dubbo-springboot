package com.the.rain.authority.mapper.security;



import com.the.rain.authority.moduls.security.SysPermission;

import java.util.List;
import java.util.Map;

/**
 * @author zengfeiyue
 */
public interface SysPermissionMapper {

    List<SysPermission> getByMap(Map<String, Object> map);

    SysPermission getById(Integer id);

    Integer create(SysPermission sysPermission);

    int update(SysPermission sysPermission);

    List<SysPermission> getByUserId(Integer userId);

}