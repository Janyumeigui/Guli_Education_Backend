package com.statistics.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.statistics.mapper")
@ComponentScan(basePackages = {"com"})
public class StatisticsConfig {
}
