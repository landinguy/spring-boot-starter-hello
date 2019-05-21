package com.springstudy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.springstudy.service"})
public class HelloServiceAutoConfiguration {
}
