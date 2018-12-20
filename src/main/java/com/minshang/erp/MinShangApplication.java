package com.minshang.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName MinShangApplication
 * @Description 安少爷启动类
 * @Author 安少爷
 * @Date 2018/12/15 0015
 * @Version 1.0
 **/
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@EnableTransactionManagement
@ServletComponentScan
@SpringBootApplication
@EnableCaching
public class MinShangApplication {
    public static void main(String[] args) {
        SpringApplication.run(MinShangApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    安少爷米线系统启动成功 我爱鹿晗！！    ヾ(◍°∇°◍)ﾉﾞ");
    }
}

