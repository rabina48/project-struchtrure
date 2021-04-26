package com.example.web;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Properties;

@SpringBootApplication(scanBasePackages ={"com.example.web",
                                             "com.example.client"})
public class WebApplication extends SpringBootServletInitializer {
//research-> SpringBootServletInitializer
    public static void main(String[] args) {
        new SpringApplicationBuilder(WebApplication.class)
                .sources(WebApplication.class)
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
        return application.sources(WebApplication.class)
                .properties(getProperties());
    }
}
