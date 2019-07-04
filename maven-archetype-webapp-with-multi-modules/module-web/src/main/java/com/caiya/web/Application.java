package com.caiya.web;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 应用启动入口.
 *
 * @author wangnan
 * @since 1.0
 */
@SpringBootApplication(scanBasePackages = "com.caiya", exclude = {DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class})
////@EnableEurekaClient
//@EnableFeignClients(basePackages = "com.caiya")
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).run(args);
    }

}
