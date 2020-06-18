package com.yjl.travel.mapper;

import com.yjl.travel.model.RouteImg;

import java.util.List;


public interface RouteImgMapper {
    /**
     * 根绝rid查询出图片的详细
     * @param rid
     * @return
     */
    public List<RouteImg> findByRid(int rid);
}
