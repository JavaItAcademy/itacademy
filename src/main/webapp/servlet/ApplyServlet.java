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

@WebServlet("/add_apply")
public class ApplyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Application application = null;
        System.out.println(req.getParameter("isOnline"));
        boolean result;
        try {

            application = new Application(
                    req.getParameter("fio"),
                    req.getParameter("courses"),
                    req.getParameter("email"),
                    req.getParameter("isOnline") != null
             );
            result = DatabaseConnector.addApplication(application);

        }
        catch (NullPointerException e) {
            System.out.println(e);
            result = false;
        }
        PrintWriter out = resp.getWriter();
        out.println(result ? "Заявка успешно добавлена" : "Не получилось добавить заявку");
    }
}
