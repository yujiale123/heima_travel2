package com.yjl.travel.servlet;

import com.yjl.travel.model.Service;
import com.yjl.travel.service.ServiceService;
import com.yjl.travel.service.ServiceServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/service/*")
public class ServiceServlet extends BaseServlet {
    private ServiceService ser = new ServiceServiceImpl();

    public void findAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Service> all = ser.findAll();
        writeValue(all, request ,response);
    }

    public void findAnswerBySerid(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String serid = request.getParameter("serid");
        int i = Integer.parseInt(serid);
        //request.getSession().setAttribute("serid",i);
        Service answerBySerid = ser.findAnswerBySerid(i);
        writeValue(answerBySerid,request,response);
    }
}
