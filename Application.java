package com.logging.practice;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(ConfigProperties.class)
//@ConfigurationPropertiesScan("com.logging.practice.config")
public class Application {

    public static void main(String[] args) {
//        Logger logger = LogManager.getLogger(com.logging.practice.Application.class);

//        Logger log = LoggerFactory.getLogger(com.logging.practice.Application.class);
//
////        logger.info("Info log message");
////        logger.debug("Debug log message");
////        logger.error("Error log message");
//
//        log.info("Info log message");
//        log.debug("Debug log message");
//        log.error("Error log message");

        SpringApplication.run(Application.class);
    }

}
