package com.logging.practice.dal;

import com.mongodb.MongoClientOptions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by kparobo.abala 20/02/2020
 **/

@Configuration
@EnableMongoRepositories(basePackages = "com.logging.practice.primary.repository", mongoTemplateRef = "primaryMongoTemplate")
public class PrimaryMongoDbConfig {

//    @Bean
//    public MongoClientOptions mongoOptions(@Qualifier("primaryMongoTemplate") MongoDbFactory primaryMongoTemplate) {
//
//        return MongoClientOptions.builder().socketTimeout(1000).build();
//    }
}
