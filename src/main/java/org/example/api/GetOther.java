package org.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Date: 2016/8/13
 * Time: 18:31
 *
 * @author: Zero
 */
@Component
public class GetOther {


    @Autowired
    private Environment env;

    @Value("${server.port}")
    private String serverPort;


    @PostConstruct
    public void init() {
        System.out.println(this.serverPort);
    }

    /*
    * see: <a href="http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-spring-application.html">SpringApplication</a>
    * */
    @Autowired
    public GetOther(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
        // if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
    }

}
