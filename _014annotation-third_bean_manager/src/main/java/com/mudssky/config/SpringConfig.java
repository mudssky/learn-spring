package com.mudssky.dao.config;

import com.mudssky.config.JdbcConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author mudssky
 */
@Configuration
@ComponentScan("com.mudssky")
@PropertySource("config.properties")
@Import(JdbcConfig.class)
public class SpringConfig {

}
