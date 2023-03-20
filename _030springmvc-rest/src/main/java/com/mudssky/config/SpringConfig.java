package com.mudssky.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan({"com.mudssky.service","com.mudssky.dao"})
@ComponentScan(value = "com.mudssky")
public class SpringConfig {
}
