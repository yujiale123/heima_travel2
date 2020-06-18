package com.yjl.travel.mapper;

import com.yjl.travel.model.Route;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface RouteMapper {
    /**
     * 查询出总记录数
     * @param cid
     * @return
     */
    public int getTotalCount(@Param("cid") int cid, @Param("rname") String rname);

    /**
     * 根据分页查询出每页的记录
     * @param cid 类别id
     * @param start 开始页数
     * @param pageSize 每页条数
     * @return
     */
    public List<Route> findByPage(@Param("cid") int cid, @Param("start") int start, @Param("pageSize") int pageSize, @Param("rname") String rname);

    /**
     * 根据rid查询每个详细线路
     * @param rid
     * @return
     */
    public Route findOne(int rid);

    /**
     * 查询收藏次数
     * @param rid
     * @return
     */
    public int findCountByRid(int rid);

    /**
     * 热门随机推荐
     * @return
     */
    public List<Route> randomSelect();

    /**
     * 主题推荐查询
     * @return
     */
    public List<Route> randomSelect_theme();

    /**
     * 特价游
     * @return
     */
    public List<Route> randomCheapTravel();
}
