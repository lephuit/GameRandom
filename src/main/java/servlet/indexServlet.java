package servlet;

import model.ListPlayer;
import model.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "indexServlet",urlPatterns = {"/index"})
public class indexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        ListPlayer.setName(name);
        ListPlayer.setCount(1);
        if(name.equals("")){
            String messenger = "Vui lòng nhập tên người chơi";
            req.setAttribute("messenger", messenger);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }else {
            req.setAttribute("name", name);
            req.setAttribute("count",ListPlayer.getCount());
            req.getRequestDispatcher("gameRandom.jsp").forward(req,resp);

        }
    }
}
