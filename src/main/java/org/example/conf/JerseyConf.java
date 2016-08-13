package org.example.conf;

import org.example.Application;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ext.Provider;

/**
 * Created with IntelliJ IDEA.
 * Date: 2016/8/13
 * Time: 14:26
 *
 * @author: Zero
 */
@Component
@Provider
public class JerseyConf extends ResourceConfig {


    public JerseyConf() {
        System.out.println("------JerseyConf----------");
    }

    @PostConstruct
    private void init() {
//        register(JacksonJsonProvider.class);//MessageBodyWriter
        register(MultiPartFeature.class);//添加multipart/form-data 支持
        packages(Application.class.getPackage().getName());
    }


}
