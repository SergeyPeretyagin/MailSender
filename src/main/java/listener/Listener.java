package listener;

import service.EmailSender;
import service.TimerSender;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Properties;

@WebListener
public class Listener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("start");
//        TimerSender.sendByTimer();
//        EmailSender.emailSender();
        System.out.println("method send email - start");
        final String fromEmail = "redteam.intensive@gmail.com";
//        final String toEmail = "zankohannaandreevna@gmail.com"; // нужно будет указать email Юры
        final String toEmail = "wodnyi30@gmail.com"; // нужно будет указать email Юры
        final String password = "Andersen12";

        Properties properties = new Properties();

        properties.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        properties.put("mail.smtp.port", "587"); //TLS Port
        properties.put("mail.smtp.auth", "true"); //enable authentication
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");


        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

//        Session session = Session.getInstance(properties, auth);
//
//        MimeMessage msg = new MimeMessage(session);
//        TimerSender.sendByTimer(fromEmail, toEmail, msg);
        TimerSender.sendByTimer(fromEmail, toEmail, properties, auth);

        System.out.println("listener end");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        EmailSender.emailSender();
    }
}