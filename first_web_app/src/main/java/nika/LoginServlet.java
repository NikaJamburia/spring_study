package nika;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        System.out.println(name);

        if (name == null){
            request.setAttribute("name", "User");
        }
        else {
            request.setAttribute("name", name);
        }

        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }
}
