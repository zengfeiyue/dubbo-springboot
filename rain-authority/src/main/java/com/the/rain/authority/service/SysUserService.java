package com.the.rain.authority.service;


import com.the.rain.authority.mapper.security.SysUserMapper;
import com.the.rain.authority.moduls.security.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zengfeiyue
 */
@Service
public class SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;

	public SysUser getById(Integer id) {
		SysUser user = sysUserMapper.getById(id);
		return user;
	}
	

}