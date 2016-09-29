import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.Random;


/**
 * Created by ayeluri on 9/28/2016.
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = (String) req.getAttribute("username");
        String password = (String) req.getAttribute("password");

        req.getSession().setAttribute("username", username);
        String token = (String) req.getSession().getAttribute("token");
        if ((token==null )||token.isEmpty() ) {
            resp.sendError(403, "Unauthorized");
        } else {
            resp.getOutputStream().println("{token :" + token + "");
        }

    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = (String) req.getAttribute("username");
        String password = (String) req.getAttribute("password");


        req.getSession().setAttribute("username", username);
        req.getSession().setAttribute("token", (new Random()).toString());

        String token = (String) req.getSession().getAttribute("token");

        if ((token==null )||token.isEmpty() ) {
            resp.sendError(403, "Unauthorized");
        } else {
            resp.getOutputStream().println("{token :" + token + "");
        }

    }
}
