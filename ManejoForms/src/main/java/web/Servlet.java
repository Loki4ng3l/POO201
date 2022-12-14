package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Estas en el servlet del profe");
        
        String nombre = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[]= request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Tabla de datos</title>");
        out.print("</head>");
        out.print("<body>");
        
        out.print("<h1>Tabla de datos</h1>");
        
        out.print("<table border='1'>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario:");
        out.print("</td>");
        out.print("<td>");
        out.print(nombre);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Contraseña:");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologias:");
        out.print("</td>");
        out.print("<td>");
        
        for(String tecnologia : tecnologias){
            out.print(tecnologia);
            out.print(" / ");
        }
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Genero:");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupacion:");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupacion);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Musica favorita:");
        out.print("</td>");
        out.print("<td>");
        
        if (musica != null) {
            for(String m : musica){
                out.print(m);
                out.print(" / ");
            }
        }else{
            out.print("Valor no proporcionado");
        }
        
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Comentario:");
        out.print("</td>");
        out.print("<td>");
        out.print(comentarios);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("</table>");
        
        out.print("</body>");
        out.print("</html>");
    }
}