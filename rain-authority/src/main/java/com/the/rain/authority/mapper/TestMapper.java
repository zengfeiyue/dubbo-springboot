package com.the.rain.authority.mapper;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Map;

/**
 * @author zengfy
 */
@CacheConfig(cacheNames = "tests")
public interface TestMapper {
    @Cacheable(value = "select")
    public List<Map> select(String id);

    @Cacheable(value = "select2")
    public List<Map> select2(String id);
}
