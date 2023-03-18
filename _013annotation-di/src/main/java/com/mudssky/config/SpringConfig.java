package com.mudssky.dao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author mudssky
 */
@Configuration
@ComponentScan("com.mudssky")
@PropertySource("config.properties")
public class SpringConfig {

}
