package servlet;

import model.ListPlayer;
import model.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;


@WebServlet(name = "gameRandomServlet", urlPatterns = {"/gameRandom"})
public class gameRandomServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("gameRandom.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = ListPlayer.getName();
        ListPlayer.setCount(ListPlayer.getCount()+1);

        if(req.getParameter("inputNumber").equals("")){
            String messenger ="Vui lòng nhập số cần kiểm tra";
            ListPlayer.setCount(ListPlayer.getCount()-1);
            req.setAttribute("messenger",messenger);
            req.setAttribute("name", name);
            req.getRequestDispatcher("gameRandom.jsp").forward(req,resp);
        }
        int inputNumber = Integer.parseInt(req.getParameter("inputNumber"));
        Random random = new Random();
        int soRandom= random.nextInt(5);
        if(inputNumber<0||inputNumber>5){
            ListPlayer.setCount(ListPlayer.getCount()-1);
            String messenger ="Số vừa nhập không đúng yêu cầu!";
            req.setAttribute("messenger",messenger);
            req.setAttribute("name", ListPlayer.getName());
            req.setAttribute("count",ListPlayer.getCount());
            req.getRequestDispatcher("gameRandom.jsp").forward(req,resp);
        }else if (soRandom<inputNumber){
                String messenger ="Số vừa nhập lớn hơn số ngẫu nhiên";
                req.setAttribute("soRandom",soRandom);
                req.setAttribute("messenger",messenger);
                req.setAttribute("name", ListPlayer.getName());
                req.setAttribute("count",ListPlayer.getCount());
                req.getRequestDispatcher("gameRandom.jsp").forward(req,resp);

            }else
                if(soRandom>inputNumber){
                    String messenger ="Số vừa nhập nhỏ hơn số ngẫu nhiên";
                    req.setAttribute("soRandom",soRandom);
                    req.setAttribute("messenger",messenger);
                    req.setAttribute("name", ListPlayer.getName());
                    req.setAttribute("count",ListPlayer.getCount());
                    req.getRequestDispatcher("gameRandom.jsp").forward(req,resp);
                }else {
                    dumyData();
                    String messenger ="Số vừa nhập đúng với số ngẫu nhiên";
                    Player player = new Player();
                    player.setName(ListPlayer.getName());
                    player.setCount(ListPlayer.getCount()-1);
                    ListPlayer.addPlayer(player);


                    req.setAttribute("messenger",messenger);
                    req.setAttribute("name", ListPlayer.getName());
                    req.setAttribute("count",ListPlayer.getCount());
                    req.setAttribute("list",ListPlayer.getListPlayer());
                    req.getRequestDispatcher("xepHang.jsp").forward(req,resp);
                }

    }
    public void dumyData(){
        Player player = new Player();
        player.setCount(1);
        player.setName("Nguyễn A");
        ListPlayer.addPlayer(player);

        Player player2 = new Player();
        player2.setCount(2);
        player2.setName("Nguyễn B");
        ListPlayer.addPlayer(player2);

        Player player3 = new Player();
        player3.setCount(3);
        player3.setName("Nguyễn C");
        ListPlayer.addPlayer(player3);

        Player player4 = new Player();
        player4.setCount(4);
        player4.setName("Nguyễn D");
        ListPlayer.addPlayer(player4);
    }

//    public  void sortASC () {
//        List<Player> listPlayer1= new ArrayList<>();
//        for (int i = 0 ; i < ListPlayer.getListPlayer().size() - 1; i++) {
//            for (int j = i + 1; j  < ListPlayer.getListPlayer().size(); j++) {
//                if (ListPlayer.getListPlayer().get(i).getCount() > ListPlayer.getListPlayer().get(j).getCount()) {
//                    Player player1 = new Player();
//                    player1.setCount(ListPlayer.getListPlayer().get(j).getCount());
//                    player1.setName(ListPlayer.getListPlayer().get(j).getName());
//
//                    listPlayer1.add(player1);
//                }
//            }
//        }
//    }
}
