package com.yjl.travel.service;

import com.yjl.travel.model.PageBean;
import com.yjl.travel.model.Route;

import java.util.List;


public interface RouteService {
     PageBean<Route> pageQuery(int cid, int currentPage, int pageSize, String rname);

     Route findOne(int rid);

    /**
     * 随机推荐
     * @return
     */
     List<Route> randomRecommend();

    /**
     * 主题旅游
     * @return
     */
     List<Route> randomSelect_theme();

    /**
     * 特价游
     * @return
     */
     List<Route> randomCheapTravel();
}
