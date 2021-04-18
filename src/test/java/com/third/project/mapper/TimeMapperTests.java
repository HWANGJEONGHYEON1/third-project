package com.third.project.mapper;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TimeMapperTests {
    private static final Logger log = LoggerFactory.getLogger(TimeMapperTests.class);
    @Autowired
    private TimeMapper timeMapper;

    @Test
    void timeMapperTest() {
        log.info("============");
        log.info(timeMapper.getClass().getName());
        log.info(timeMapper.getTime());
    }
}
