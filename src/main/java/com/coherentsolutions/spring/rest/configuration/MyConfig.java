package com.coherentsolutions.spring.rest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.coherentsolutions.spring.rest")
@EnableWebMvc
public class MyConfig {

}
