package com.logging.practice.dal;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by kparobo.abala 27/02/2020
 **/

@Configuration
@EnableMongoRepositories(basePackages = "com.logging.pratice.secondary.repository", mongoTemplateRef = "secondaryMongoTemplate")
public class SecondaryMongoDbConfig {
}
