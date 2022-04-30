package club.volleyball.sit;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "schedule",value = "/schedule")
public class Schedule extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        RequestDispatcher dispatcher = request.getRequestDispatcher("pages/schedule.jsp");
        dispatcher.forward(request,response);
    }

    public void destroy() {
    }
}
