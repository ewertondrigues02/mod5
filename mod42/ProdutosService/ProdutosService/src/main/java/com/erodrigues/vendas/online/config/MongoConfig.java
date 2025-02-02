package com.erodrigues.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.erodrigues.vendas.online.repository")
public class MongoConfig {

}