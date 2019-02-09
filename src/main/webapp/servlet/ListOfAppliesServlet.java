package servlet;

import Db.DatabaseConnector;
import Models.Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/list")
public class ListOfAppliesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Application> applications = DatabaseConnector.getAll();
        PrintWriter out = resp.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<body>");
        out.print("<table border = 1>");
        for ( Application ap: applications) {
            out.print("<tr>");
            out.print("<td>");
            out.print(ap.getFio());
            out.print("</td>");
            out.print("<td>");
            out.print(ap.getEmail());
            out.print("</td>");
            out.print("<td>");
            out.print(ap.getCourse());
            out.print("</td>");
            out.print("</tr>");
        }
        out.print("</table>");
        out.print("</body>");
        out.print("</head>");
        out.print("</html>");
    }
}
