package com.example.aspectj.business;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.example.aspectj.business","com.example.aspectj.aspects"})
public class ApplicationContextConfiguration {

}
