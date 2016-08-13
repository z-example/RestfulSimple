package org.example.conf;

import org.example.Application;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created with IntelliJ IDEA.
 * Date: 2016/8/13
 * Time: 15:32
 *
 * @author: Zero
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println(Application.class);

    }
}
