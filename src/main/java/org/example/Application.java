package org.example;

import org.example.conf.JerseyConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Date: 2016/8/13
 * Time: 14:24
 *
 * @author: Zero
 */
@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder();
        builder.sources(Application.class);
        builder.sources(JerseyConf.class);
        SpringApplication application = builder.build();
        ConfigurableApplicationContext context = application.run(args);

        context.registerShutdownHook();
//        SpringApplication.run(Application.class, args);
    }
}
