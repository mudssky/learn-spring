package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//@ComponentScan("com.mudssky.config")

public class JdbcConfig {
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    private String url;
    @Value("root")
    private String userName;
    private String password;


    //   1. 定义一个方法获得要管理的对象
    // 2.添加@Bean，表示当前方法的返回值是Bean
    @Bean
    public DataSource dataSource(BookDao bookDao) {
        bookDao.save();
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername(userName);
        ds.setPassword("root");
        return ds;
    }
}
