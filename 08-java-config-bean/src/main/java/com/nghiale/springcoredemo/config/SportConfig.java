package com.nghiale.springcoredemo.config;

import com.nghiale.springcoredemo.common.Coach;
import com.nghiale.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("beanID")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
