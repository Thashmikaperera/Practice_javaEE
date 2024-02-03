package lk.ijse.gdse65.task;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "params", value = "/hello")
public class Params extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String city=req.getParameter("city");
        System.out.println("name"+name);
        System.out.println("city"+city);
    }
}