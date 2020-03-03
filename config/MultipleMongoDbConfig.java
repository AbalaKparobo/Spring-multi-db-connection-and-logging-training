package com.logging.practice.config;

        import org.springframework.boot.autoconfigure.mongo.MongoProperties;
        import org.springframework.boot.context.properties.ConfigurationProperties;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.Primary;
        import org.springframework.data.mongodb.MongoDbFactory;
        import org.springframework.data.mongodb.core.MongoTemplate;
        import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
        import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
        import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by kparobo.abala 20/02/2020
 **/

@Configuration
public class MultipleMongoDbConfig {

    @Primary
    @Bean(name = "priamry")
    @ConfigurationProperties(prefix = "spring.data.mongodb")
    public MongoProperties getPrimaryMongoDb() {
        return new MongoProperties();
    }

    @Bean(name = "secondary")
    @ConfigurationProperties(prefix = "mongodb")
    public MongoProperties getSecondaryMongoDb() {
        return new MongoProperties();
    }

    @Primary
    @Bean
    public MongoDbFactory primaryMongoFactory(final MongoProperties mongo) {
        String connectionUri = "mongodb://" + mongo.getHost() + ":" + mongo.getPort() + "/" + mongo.getDatabase();
        return new SimpleMongoClientDbFactory(connectionUri);
    }

    @Bean
    public MongoDbFactory secondaryMongoFactory(final MongoProperties mongo) {
        String connectionUri = "mongodb://" + mongo.getHost() + ":" + mongo.getPort() + "/" + mongo.getDatabase();
        return new SimpleMongoClientDbFactory(connectionUri);
    }

    @Primary
    @Bean()
    public MongoTemplate primaryMongoTemplate() {
        return new MongoTemplate(primaryMongoFactory(getPrimaryMongoDb()));
    }

    @Bean
    public MongoTemplate secondaryMongoTemplate() {
        return new MongoTemplate(secondaryMongoFactory(getSecondaryMongoDb()));
    }
}
