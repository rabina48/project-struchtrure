package com.example.admin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Properties;

/**
 * @author Rabina Shrestha
 * @EmaiL rabina.shrestha@f1soft.com
 */
@SpringBootApplication()
public class Main extends SpringBootServletInitializer {
    //research-> SpringBootServletInitializer
    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class)
                .sources(Main.class)
                .properties(getProperties())
                .run(args);
    }


    static Properties getProperties() {
        Properties props = new Properties();
        props.put("spring.config.location", PropertyNames.APP);
        return props;
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Main.class)
                .properties(getProperties());
    }
}
