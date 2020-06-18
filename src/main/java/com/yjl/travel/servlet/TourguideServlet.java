package com.yjl.travel.servlet;

import com.yjl.travel.model.Tourguide;
import com.yjl.travel.service.TourguideService;
import com.yjl.travel.service.TourguideServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/tourguide/*")
public class TourguideServlet extends BaseServlet {
    private TourguideService service = new TourguideServiceImpl();

    public void findAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Tourguide> all = service.findAll();
        writeValue(all, request, response);
    }

    public void findTourguideByid(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String tidStr = request.getParameter("tid");
        int i = Integer.parseInt(tidStr);
        Tourguide tourguideByid = service.findTourguideByid(i);
        writeValue(tourguideByid,request,response);
    }
}
