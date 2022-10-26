package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lokil
 */
@WebServlet("/ServletM")
public class ServletM extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        
        out.print("<h1>Respuesta del servidor</h1>");
        
        out.print("<a href = '/EEIntroISSC201/index.jsp'>Inicio</a>");
        
        out.print("<h2>");
        for (int i = 0; i < 10; i++) {
            out.print(i);
            out.print("<p>");
            
            // It doesn't works
            System.out.println("/n");
        }     
        out.print("<h2>");
    }
}