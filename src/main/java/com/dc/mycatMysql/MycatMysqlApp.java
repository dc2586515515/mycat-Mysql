package com.dc.mycatMysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author DC
 * @Date 2020-05-08
 */
@SpringBootApplication
@MapperScan("com.dc.mycatMysql.mapper")
public class MycatMysqlApp {
    public static void main(String[] args) {
        SpringApplication.run(MycatMysqlApp.class, args);
    }
}
