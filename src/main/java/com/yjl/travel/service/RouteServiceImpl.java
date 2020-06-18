package com.yjl.travel.service;

import com.yjl.travel.dao.RouteDao;
import com.yjl.travel.dao.RouteImgDao;
import com.yjl.travel.dao.SellerDao;
import com.yjl.travel.model.PageBean;
import com.yjl.travel.model.Route;
import com.yjl.travel.model.RouteImg;
import com.yjl.travel.model.Seller;

import java.util.List;


public class RouteServiceImpl implements RouteService {
    private RouteDao dao = new RouteDao();
    private RouteImgDao routeImgDao = new RouteImgDao();
    private SellerDao sellerDao = new SellerDao();
    /**
     * 把分页的数据进行封装
     * @param cid
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public PageBean<Route> pageQuery(int cid, int currentPage, int pageSize, String rname) {
        PageBean<Route> pb = new PageBean<Route>();
        //设置当前页码
        pb.setCurrentPage(currentPage);
        //设置每页条数
        pb.setPageSize(pageSize);
        //设置总记录数
        int totalCount = dao.getTotalCount(cid,rname);
        pb.setTotalCount(totalCount);

        int start = (currentPage - 1) * pageSize;
        //存放每页数据
        pb.setList(dao.findByPage(cid,start,pageSize,rname));

        //计算总页数
        int totalPageCount = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
        pb.setTotalPage(totalPageCount);

        return pb;
    }

    /**
     * 根据rid查询Route
     * @param rid
     * @return
     */
    @Override
    public Route findOne(int rid) {
        Route one = dao.findOne(rid);

        //给one对象中存放详情图片，卖家信息
        List<RouteImg> imgs = routeImgDao.findByrid(rid);
        Seller seller = sellerDao.findSellerBySid(one.getSid());

        one.setRouteImgList(imgs);
        one.setSeller(seller);

        //查询收藏次数，查出来存放到count中
        int count = dao.findCountByRid(rid);
        one.setCount(count);

        return one;
    }

    @Override
    public List<Route> randomRecommend() {
        return dao.randomSelect();
    }

    @Override
    public List<Route> randomSelect_theme() {
        return dao.randomSelect_theme();
    }

    @Override
    public List<Route> randomCheapTravel() {
        return dao.randomCheapTravel();
    }
}
