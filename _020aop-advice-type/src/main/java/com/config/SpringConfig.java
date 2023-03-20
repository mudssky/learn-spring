package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * @author mudssky
 */
@Configuration
@ComponentScan("com.mudssky")
@PropertySource("config.properties")
@EnableAspectJAutoProxy
public class SpringConfig {

}
