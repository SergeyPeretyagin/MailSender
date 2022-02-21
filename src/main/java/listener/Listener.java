package listener;

import service.EmailSender;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("start");
//        TimerSender.sendByTimer();
        EmailSender.emailSender();

        System.out.println("listener end");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}