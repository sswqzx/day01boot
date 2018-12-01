package com.day01sboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ Author     ：ShaoWei Sun.
 * @ Date       ：Created in 0:11 2018/12/1
 */
@MapperScan("com.day01sboot.mapper")//扫包、不用在一个个在mapper接口上加
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
