package listener;

import service.EmailSender;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class Serv extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Serv");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("Hello java");
        EmailSender.emailSender();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServServ");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("Hello java1");
    }
}
