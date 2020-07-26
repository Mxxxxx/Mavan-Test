package Mx.servlet;

import Mx.model.Response;
import Mx.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Meng Xin
 * @Date 2020/7/26 16:08
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //2
        resp.setContentType("application/json");
        //3
        PrintWriter writer = resp.getWriter();
        Response r = new Response();
        r.setCode("codeOK");
        r.setMessage("操作成功");
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        r.setData(list);
        writer.println(JSONUtil.write(r));
        writer.flush();
    }
}
