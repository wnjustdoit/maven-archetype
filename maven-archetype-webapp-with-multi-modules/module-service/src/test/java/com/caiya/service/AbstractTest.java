package com.caiya.service;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 基于web容器的单元测试基类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AbstractTest.AutoConfig.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class AbstractTest {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @ComponentScan(basePackages = "com.caiya")
    @EnableAutoConfiguration
    public static class AutoConfig {
    }

}
