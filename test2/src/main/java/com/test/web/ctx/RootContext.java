package com.test.web.ctx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.test.web"})
@ComponentScan(basePackages = {"com.test.web"})
public class RootContext {

}
