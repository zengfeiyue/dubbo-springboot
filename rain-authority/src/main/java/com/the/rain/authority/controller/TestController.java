package com.the.rain.authority.controller;

import com.the.rain.authority.mapper.TestMapper;
import com.the.rain.authority.mapper.security.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author  zfy on 2017/8/24.
 */
@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping("/test")
    public String test1(){
       List<Map>  list = testMapper.select("1");
       System.out.println(list.size());
       return null;
    }

    @RequestMapping("/test2")
    public String test2(){
        List<Map>  list = testMapper.select2("33");
        for (Map map:list) {
            System.err.println(map.get("value"));
        }
        System.out.println(list.size());
        return null;
    }
    @CacheEvict(value = {"select2"}, allEntries = true)
    @RequestMapping("/test3")
    public String test3(){

        return "1213";
    }
    @CacheEvict(value = {"select"}, allEntries = true)
    @RequestMapping("/test4")
    public String test4(){

        return "1213";
    }
}
