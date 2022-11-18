package com.design.patterns.creational_patterns.singleton.usage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

  @Bean
  public String hello(){
    return "hello";
  }

}
