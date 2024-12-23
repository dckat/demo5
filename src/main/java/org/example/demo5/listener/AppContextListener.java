package org.example.demo5.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Web application started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Web application stopped");
    }
}
