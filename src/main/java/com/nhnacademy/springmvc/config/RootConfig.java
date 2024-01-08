package com.nhnacademy.springmvc.config;

import com.nhnacademy.springmvc.Base;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackageClasses = Base.class,
    excludeFilters = { @ComponentScan.Filter(Controller.class)}) // bean등록 안하는 조건
public class RootConfig {
}
