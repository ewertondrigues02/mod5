package br.com.ewerton.springmongojpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public class JpaConfig {

    @Configuration
    @EnableJpaRepositories(basePackages = "example.springdata.multistore.customer")
    public class JpaConfig {

    }
}
